/*
 Navicat Premium Data Transfer

 Source Server         : ry
 Source Server Type    : MySQL
 Source Server Version : 50559
 Source Host           : localhost:3306
 Source Schema         : libdb

 Target Server Type    : MySQL
 Target Server Version : 50559
 File Encoding         : 65001

 Date: 22/11/2022 22:08:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admin_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `admin_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `admin_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `admin_statue` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '1',
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for author
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author`  (
  `author_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `author_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `author_sex` enum('男','女') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `author_location` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `author_introduction` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`author_id`) USING BTREE,
  INDEX `名称`(`author_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for balance
-- ----------------------------
DROP TABLE IF EXISTS `balance`;
CREATE TABLE `balance`  (
  `op_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `client_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `op_amount` decimal(10, 2) NOT NULL,
  `op_type` enum('充值','提现','零售','借阅') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`op_time`, `client_id`) USING BTREE,
  INDEX `操作时间`(`op_time`) USING BTREE,
  INDEX `操作类型`(`op_type`) USING BTREE,
  INDEX `客户`(`client_id`) USING BTREE,
  CONSTRAINT `客户` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `book_id` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_isbn` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `publisher_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_price` decimal(10, 2) NOT NULL,
  `book_total_num` smallint(3) NOT NULL,
  `book_now_num` smallint(3) NOT NULL,
  `book_reserve_num` smallint(3) NULL DEFAULT NULL,
  `book_author_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_introduction` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_type_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`book_id`) USING BTREE,
  INDEX `ISBN`(`book_isbn`) USING BTREE,
  INDEX `名称`(`book_name`) USING BTREE,
  INDEX `出版社`(`publisher_id`) USING BTREE,
  INDEX `作者`(`book_author_id`) USING BTREE,
  INDEX `类型`(`book_type_id`) USING BTREE,
  CONSTRAINT `出版社` FOREIGN KEY (`publisher_id`) REFERENCES `publisher` (`publisher_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `作者` FOREIGN KEY (`book_author_id`) REFERENCES `author` (`author_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `类型` FOREIGN KEY (`book_type_id`) REFERENCES `type` (`type_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for borrow
-- ----------------------------
DROP TABLE IF EXISTS `borrow`;
CREATE TABLE `borrow`  (
  `client_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_id` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `borrow_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `expiry_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `renew_num` smallint(2) NOT NULL,
  `borrow_status` enum('在借','归还') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `return_date` timestamp NULL DEFAULT NULL,
  `deduction_type` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deduction_amount` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`client_id`, `book_id`, `borrow_date`) USING BTREE,
  INDEX `时间`(`borrow_date`) USING BTREE,
  INDEX `book_id`(`book_id`) USING BTREE,
  CONSTRAINT `borrow_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `borrow_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client`  (
  `client_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_phone` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `client_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_sex` enum('男','女') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vip_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_balance` decimal(10, 2) NOT NULL,
  `client_status` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_borrow_num` smallint(2) NOT NULL,
  PRIMARY KEY (`client_id`) USING BTREE,
  INDEX `名称`(`client_name`) USING BTREE,
  INDEX `手机`(`client_phone`) USING BTREE,
  INDEX `vip_id`(`vip_id`) USING BTREE,
  CONSTRAINT `client_ibfk_1` FOREIGN KEY (`vip_id`) REFERENCES `vip` (`vip_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for publisher
-- ----------------------------
DROP TABLE IF EXISTS `publisher`;
CREATE TABLE `publisher`  (
  `publisher_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `publisher_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `publisher_phone` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `publisher_location` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `publisher_introduction` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`publisher_id`) USING BTREE,
  INDEX `名称`(`publisher_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for reserve
-- ----------------------------
DROP TABLE IF EXISTS `reserve`;
CREATE TABLE `reserve`  (
  `reserve_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `client_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_id` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `reserve_expriy_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`reserve_date`, `client_id`, `book_id`) USING BTREE,
  INDEX `client_id`(`client_id`) USING BTREE,
  INDEX `book_id`(`book_id`) USING BTREE,
  CONSTRAINT `reserve_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `reserve_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type`  (
  `type_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type_class` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type_category` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for vip
-- ----------------------------
DROP TABLE IF EXISTS `vip`;
CREATE TABLE `vip`  (
  `vip_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `vip_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `vip_deposit` decimal(10, 2) NOT NULL COMMENT '押金',
  `vip_rent_discount` decimal(5, 4) NOT NULL,
  `vip_sell_discount` decimal(5, 4) NOT NULL,
  `vip_borrow_num` smallint(2) NOT NULL,
  `vip_renew` smallint(2) NOT NULL COMMENT '可续借次数',
  `vip_borrow_date` smallint(4) NOT NULL COMMENT '可借阅天数',
  `vip_time` smallint(2) NOT NULL COMMENT '预约保留时间',
  `vip_overdue` decimal(4, 2) NOT NULL COMMENT '逾期扣费',
  `vip_damage` decimal(4, 2) NOT NULL COMMENT '损坏扣费',
  `vip_lose` decimal(4, 2) NOT NULL COMMENT '丢失扣费',
  PRIMARY KEY (`vip_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;

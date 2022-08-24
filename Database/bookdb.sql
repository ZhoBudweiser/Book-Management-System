/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50559
 Source Host           : localhost:3308
 Source Schema         : bookdb

 Target Server Type    : MySQL
 Target Server Version : 50559
 File Encoding         : 65001

 Date: 25/06/2022 21:24:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for balance
-- ----------------------------
DROP TABLE IF EXISTS `balance`;
CREATE TABLE `balance`  (
  `opTime` datetime NOT NULL,
  `clientPhone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `opAmount` decimal(10, 2) NOT NULL,
  `opType` enum('充值','提现','零售','借阅') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`opTime`, `clientPhone`) USING BTREE,
  INDEX `客户手机号`(`clientPhone`) USING BTREE,
  CONSTRAINT `客户手机号` FOREIGN KEY (`clientPhone`) REFERENCES `client` (`clientPhone`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of balance
-- ----------------------------
INSERT INTO `balance` VALUES ('2022-06-11 20:47:59', '18856316698', 100.00, '充值');
INSERT INTO `balance` VALUES ('2022-06-16 00:00:00', '14790409310', 100.00, '充值');
INSERT INTO `balance` VALUES ('2022-06-16 15:55:03', '14790409310', 1.00, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 15:55:41', '14790409310', 100.00, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 15:57:05', '14790409310', 100.00, '充值');
INSERT INTO `balance` VALUES ('2022-06-16 15:57:18', '14790409310', 50.00, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:01:49', '14790409310', 2.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:01:49', '18856316698', 2.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:06:32', '14790409310', 23.00, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:06:32', '18856316698', 23.00, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:10:58', '14790409310', 1.15, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:10:58', '18856316698', 1.15, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:11:03', '14790409310', 23.00, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:11:03', '18856316698', 23.00, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:13:20', '14790409310', 1.35, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:13:20', '18856316698', 1.35, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:14:17', '14790409310', 33.75, '提现');
INSERT INTO `balance` VALUES ('2022-06-16 16:14:17', '18856316698', 33.75, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 00:43:58', '13616644404', 100.00, '充值');
INSERT INTO `balance` VALUES ('2022-06-17 00:45:49', '13616644404', 1.35, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 00:45:49', '14790409310', 1.35, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 00:45:49', '18856316698', 1.35, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 00:48:47', '13616644404', 17.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 00:48:47', '14790409310', 17.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 00:48:47', '18856316698', 17.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:19:47', '13999999900', 100.00, '充值');
INSERT INTO `balance` VALUES ('2022-06-17 08:20:28', '13616644404', 1.35, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:20:28', '13811199220', 1.35, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:20:28', '13999999900', 1.35, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:20:28', '14790409310', 1.35, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:20:28', '18856316698', 1.35, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:20:36', '13616644404', 34.20, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:20:36', '13811199220', 34.20, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:20:36', '13999999900', 34.20, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:20:36', '14790409310', 34.20, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:20:36', '18856316698', 34.20, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:29:24', '13999999955', 100.00, '充值');
INSERT INTO `balance` VALUES ('2022-06-17 08:29:32', '14790409310', 100.00, '充值');
INSERT INTO `balance` VALUES ('2022-06-17 08:29:44', '18856316698', 100.00, '充值');
INSERT INTO `balance` VALUES ('2022-06-17 08:30:29', '13616644404', 2.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:30:29', '13811199220', 2.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:30:29', '13999999900', 2.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:30:29', '13999999955', 2.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:30:29', '14790409310', 2.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 08:30:29', '18856316698', 2.25, '提现');
INSERT INTO `balance` VALUES ('2022-06-17 09:36:06', '13616644404', 50.00, '提现');
INSERT INTO `balance` VALUES ('2022-06-25 20:51:11', '14790409310', 100.00, '充值');

-- ----------------------------
-- Table structure for booknew
-- ----------------------------
DROP TABLE IF EXISTS `booknew`;
CREATE TABLE `booknew`  (
  `bookISBN` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookPublish` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookPrice` decimal(10, 2) NOT NULL,
  `bookTotalNum` smallint(3) NOT NULL,
  `bookNowNum` smallint(3) NOT NULL,
  `bookReserveNum` smallint(3) NOT NULL,
  `bookUnit` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookAuthor` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookIntroduction` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bookType` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookCategory` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`bookISBN`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of booknew
-- ----------------------------
INSERT INTO `booknew` VALUES ('01', '新青年', '人民文学出版社', 2.00, 10, 10, 0, '本', '新青年', '', '期刊', '文学');
INSERT INTO `booknew` VALUES ('1', '数据挖掘', '清华出版社', 23.00, 19, 15, 1, '本', '沈玉', '', '书籍', '计算机');
INSERT INTO `booknew` VALUES ('123412', 'q', 'qq', 10.00, -20, -20, 0, '本', 'aa', '', '书籍', '文学');
INSERT INTO `booknew` VALUES ('12345', '活着', '人民文学出版社', 45.00, 15, 15, 1, '本', '余华', '', '书籍', '文学');
INSERT INTO `booknew` VALUES ('123456', '数据库', '高等教育出版社', 55.00, 15, 15, 0, '本', '沈明', '', '书籍', '计算机');
INSERT INTO `booknew` VALUES ('12346', '围城', '人民文学出版社', 56.00, 3, 2, 0, '本', '钱钟书', NULL, '书籍', '文学');

-- ----------------------------
-- Table structure for borrow
-- ----------------------------
DROP TABLE IF EXISTS `borrow`;
CREATE TABLE `borrow`  (
  `clientPhone` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookISBN` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `borrowDate` date NOT NULL,
  `expiryDate` date NOT NULL,
  `renewNum` smallint(2) NOT NULL,
  `borrowStatus` enum('在借','归还') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `returnDate` date NULL DEFAULT NULL,
  `deductionType` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deductionAmount` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`clientPhone`, `bookISBN`, `borrowDate`) USING BTREE,
  INDEX `ISBN`(`bookISBN`) USING BTREE,
  INDEX `time`(`borrowDate`) USING BTREE,
  CONSTRAINT `ISBN` FOREIGN KEY (`bookISBN`) REFERENCES `booknew` (`bookISBN`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `客户ID` FOREIGN KEY (`clientPhone`) REFERENCES `client` (`clientPhone`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of borrow
-- ----------------------------
INSERT INTO `borrow` VALUES ('13616644404', '12345', '2022-06-17', '2022-08-16', 0, '在借', NULL, NULL, NULL);
INSERT INTO `borrow` VALUES ('13999999900', '12345', '2022-06-17', '2022-08-16', 0, '在借', '2022-06-17', NULL, 0.00);
INSERT INTO `borrow` VALUES ('13999999955', '12345', '2022-06-17', '2022-07-17', 0, '在借', NULL, NULL, NULL);
INSERT INTO `borrow` VALUES ('14790409310', '1', '2022-06-16', '2022-07-16', 0, '在借', '2022-06-16', NULL, 0.00);
INSERT INTO `borrow` VALUES ('14790409310', '12345', '2022-06-16', '2022-07-16', 0, '在借', '2022-06-16', NULL, 0.00);
INSERT INTO `borrow` VALUES ('18856316698', '1', '2022-06-16', '2022-07-16', 0, '在借', '2022-06-17', NULL, 0.00);
INSERT INTO `borrow` VALUES ('18856316698', '12345', '2022-06-16', '2022-07-16', 0, '在借', '2022-06-17', NULL, 0.00);

-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client`  (
  `clientPhone` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `clientName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `clientSex` enum('男','女') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `clientGrade` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `clientBalance` decimal(10, 2) NOT NULL,
  `clientStatus` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `clientBorrowNum` smallint(2) NOT NULL,
  PRIMARY KEY (`clientPhone`) USING BTREE,
  INDEX `clientPhone`(`clientPhone`) USING BTREE,
  INDEX `会员等级`(`clientGrade`) USING BTREE,
  INDEX `名称`(`clientName`) USING BTREE,
  CONSTRAINT `会员等级` FOREIGN KEY (`clientGrade`) REFERENCES `vip` (`vipName`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO `client` VALUES ('13616644404', 'super', '男', '黄金会员', -6.40, '正常', 1);
INSERT INTO `client` VALUES ('13811199220', 'zbw', '男', '普通会员', -37.80, '注销', 0);
INSERT INTO `client` VALUES ('13999999333', 'ZZZZ1', '男', '黄金会员', 0.00, '注销', 0);
INSERT INTO `client` VALUES ('13999999900', 'ZZ1', '男', '黄金会员', 62.20, '正常', 1);
INSERT INTO `client` VALUES ('13999999955', 'zzzz', '男', '普通会员', 97.75, '正常', 1);
INSERT INTO `client` VALUES ('14790409310', '张一2', '女', '普通会员', 177.18, '正常', 2);
INSERT INTO `client` VALUES ('18856316698', '橙子', '女', '普通会员', 59.10, '正常', 2);

-- ----------------------------
-- Table structure for reserve
-- ----------------------------
DROP TABLE IF EXISTS `reserve`;
CREATE TABLE `reserve`  (
  `reserveDate` date NOT NULL,
  `clientPhone` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookISBN` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `reserveExpriyDate` date NOT NULL,
  PRIMARY KEY (`reserveDate`, `clientPhone`, `bookISBN`) USING BTREE,
  INDEX `客户手机号_RES`(`clientPhone`) USING BTREE,
  INDEX `ISBN_RES`(`bookISBN`) USING BTREE,
  CONSTRAINT `ISBN_RES` FOREIGN KEY (`bookISBN`) REFERENCES `booknew` (`bookISBN`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `客户手机号_RES` FOREIGN KEY (`clientPhone`) REFERENCES `client` (`clientPhone`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sell
-- ----------------------------
DROP TABLE IF EXISTS `sell`;
CREATE TABLE `sell`  (
  `clientPhone` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookISBN` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `buyDate` date NOT NULL,
  `buyNum` smallint(3) NOT NULL,
  PRIMARY KEY (`buyDate`, `bookISBN`, `clientPhone`) USING BTREE,
  INDEX `客户手机号sell`(`clientPhone`) USING BTREE,
  INDEX `ISBN_SELL`(`bookISBN`) USING BTREE,
  INDEX `time`(`buyDate`) USING BTREE,
  CONSTRAINT `ISBN_SELL` FOREIGN KEY (`bookISBN`) REFERENCES `booknew` (`bookISBN`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `客户手机号sell` FOREIGN KEY (`clientPhone`) REFERENCES `client` (`clientPhone`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sell
-- ----------------------------
INSERT INTO `sell` VALUES ('14790409310', '1', '2022-06-16', 1);
INSERT INTO `sell` VALUES ('18856316698', '1', '2022-06-16', 1);
INSERT INTO `sell` VALUES ('14790409310', '12345', '2022-06-16', 1);
INSERT INTO `sell` VALUES ('13616644404', '1', '2022-06-17', 1);
INSERT INTO `sell` VALUES ('13999999900', '12345', '2022-06-17', 1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pwd` char(35) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `state` int(255) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'super', '202CB962AC59075B964B07152D234B70', 1);

-- ----------------------------
-- Table structure for vip
-- ----------------------------
DROP TABLE IF EXISTS `vip`;
CREATE TABLE `vip`  (
  `vipName` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `vipDeposit` decimal(10, 2) NOT NULL COMMENT '押金',
  `vipRentDiscount` decimal(5, 4) NOT NULL,
  `vipSellDiscount` decimal(5, 4) NOT NULL,
  `vipBorrowNum` smallint(2) NOT NULL,
  `vipRenew` smallint(2) NOT NULL COMMENT '可续借次数',
  `vipBorrowDate` smallint(4) NOT NULL COMMENT '可借阅天数',
  `vipTime` smallint(2) NOT NULL COMMENT '预约保留时间',
  `vipOverdue` decimal(4, 2) NOT NULL COMMENT '逾期扣费',
  `vipDamage` decimal(4, 2) NOT NULL COMMENT '损坏扣费',
  `vipLose` decimal(4, 2) NOT NULL COMMENT '丢失扣费',
  PRIMARY KEY (`vipName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of vip
-- ----------------------------
INSERT INTO `vip` VALUES ('普通会员', 50.00, 0.0500, 1.0000, 3, 2, 30, 7, 0.01, 1.00, 1.00);
INSERT INTO `vip` VALUES ('黄金会员', 200.00, 0.0300, 0.7600, 3, 2, 60, 7, 0.01, 1.00, 1.00);

-- ----------------------------
-- View structure for recordview
-- ----------------------------
DROP VIEW IF EXISTS `recordview`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `recordview` AS select `r`.`id` AS `id`,`m`.`name` AS `memberName`,`b`.`name` AS `bookName`,date_format(`r`.`rentDate`,'%Y-%m-%d') AS `rentDate`,date_format(`r`.`backDate`,'%Y-%m-%d') AS `backDate`,(`r`.`rentDate` + interval `mt`.`keepDay` day) AS `returnDate`,`r`.`deposit` AS `deposit` from (((`record` `r` join `book` `b`) join `member` `m`) join `membertype` `mt`) where ((`r`.`memberId` = `m`.`id`) and (`r`.`bookId` = `b`.`id`) and (`m`.`typeId` = `mt`.`id`));

-- ----------------------------
-- View structure for v_b_bw_count
-- ----------------------------
DROP VIEW IF EXISTS `v_b_bw_count`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_b_bw_count` AS select `booknew`.`bookISBN` AS `图书编号`,`booknew`.`bookName` AS `图书名称`,count(`borrow`.`borrowDate`) AS `借阅次数` from (`booknew` join `borrow` on((`borrow`.`bookISBN` = `booknew`.`bookISBN`))) group by `booknew`.`bookISBN`,`booknew`.`bookName`;

-- ----------------------------
-- View structure for v_b_bw_date
-- ----------------------------
DROP VIEW IF EXISTS `v_b_bw_date`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_b_bw_date` AS select `booknew`.`bookISBN` AS `图书编号`,`booknew`.`bookName` AS `图书名称`,date_format(`borrow`.`borrowDate`,'%Y-%m-%d') AS `借阅日期`,`booknew`.`bookPublish` AS `出版社`,`booknew`.`bookType` AS `图书类型`,`booknew`.`bookCategory` AS `图书种类` from (`booknew` join `borrow` on((`borrow`.`bookISBN` = `booknew`.`bookISBN`)));

-- ----------------------------
-- View structure for v_b_category
-- ----------------------------
DROP VIEW IF EXISTS `v_b_category`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_b_category` AS select `booknew`.`bookType` AS `图书类型`,count(`booknew`.`bookISBN`) AS `种类数`,sum(`booknew`.`bookTotalNum`) AS `馆藏总数` from `booknew` group by `booknew`.`bookType`;

-- ----------------------------
-- View structure for v_b_sell_date
-- ----------------------------
DROP VIEW IF EXISTS `v_b_sell_date`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_b_sell_date` AS select `booknew`.`bookISBN` AS `图书编号`,`booknew`.`bookName` AS `图书名称`,`booknew`.`bookType` AS `图书类型`,`booknew`.`bookCategory` AS `图书种类`,date_format(`sell`.`buyDate`,'%Y-%m-%d') AS `购买日期`,`sell`.`buyNum` AS `购买数量` from (`booknew` join `sell` on((`sell`.`bookISBN` = `booknew`.`bookISBN`)));

-- ----------------------------
-- View structure for v_b_type
-- ----------------------------
DROP VIEW IF EXISTS `v_b_type`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_b_type` AS select `booknew`.`bookCategory` AS `书籍类别`,count(`booknew`.`bookISBN`) AS `书籍种类`,sum(`booknew`.`bookTotalNum`) AS `类别总数` from `booknew` group by `booknew`.`bookCategory`;

-- ----------------------------
-- View structure for v_c_b_bw
-- ----------------------------
DROP VIEW IF EXISTS `v_c_b_bw`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_c_b_bw` AS select `client`.`clientPhone` AS `clientPhone`,`client`.`clientName` AS `clientName`,`booknew`.`bookISBN` AS `bookISBN`,`booknew`.`bookName` AS `bookName`,`booknew`.`bookPublish` AS `bookPublish`,`booknew`.`bookType` AS `bookType`,`booknew`.`bookCategory` AS `bookCategory`,date_format(`borrow`.`borrowDate`,'%Y-%m-%d') AS `borrowDate`,date_format(`borrow`.`returnDate`,'%Y-%m-%d') AS `returnDate`,date_format(`borrow`.`expiryDate`,'%Y-%m-%d') AS `expiryDate` from ((`client` join `booknew`) join `borrow` on(((`borrow`.`bookISBN` = `booknew`.`bookISBN`) and (`borrow`.`clientPhone` = `client`.`clientPhone`))));

-- ----------------------------
-- View structure for v_c_b_bw_count
-- ----------------------------
DROP VIEW IF EXISTS `v_c_b_bw_count`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_c_b_bw_count` AS select `v_c_b_bw`.`clientPhone` AS `clientPhone`,`v_c_b_bw`.`clientName` AS `clientName`,`v_c_b_bw`.`bookName` AS `bookName`,count(0) AS `borrowNum` from `v_c_b_bw` group by `v_c_b_bw`.`clientPhone`,`v_c_b_bw`.`clientName`,`v_c_b_bw`.`bookName`;

-- ----------------------------
-- View structure for v_c_b_sell
-- ----------------------------
DROP VIEW IF EXISTS `v_c_b_sell`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_c_b_sell` AS select `client`.`clientPhone` AS `clientPhone`,`client`.`clientName` AS `clientName`,`booknew`.`bookISBN` AS `bookISBN`,`booknew`.`bookName` AS `bookName`,`booknew`.`bookPublish` AS `bookPublish`,`booknew`.`bookIntroduction` AS `bookIntroduction`,`booknew`.`bookType` AS `bookType`,date_format(`sell`.`buyDate`,'%Y-%m-%d') AS `buyDate`,`sell`.`buyNum` AS `buyNum` from ((`client` join `booknew`) join `sell` on(((`sell`.`bookISBN` = `booknew`.`bookISBN`) and (`sell`.`clientPhone` = `client`.`clientPhone`))));

-- ----------------------------
-- View structure for v_c_b_sell_count
-- ----------------------------
DROP VIEW IF EXISTS `v_c_b_sell_count`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_c_b_sell_count` AS select `v_c_b_sell`.`clientPhone` AS `clientPhone`,`v_c_b_sell`.`clientName` AS `clientName`,`v_c_b_sell`.`bookName` AS `bookName`,sum(`v_c_b_sell`.`buyNum`) AS `buyNum` from `v_c_b_sell` group by `v_c_b_sell`.`clientPhone`,`v_c_b_sell`.`clientName`,`v_c_b_sell`.`bookName`;

-- ----------------------------
-- View structure for v_c_info
-- ----------------------------
DROP VIEW IF EXISTS `v_c_info`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_c_info` AS select `client`.`clientPhone` AS `clientPhone`,`client`.`clientName` AS `clientName`,`client`.`clientSex` AS `clientSex`,`client`.`clientGrade` AS `clientGrade`,`client`.`clientBalance` AS `clientBalance` from `client`;

-- ----------------------------
-- View structure for v_c_status
-- ----------------------------
DROP VIEW IF EXISTS `v_c_status`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_c_status` AS select `client`.`clientPhone` AS `clientPhone`,`client`.`clientName` AS `clientName`,`client`.`clientStatus` AS `clientStatus` from `client`;

-- ----------------------------
-- View structure for v_c_vip
-- ----------------------------
DROP VIEW IF EXISTS `v_c_vip`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_c_vip` AS select `client`.`clientGrade` AS `会员等级`,`client`.`clientPhone` AS `手机号`,`client`.`clientName` AS `用户名`,`client`.`clientBalance` AS `用户余额`,`client`.`clientStatus` AS `账号状态`,`client`.`clientBorrowNum` AS `已借阅数量`,`vip`.`vipRentDiscount` AS `出租折扣`,`vip`.`vipSellDiscount` AS `零售折扣`,`vip`.`vipDeposit` AS `押金`,`vip`.`vipBorrowNum` AS `可借阅数量`,`vip`.`vipRenew` AS `可续借次数`,`vip`.`vipBorrowDate` AS `可借阅天数`,`vip`.`vipTime` AS `预约保留时间`,`vip`.`vipOverdue` AS `逾期扣费`,`vip`.`vipDamage` AS `损坏扣费`,`vip`.`vipLose` AS `丢失扣费` from (`client` join `vip`) where (`client`.`clientGrade` = `vip`.`vipName`);

-- ----------------------------
-- View structure for v_v_all
-- ----------------------------
DROP VIEW IF EXISTS `v_v_all`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_v_all` AS select `vip`.`vipName` AS `vipName`,`vip`.`vipDeposit` AS `vipDeposit`,`vip`.`vipRentDiscount` AS `vipRentDiscount`,`vip`.`vipSellDiscount` AS `vipSellDiscount`,`vip`.`vipBorrowNum` AS `vipBorrowNum`,`vip`.`vipRenew` AS `vipRenew`,`vip`.`vipBorrowDate` AS `vipBorrowDate`,`vip`.`vipTime` AS `vipTime`,`vip`.`vipOverdue` AS `vipOverdue`,`vip`.`vipDamage` AS `vipDamage`,`vip`.`vipLose` AS `vipLose` from `vip`;

-- ----------------------------
-- View structure for v_v_penalties
-- ----------------------------
DROP VIEW IF EXISTS `v_v_penalties`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_v_penalties` AS select `vip`.`vipName` AS `vipName`,`vip`.`vipOverdue` AS `vipOverdue`,`vip`.`vipDamage` AS `vipDamage`,`vip`.`vipLose` AS `vipLose` from `vip`;

-- ----------------------------
-- View structure for v_v_rights
-- ----------------------------
DROP VIEW IF EXISTS `v_v_rights`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_v_rights` AS select `vip`.`vipName` AS `vipName`,`vip`.`vipDeposit` AS `vipDeposit`,`vip`.`vipRentDiscount` AS `vipRentDiscount`,`vip`.`vipSellDiscount` AS `vipSellDiscount`,`vip`.`vipBorrowNum` AS `vipBorrowNum`,`vip`.`vipRenew` AS `vipRenew`,`vip`.`vipBorrowDate` AS `vipBorrowDate`,`vip`.`vipTime` AS `vipTime` from `vip`;

-- ----------------------------
-- Procedure structure for getBookBNum
-- ----------------------------
DROP PROCEDURE IF EXISTS `getBookBNum`;
delimiter ;;
CREATE PROCEDURE `getBookBNum`(IN `begin` date,IN `end` date)
BEGIN
	#Routine body goes here...
	SELECT `借阅日期` borrowDate, `图书名称` bookName, count(*) borrowNum from v_b_bw_date where `借阅日期` >=begin and `借阅日期` <= end group by `图书编号`, `图书名称`;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for getBookSNum
-- ----------------------------
DROP PROCEDURE IF EXISTS `getBookSNum`;
delimiter ;;
CREATE PROCEDURE `getBookSNum`(IN `begin` date,IN `end` date)
BEGIN
	#Routine body goes here...
	SELECT `购买日期` buyDate, `图书名称` bookName, count(*) buyNum from v_b_sell_date where `购买日期` >=begin and `购买日期` <= end group by `图书编号`, `图书名称`;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for getClientBNum
-- ----------------------------
DROP PROCEDURE IF EXISTS `getClientBNum`;
delimiter ;;
CREATE PROCEDURE `getClientBNum`(IN `clientID` char(11))
BEGIN
	#Routine body goes here...
	select * from v_c_b_bw_count where v_c_b_bw_count.clientPhone=`clientID`;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for getClientBSNum
-- ----------------------------
DROP PROCEDURE IF EXISTS `getClientBSNum`;
delimiter ;;
CREATE PROCEDURE `getClientBSNum`(IN `clientID` char(11))
BEGIN
	#Routine body goes here...
	select * from v_c_b_bw_count where v_c_b_bw_count.clientPhone=`clientID`;
	select * from v_c_b_sell_count where v_c_b_sell_count.clientPhone=`clientID`;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for getClientSNum
-- ----------------------------
DROP PROCEDURE IF EXISTS `getClientSNum`;
delimiter ;;
CREATE PROCEDURE `getClientSNum`(IN `clientID` char(11))
BEGIN
	#Routine body goes here...
	select * from v_c_b_sell_count where v_c_b_sell_count.clientPhone=`clientID`;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for insertBorrow
-- ----------------------------
DROP PROCEDURE IF EXISTS `insertBorrow`;
delimiter ;;
CREATE PROCEDURE `insertBorrow`(IN `clientID` char(11), IN `bookID` char(13))
BEGIN
	#Routine body goes here...
	set @time = 0;
	set @ratio = 0.00;
	set @price = 0.00;
	
	select `可借阅天数`,`出租折扣` into @time, @ratio from v_c_vip where `手机号`=`clientID`;
	select bookPrice into @price from booknew where bookISBN = `bookID`;
	set @cost = @ratio * @price;
	
	INSERT INTO `bookdb`.`borrow`(`clientPhone`, `bookISBN`, `borrowDate`, `expiryDate`, `renewNum`, `borrowStatus`, `returnDate`, `deductionType`, `deductionAmount`) VALUES (`clientID`, `bookID`, CURRENT_DATE, DATE_ADD(NOW(),INTERVAL @time DAY), 0, '在借', NULL, NULL, NULL);
	UPDATE v_c_info SET clientBalance = clientBalance - @cost;

	
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for insertSell
-- ----------------------------
DROP PROCEDURE IF EXISTS `insertSell`;
delimiter ;;
CREATE PROCEDURE `insertSell`(IN `clientID` char(11), IN `bookID` char(13))
BEGIN
	#Routine body goes here...
	set @ratio = 0.00;
	set @price = 0.00;
	select `零售折扣` into @ratio from v_c_vip where `手机号`=`clientID`;
	select bookPrice into @price from booknew where bookISBN = `bookID`;
	set @cost = @ratio * @price;
	INSERT INTO `bookdb`.`sell`(`clientPhone`, `bookISBN`, `buyDate`, `buyNum`) VALUES (`clientID`, `bookID`, NOW(), 1);
	UPDATE v_c_info SET clientBalance = clientBalance - @cost;
	
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table booknew
-- ----------------------------
DROP TRIGGER IF EXISTS `单位约束`;
delimiter ;;
CREATE TRIGGER `单位约束` BEFORE INSERT ON `booknew` FOR EACH ROW IF (NEW.bookUnit != '本') THEN 
DELETE FROM book WHERE bookUnit = '本';
END IF
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table booknew
-- ----------------------------
DROP TRIGGER IF EXISTS `单位约束2`;
delimiter ;;
CREATE TRIGGER `单位约束2` BEFORE UPDATE ON `booknew` FOR EACH ROW IF (NEW.bookUnit != '本') THEN 
DELETE FROM book WHERE bookUnit = '本';
END IF
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table borrow
-- ----------------------------
DROP TRIGGER IF EXISTS `借书后更改书库数量`;
delimiter ;;
CREATE TRIGGER `借书后更改书库数量` AFTER INSERT ON `borrow` FOR EACH ROW IF (NEW.borrowStatus = '在借') THEN
UPDATE booknew SET booknew.bookNowNum = booknew.bookNowNum - 1 where booknew.bookISBN = new.bookISBN;
UPDATE client SET client.clientBorrowNum = client.clientBorrowNum + 1 where client.clientPhone = new.clientPhone;
END IF
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table borrow
-- ----------------------------
DROP TRIGGER IF EXISTS `还书后更改书库数量`;
delimiter ;;
CREATE TRIGGER `还书后更改书库数量` AFTER UPDATE ON `borrow` FOR EACH ROW IF (NEW.borrowStatus = '归还') THEN
UPDATE booknew SET booknew.bookNowNum = booknew.bookNowNum + 1 where booknew.bookISBN = NEW.bookISBN;
UPDATE client SET client.clientBorrowNum = client.clientBorrowNum - 1 where client.clientPhone = new.clientPhone;
END IF
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table client
-- ----------------------------
DROP TRIGGER IF EXISTS `充值记录`;
delimiter ;;
CREATE TRIGGER `充值记录` BEFORE UPDATE ON `client` FOR EACH ROW IF new.clientBalance > old.clientBalance THEN
INSERT INTO `bookdb`.`balance`(`opTime`, `clientPhone`, `opAmount`, `opType`) VALUES (NOW(), new.clientPhone, new.clientBalance - old.clientBalance, '充值');
-- ELSEIF new.clientBalance < old.clientBalance THEN
-- INSERT INTO `bookdb`.`balance`(`opTime`, `clientPhone`, `opAmount`, `opType`) VALUES (CURRENT_DATE, new.clientPhone, old.clientBalance - new.clientBalance, '提现');
END IF
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table client
-- ----------------------------
DROP TRIGGER IF EXISTS `提现记录`;
delimiter ;;
CREATE TRIGGER `提现记录` AFTER UPDATE ON `client` FOR EACH ROW IF new.clientBalance < old.clientBalance THEN
INSERT INTO `bookdb`.`balance`(`opTime`, `clientPhone`, `opAmount`, `opType`) VALUES (NOW(), new.clientPhone, old.clientBalance - new.clientBalance, '提现');
END IF
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table sell
-- ----------------------------
DROP TRIGGER IF EXISTS `零售后修改书籍总量和在馆数量`;
delimiter ;;
CREATE TRIGGER `零售后修改书籍总量和在馆数量` AFTER INSERT ON `sell` FOR EACH ROW UPDATE booknew SET 
booknew.bookTotalNum = booknew.bookTotalNum - new.buyNum,
booknew.bookNowNum = booknew.bookNowNum - new.buyNum
where new.bookISBN = booknew.bookISBN
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;

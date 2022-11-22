CREATE TABLE `libdb`.`Untitled`  (
  `client_id` varchar(11) NOT NULL,
  `client_phone` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `client_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_sex` enum('男','女') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vip_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_balance` decimal(10, 2) NOT NULL,
  `client_status` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_borrow_num` smallint(2) NOT NULL,
  PRIMARY KEY (`client_id`) USING BTREE,
  INDEX `clientPhone`(`client_phone`) USING BTREE,
  INDEX `名称`(`client_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;
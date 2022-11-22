CREATE TABLE `libdb`.`Untitled`  (
  `book_id` varchar(13) NOT NULL,
  `book_isbn` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `publisher_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_price` decimal(10, 2) NOT NULL,
  `book_total_num` smallint(3) NOT NULL,
  `book_now_num` smallint(3) NOT NULL,
  `book_reserve_num` smallint(3) NOT NULL,
  `book_author_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_introduction` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_type_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;
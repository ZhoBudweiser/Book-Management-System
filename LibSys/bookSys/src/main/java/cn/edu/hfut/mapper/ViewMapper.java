package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Client;
import cn.edu.hfut.model.VBorrowBook;
import cn.edu.hfut.model.VBorrowClient;

public interface ViewMapper {
    VBorrowClient selectByClientPhone(String clientPhone);

    VBorrowBook selectByBookIsbn(String bookIsbn);
}

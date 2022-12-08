package cn.edu.hfut.service;

import cn.edu.hfut.model.VBorrowBook;

public interface BookService {
    VBorrowBook selectByBookIsdn(String bookIsdn);
}

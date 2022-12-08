package cn.edu.hfut.service;

import cn.edu.hfut.model.Book;
import cn.edu.hfut.model.Client;
import cn.edu.hfut.model.VBorrowBook;

import java.util.List;

public interface BookService {
    VBorrowBook selectByBookIsdn(String bookIsdn);

    List<Book> selectAll();

    void add(Book book);

    Book selectByPrimaryKey(Long bookId);

    void updateByPrimaryKeySelective(Book book);
}

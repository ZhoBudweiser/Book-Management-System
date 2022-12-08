package cn.edu.hfut.service;

import cn.edu.hfut.model.Book;

import java.util.Date;
import java.util.List;

public interface BorrowService {
    void insertByBookIds(Long clientId, List<Long> bookIds);

    void insertByBookIdsAndDate(Long clientId, List<Long> bookIds, Date dueDate);
}

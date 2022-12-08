package cn.edu.hfut.service;

import cn.edu.hfut.model.Book;
import cn.edu.hfut.model.VReturn;

import java.util.Date;
import java.util.List;

public interface BorrowService {
    void insertByBookIds(Long clientId, List<Long> bookIds);

    void insertByBookIdsAndDate(Long clientId, List<Long> bookIds, Date dueDate);

    List<VReturn> selectBooksByClientPhone(String clientPhone);

    void updateByClientIdAndBookIds(Long clientId, List<Long> bookIds, List<Date> borrowDate, Date date);
}

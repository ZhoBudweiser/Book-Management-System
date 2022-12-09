package cn.edu.hfut.model;

import java.util.Date;

public class BorrowKey {
    private Long clientId;

    private Long bookId;

    private Date borrowDate;

    public BorrowKey(Long clientId, Long bookId, Date borrowDate) {
        this.clientId = clientId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
    }

    public BorrowKey() {
        super();
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }
}
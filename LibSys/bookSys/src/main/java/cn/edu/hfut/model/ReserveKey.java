package cn.edu.hfut.model;

import java.util.Date;

public class ReserveKey {
    private Date reserveDate;

    private Long clientId;

    private Long bookId;

    public ReserveKey(Date reserveDate, Long clientId, Long bookId) {
        this.reserveDate = reserveDate;
        this.clientId = clientId;
        this.bookId = bookId;
    }

    public ReserveKey() {
        super();
    }

    public Date getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
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
}
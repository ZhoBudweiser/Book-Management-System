package cn.edu.hfut.model;

import java.util.Date;

public class Reserve extends ReserveKey {
    private Date reserveExpriyDate;

    public Reserve(Date reserveDate, Long clientId, Long bookId, Date reserveExpriyDate) {
        super(reserveDate, clientId, bookId);
        this.reserveExpriyDate = reserveExpriyDate;
    }

    public Reserve() {
        super();
    }

    public Date getReserveExpriyDate() {
        return reserveExpriyDate;
    }

    public void setReserveExpriyDate(Date reserveExpriyDate) {
        this.reserveExpriyDate = reserveExpriyDate;
    }
}
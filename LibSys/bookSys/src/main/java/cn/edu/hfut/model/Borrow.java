package cn.edu.hfut.model;

import java.math.BigDecimal;
import java.util.Date;

public class Borrow extends BorrowKey {
    private Date expiryDate;

    private Short renewNum;

    private String borrowStatus;

    private Date returnDate;

    private String deductionType;

    private BigDecimal deductionAmount;

    public Borrow(Long clientId, Long bookId, Date borrowDate, Date expiryDate, Short renewNum, String borrowStatus, Date returnDate, String deductionType, BigDecimal deductionAmount) {
        super(clientId, bookId, borrowDate);
        this.expiryDate = expiryDate;
        this.renewNum = renewNum;
        this.borrowStatus = borrowStatus;
        this.returnDate = returnDate;
        this.deductionType = deductionType;
        this.deductionAmount = deductionAmount;
    }

    public Borrow() {
        super();
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Short getRenewNum() {
        return renewNum;
    }

    public void setRenewNum(Short renewNum) {
        this.renewNum = renewNum;
    }

    public String getBorrowStatus() {
        return borrowStatus;
    }

    public void setBorrowStatus(String borrowStatus) {
        this.borrowStatus = borrowStatus == null ? null : borrowStatus.trim();
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getDeductionType() {
        return deductionType;
    }

    public void setDeductionType(String deductionType) {
        this.deductionType = deductionType == null ? null : deductionType.trim();
    }

    public BigDecimal getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(BigDecimal deductionAmount) {
        this.deductionAmount = deductionAmount;
    }
}
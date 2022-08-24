package com.enjoy.book.bean;


public class Borrow {

  private String clientPhone;
  private String bookIsbn;
  private java.sql.Date borrowDate;
  private java.sql.Date expiryDate;
  private long renewNum;
  private String borrowStatus;
  private java.sql.Date returnDate;
  private String deductionType;
  private double deductionAmount;


  public String getClientPhone() {
    return clientPhone;
  }

  public void setClientPhone(String clientPhone) {
    this.clientPhone = clientPhone;
  }


  public String getBookIsbn() {
    return bookIsbn;
  }

  public void setBookIsbn(String bookIsbn) {
    this.bookIsbn = bookIsbn;
  }


  public java.sql.Date getBorrowDate() {
    return borrowDate;
  }

  public void setBorrowDate(java.sql.Date borrowDate) {
    this.borrowDate = borrowDate;
  }


  public java.sql.Date getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(java.sql.Date expiryDate) {
    this.expiryDate = expiryDate;
  }


  public long getRenewNum() {
    return renewNum;
  }

  public void setRenewNum(long renewNum) {
    this.renewNum = renewNum;
  }


  public String getBorrowStatus() {
    return borrowStatus;
  }

  public void setBorrowStatus(String borrowStatus) {
    this.borrowStatus = borrowStatus;
  }


  public java.sql.Date getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(java.sql.Date returnDate) {
    this.returnDate = returnDate;
  }


  public String getDeductionType() {
    return deductionType;
  }

  public void setDeductionType(String deductionType) {
    this.deductionType = deductionType;
  }


  public double getDeductionAmount() {
    return deductionAmount;
  }

  public void setDeductionAmount(double deductionAmount) {
    this.deductionAmount = deductionAmount;
  }

}

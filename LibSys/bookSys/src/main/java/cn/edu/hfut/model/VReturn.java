package cn.edu.hfut.model;


import java.util.Date;

public class VReturn {

  private Date borrowDate;
  private Date expiryDate;
  private long renewNum;
  private String borrowStatus;
  private Date returnDate;
  private String deductionType;
  private double deductionAmount;
  private long bookId;
  private String bookIsbn;
  private String bookName;
  private double bookPrice;
  private long clientId;
  private String clientPhone;


  public Date getBorrowDate() {
    return borrowDate;
  }

  public void setBorrowDate(Date borrowDate) {
    this.borrowDate = borrowDate;
  }


  public Date getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Date expiryDate) {
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
    this.deductionType = deductionType;
  }


  public double getDeductionAmount() {
    return deductionAmount;
  }

  public void setDeductionAmount(double deductionAmount) {
    this.deductionAmount = deductionAmount;
  }


  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }


  public String getBookIsbn() {
    return bookIsbn;
  }

  public void setBookIsbn(String bookIsbn) {
    this.bookIsbn = bookIsbn;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public double getBookPrice() {
    return bookPrice;
  }

  public void setBookPrice(double bookPrice) {
    this.bookPrice = bookPrice;
  }


  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }

  public String getClientPhone() {
    return clientPhone;
  }

  public void setClientPhone(String clientPhone) {
    this.clientPhone = clientPhone;
  }



}

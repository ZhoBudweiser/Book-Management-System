package com.sample;


public class Sell {

  private String clientPhone;
  private String bookIsbn;
  private java.sql.Date buyDate;
  private long buyNum;


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


  public java.sql.Date getBuyDate() {
    return buyDate;
  }

  public void setBuyDate(java.sql.Date buyDate) {
    this.buyDate = buyDate;
  }


  public long getBuyNum() {
    return buyNum;
  }

  public void setBuyNum(long buyNum) {
    this.buyNum = buyNum;
  }

}

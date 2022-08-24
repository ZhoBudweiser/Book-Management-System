package com.sample;


public class Reserve {

  private java.sql.Date reserveDate;
  private String clientPhone;
  private String bookIsbn;
  private java.sql.Date reserveExpriyDate;


  public java.sql.Date getReserveDate() {
    return reserveDate;
  }

  public void setReserveDate(java.sql.Date reserveDate) {
    this.reserveDate = reserveDate;
  }


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


  public java.sql.Date getReserveExpriyDate() {
    return reserveExpriyDate;
  }

  public void setReserveExpriyDate(java.sql.Date reserveExpriyDate) {
    this.reserveExpriyDate = reserveExpriyDate;
  }

}

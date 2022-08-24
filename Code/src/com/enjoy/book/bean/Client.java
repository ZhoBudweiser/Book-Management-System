package com.enjoy.book.bean;


import java.io.Serializable;

public class Client implements Serializable {

  private String clientPhone;
  private String clientName;
  private String clientSex;
  private String clientGrade;
  private double clientBalance;
  private String clientStatus;
  private long clientBorrowNum;


  public String getClientPhone() {
    return clientPhone;
  }

  public void setClientPhone(String clientPhone) {
    this.clientPhone = clientPhone;
  }


  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public String getClientSex() {
    return clientSex;
  }

  public void setClientSex(String clientSex) {
    this.clientSex = clientSex;
  }


  public String getClientGrade() {
    return clientGrade;
  }

  public void setClientGrade(String clientGrade) {
    this.clientGrade = clientGrade;
  }


  public double getClientBalance() {
    return clientBalance;
  }

  public void setClientBalance(double clientBalance) {
    this.clientBalance = clientBalance;
  }


  public String getClientStatus() {
    return clientStatus;
  }

  public void setClientStatus(String clientStatus) {
    this.clientStatus = clientStatus;
  }


  public long getClientBorrowNum() {
    return clientBorrowNum;
  }

  public void setClientBorrowNum(long clientBorrowNum) {
    this.clientBorrowNum = clientBorrowNum;
  }

}

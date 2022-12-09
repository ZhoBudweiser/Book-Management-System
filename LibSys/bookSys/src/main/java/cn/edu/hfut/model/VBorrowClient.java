package cn.edu.hfut.model;


public class VBorrowClient {

  private long clientId;
  private String clientPhone;
  private String clientName;
  private long vipId;
  private double clientBalance;
  private String clientStatus;
  private long clientBorrowNum;
  private String vipName;
  private long clientLeftBorrowNum;
  private long vipBorrowDate;
  private double vipRentDiscount;


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


  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public long getVipId() {
    return vipId;
  }

  public void setVipId(long vipId) {
    this.vipId = vipId;
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


  public String getVipName() {
    return vipName;
  }

  public void setVipName(String vipName) {
    this.vipName = vipName;
  }


  public long getClientLeftBorrowNum() {
    return clientLeftBorrowNum;
  }

  public void setClientLeftBorrowNum(long clientLeftBorrowNum) {
    this.clientLeftBorrowNum = clientLeftBorrowNum;
  }


  public long getVipBorrowDate() {
    return vipBorrowDate;
  }

  public void setVipBorrowDate(long vipBorrowDate) {
    this.vipBorrowDate = vipBorrowDate;
  }


  public double getVipRentDiscount() {
    return vipRentDiscount;
  }

  public void setVipRentDiscount(double vipRentDiscount) {
    this.vipRentDiscount = vipRentDiscount;
  }

}

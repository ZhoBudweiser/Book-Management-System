package com.sample;


public class Balance {

  private java.sql.Timestamp opTime;
  private String clientPhone;
  private double opAmount;
  private String opType;


  public java.sql.Timestamp getOpTime() {
    return opTime;
  }

  public void setOpTime(java.sql.Timestamp opTime) {
    this.opTime = opTime;
  }


  public String getClientPhone() {
    return clientPhone;
  }

  public void setClientPhone(String clientPhone) {
    this.clientPhone = clientPhone;
  }


  public double getOpAmount() {
    return opAmount;
  }

  public void setOpAmount(double opAmount) {
    this.opAmount = opAmount;
  }


  public String getOpType() {
    return opType;
  }

  public void setOpType(String opType) {
    this.opType = opType;
  }

}

package com.enjoy.book.bean;


import java.io.Serializable;

public class Vip implements Serializable {

  private String vipName;
  private double vipDeposit;
  private double vipRentDiscount;
  private double vipSellDiscount;
  private long vipBorrowNum;
  private long vipRenew;
  private long vipBorrowDate;
  private long vipTime;
  private double vipOverdue;
  private double vipDamage;
  private double vipLose;


  public String getVipName() {
    return vipName;
  }

  public void setVipName(String vipName) {
    this.vipName = vipName;
  }


  public double getVipDeposit() {
    return vipDeposit;
  }

  public void setVipDeposit(double vipDeposit) {
    this.vipDeposit = vipDeposit;
  }


  public double getVipRentDiscount() {
    return vipRentDiscount;
  }

  public void setVipRentDiscount(double vipRentDiscount) {
    this.vipRentDiscount = vipRentDiscount;
  }


  public double getVipSellDiscount() {
    return vipSellDiscount;
  }

  public void setVipSellDiscount(double vipSellDiscount) {
    this.vipSellDiscount = vipSellDiscount;
  }


  public long getVipBorrowNum() {
    return vipBorrowNum;
  }

  public void setVipBorrowNum(long vipBorrowNum) {
    this.vipBorrowNum = vipBorrowNum;
  }


  public long getVipRenew() {
    return vipRenew;
  }

  public void setVipRenew(long vipRenew) {
    this.vipRenew = vipRenew;
  }


  public long getVipBorrowDate() {
    return vipBorrowDate;
  }

  public void setVipBorrowDate(long vipBorrowDate) {
    this.vipBorrowDate = vipBorrowDate;
  }


  public long getVipTime() {
    return vipTime;
  }

  public void setVipTime(long vipTime) {
    this.vipTime = vipTime;
  }


  public double getVipOverdue() {
    return vipOverdue;
  }

  public void setVipOverdue(double vipOverdue) {
    this.vipOverdue = vipOverdue;
  }


  public double getVipDamage() {
    return vipDamage;
  }

  public void setVipDamage(double vipDamage) {
    this.vipDamage = vipDamage;
  }


  public double getVipLose() {
    return vipLose;
  }

  public void setVipLose(double vipLose) {
    this.vipLose = vipLose;
  }

  @Override
  public String toString() {
    return "Vip:{" +
            "vipName" +  vipName +
            ", vipDeposit" +  vipDeposit +
            ", vipRentDiscount" +  vipRentDiscount +
            ", vipSellDiscount" +  vipSellDiscount +
            ", vipBorrowNum" +  vipBorrowNum +
            ", vipRenew" +  vipRenew +
            ", vipBorrowDate" +  vipBorrowDate +
            ", vipTime" +  vipTime +
            ", vipOverdue" +  vipOverdue +
            ", vipDamage" +  vipDamage +
            ", vipLose" +  vipLose +
            "}";
  }
}

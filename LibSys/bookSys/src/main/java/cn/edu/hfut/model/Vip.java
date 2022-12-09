package cn.edu.hfut.model;

import java.math.BigDecimal;

public class Vip {
    private Long vipId;

    private String vipName;

    private BigDecimal vipDeposit;

    private BigDecimal vipRentDiscount;

    private BigDecimal vipSellDiscount;

    private Short vipBorrowNum;

    private Short vipRenew;

    private Short vipBorrowDate;

    private Short vipTime;

    private BigDecimal vipOverdue;

    private BigDecimal vipDamage;

    private BigDecimal vipLose;

    public Vip(Long vipId, String vipName, BigDecimal vipDeposit, BigDecimal vipRentDiscount, BigDecimal vipSellDiscount, Short vipBorrowNum, Short vipRenew, Short vipBorrowDate, Short vipTime, BigDecimal vipOverdue, BigDecimal vipDamage, BigDecimal vipLose) {
        this.vipId = vipId;
        this.vipName = vipName;
        this.vipDeposit = vipDeposit;
        this.vipRentDiscount = vipRentDiscount;
        this.vipSellDiscount = vipSellDiscount;
        this.vipBorrowNum = vipBorrowNum;
        this.vipRenew = vipRenew;
        this.vipBorrowDate = vipBorrowDate;
        this.vipTime = vipTime;
        this.vipOverdue = vipOverdue;
        this.vipDamage = vipDamage;
        this.vipLose = vipLose;
    }

    public Vip() {
        super();
    }

    public Long getVipId() {
        return vipId;
    }

    public void setVipId(Long vipId) {
        this.vipId = vipId;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName == null ? null : vipName.trim();
    }

    public BigDecimal getVipDeposit() {
        return vipDeposit;
    }

    public void setVipDeposit(BigDecimal vipDeposit) {
        this.vipDeposit = vipDeposit;
    }

    public BigDecimal getVipRentDiscount() {
        return vipRentDiscount;
    }

    public void setVipRentDiscount(BigDecimal vipRentDiscount) {
        this.vipRentDiscount = vipRentDiscount;
    }

    public BigDecimal getVipSellDiscount() {
        return vipSellDiscount;
    }

    public void setVipSellDiscount(BigDecimal vipSellDiscount) {
        this.vipSellDiscount = vipSellDiscount;
    }

    public Short getVipBorrowNum() {
        return vipBorrowNum;
    }

    public void setVipBorrowNum(Short vipBorrowNum) {
        this.vipBorrowNum = vipBorrowNum;
    }

    public Short getVipRenew() {
        return vipRenew;
    }

    public void setVipRenew(Short vipRenew) {
        this.vipRenew = vipRenew;
    }

    public Short getVipBorrowDate() {
        return vipBorrowDate;
    }

    public void setVipBorrowDate(Short vipBorrowDate) {
        this.vipBorrowDate = vipBorrowDate;
    }

    public Short getVipTime() {
        return vipTime;
    }

    public void setVipTime(Short vipTime) {
        this.vipTime = vipTime;
    }

    public BigDecimal getVipOverdue() {
        return vipOverdue;
    }

    public void setVipOverdue(BigDecimal vipOverdue) {
        this.vipOverdue = vipOverdue;
    }

    public BigDecimal getVipDamage() {
        return vipDamage;
    }

    public void setVipDamage(BigDecimal vipDamage) {
        this.vipDamage = vipDamage;
    }

    public BigDecimal getVipLose() {
        return vipLose;
    }

    public void setVipLose(BigDecimal vipLose) {
        this.vipLose = vipLose;
    }
}
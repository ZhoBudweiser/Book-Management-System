package cn.edu.hfut.model;

import java.math.BigDecimal;

public class Client {
    private Long clientId;

    private String clientPhone;

    private String clientName;

    private String clientSex;

    private Long vipId;

    private Vip vipType;

    private BigDecimal clientBalance;

    private String clientStatus;

    private Short clientBorrowNum;

    public Client(Long clientId, String clientPhone, String clientName, String clientSex, Long vipId, BigDecimal clientBalance, String clientStatus, Short clientBorrowNum) {
        this.clientId = clientId;
        this.clientPhone = clientPhone;
        this.clientName = clientName;
        this.clientSex = clientSex;
        this.vipId = vipId;
        this.clientBalance = clientBalance;
        this.clientStatus = clientStatus;
        this.clientBorrowNum = clientBorrowNum;
    }

    public Client() {
        super();
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone == null ? null : clientPhone.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getClientSex() {
        return clientSex;
    }

    public void setClientSex(String clientSex) {
        this.clientSex = clientSex == null ? null : clientSex.trim();
    }

    public Long getVipId() {
        return vipId;
    }

    public void setVipId(Long vipId) {
        this.vipId = vipId;
    }

    public BigDecimal getClientBalance() {
        return clientBalance;
    }

    public void setClientBalance(BigDecimal clientBalance) {
        this.clientBalance = clientBalance;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus == null ? null : clientStatus.trim();
    }

    public Short getClientBorrowNum() {
        return clientBorrowNum;
    }

    public void setClientBorrowNum(Short clientBorrowNum) {
        this.clientBorrowNum = clientBorrowNum;
    }


    public Vip getVipType() {
        return vipType;
    }

    public void setVipType(Vip vipType) {
        this.vipType = vipType;
    }
}
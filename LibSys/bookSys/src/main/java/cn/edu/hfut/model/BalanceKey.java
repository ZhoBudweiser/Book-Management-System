package cn.edu.hfut.model;

import java.util.Date;

public class BalanceKey {
    private Date opTime;

    private Long clientId;

    public BalanceKey(Date opTime, Long clientId) {
        this.opTime = opTime;
        this.clientId = clientId;
    }

    public BalanceKey() {
        super();
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
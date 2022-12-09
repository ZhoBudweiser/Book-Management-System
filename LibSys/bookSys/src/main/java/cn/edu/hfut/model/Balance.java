package cn.edu.hfut.model;

import java.math.BigDecimal;
import java.util.Date;

public class Balance extends BalanceKey {
    private BigDecimal opAmount;

    private String opType;

    public Balance(Date opTime, Long clientId, BigDecimal opAmount, String opType) {
        super(opTime, clientId);
        this.opAmount = opAmount;
        this.opType = opType;
    }

    public Balance() {
        super();
    }

    public BigDecimal getOpAmount() {
        return opAmount;
    }

    public void setOpAmount(BigDecimal opAmount) {
        this.opAmount = opAmount;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }
}
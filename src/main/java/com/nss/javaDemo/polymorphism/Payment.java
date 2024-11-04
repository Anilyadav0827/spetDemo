package com.nss.javaDemo.polymorphism;

import java.util.Date;

public class Payment {


    private String transactionId;

    private String UTRId;

    private Date transactionDate;

    private String status;

     public  static double limitCount;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUTRId() {
        return UTRId;
    }

    public void setUTRId(String UTRId) {
        this.UTRId = UTRId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

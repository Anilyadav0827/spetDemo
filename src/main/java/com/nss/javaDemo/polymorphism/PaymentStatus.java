package com.nss.javaDemo.polymorphism;

public enum PaymentStatus {

    //we  can write methods in enum

    PENDING("payment is pending"),
    COMPLETED(" payment completed successfully"),
    FAILED(" payment failed"),
    lIMIT_EXCEED(" payment failed due to limit exceed"),
    REFUNDED(" payment is refunded");


    private String description;

    PaymentStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

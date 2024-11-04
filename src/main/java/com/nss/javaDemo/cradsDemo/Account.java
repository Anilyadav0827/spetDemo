package com.nss.javaDemo.cradsDemo;

public class Account {
    public String accountNumber;
    public String ifscCode;
    public UserDetails userDetails;

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", userDetails=" + userDetails +
                '}';
    }
}

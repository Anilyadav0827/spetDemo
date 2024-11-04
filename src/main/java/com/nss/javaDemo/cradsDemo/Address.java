package com.nss.javaDemo.cradsDemo;

public class Address {
    public String city;
    public String houseNo;
    public String landMark;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", landMark='" + landMark + '\'' +
                '}';
    }
}

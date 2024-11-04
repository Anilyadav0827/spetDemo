package com.nss.javaDemo.cradsDemo;

public class UserDetails {
    public String name;
    public String mobileNumber;
    public String panCard;
    public Address address;

    @Override
    public String toString() {
        return "UserDetails{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", panCard='" + panCard + '\'' +
                ", address=" + address +
                '}';
    }
}

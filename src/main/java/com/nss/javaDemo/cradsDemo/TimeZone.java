package com.nss.javaDemo.cradsDemo;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeZone {

    public static void main(String[] args) {

        Date myLocalTime = new Date();

        SimpleDateFormat simpleDateFormat= new SimpleDateFormat();
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        System.out.println("UTC time Zone :"+simpleDateFormat.format(myLocalTime));
        System.out.println("my local time Zone :"+myLocalTime);


    }
}

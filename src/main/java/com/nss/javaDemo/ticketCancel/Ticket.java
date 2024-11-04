package com.nss.javaDemo.ticketCancel;

import java.util.Date;

public class Ticket {
    private double amount;

    private Date bookingDate;

    public Ticket(double amount, Date bookingDate) {
        this.amount = amount;
        this.bookingDate = bookingDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}

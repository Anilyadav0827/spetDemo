package com.nss.javaDemo.polymorphism;







public class PaymentTest {

    public static void main(String[] args) {
        UPIPayments payment = new PhonePay();
        Payment pay= payment.transfer("99999999","88888888",1000);

        System.out.println("status : "+pay.getStatus()+"  transactionId:  "+pay.getTransactionId());


        UPIPayments payment1 = new PhonePay();
        Payment pay1= payment.transfer("99999999","88888888",1000);

        System.out.println("status : "+pay1.getStatus()+"  transactionId:  "+pay1.getTransactionId());

        UPIPayments payment2= new PhonePay();
        Payment pay2= payment.transfer("99999999","88888888",1000);

        System.out.println("status : "+pay2.getStatus()+"  transactionId:  "+pay2.getTransactionId());

        UPIPayments payment3 = new PhonePay();
        Payment pay3= payment.transfer("99999999","88888888",1000);

        System.out.println("status : "+pay3.getStatus()+"  transactionId:  "+pay3.getTransactionId());


    }
}

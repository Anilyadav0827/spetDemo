package com.nss.javaDemo.cradsDemo;



public class CardTest {
    public static void main(String[] args) {

        AccountService accountService= new AccountService();

        Address address1= new Address();
        address1.city="hyd";
        address1.houseNo="1-2-4";
        address1.landMark="opposite to school";

        Address address2= new Address();

        address2.city="banglore";
        address2.houseNo="1-2-4";
        address2.landMark="opposite to school";



        UserDetails user1= new UserDetails();
        user1.name="xyz";
        user1.mobileNumber="99999";
        user1.panCard="TQW99900";
        user1.address=address1;

         Account accountDetails =  accountService.getaccount(user1);
         System.out.println(accountDetails.userDetails.name);


        DebitCard debitCard= accountService.issueDebitCard(accountDetails);
        System.out.println("your card no is: "+debitCard.cardNumber+
                " your Name :"+ debitCard.name+"expiryDate :"+debitCard.expiryDate);

    }
}

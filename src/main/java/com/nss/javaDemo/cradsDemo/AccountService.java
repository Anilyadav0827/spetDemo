package com.nss.javaDemo.cradsDemo;



import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class AccountService {

    public Account getaccount(UserDetails userDetails){
        Account account= new Account();

        if(userDetails!=null) {
            account.accountNumber = String.valueOf(Math.random());
            account.ifscCode = UUID.randomUUID().toString();
            account.userDetails = userDetails;
        }
        else{
            System.out.println(" please provide the user Details");
        }

       return account;
    }

    public DebitCard issueDebitCard ( Account accountDetails){

        DebitCard debitCard = new DebitCard();
        debitCard.cardNumber=UUID.randomUUID().toString();
        debitCard.name=accountDetails.userDetails.name;
        debitCard.cvv=999;
        debitCard.startDate = new Date();
        Calendar calendar= Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR,3);
        debitCard.expiryDate=calendar.getTime();
       return  debitCard;
    }

}

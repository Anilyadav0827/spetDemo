package com.nss.javaDemo.polymorphism;



import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PhonePay implements UPIPayments{


    static Map<String, Double> accountBalanceMap = new HashMap<>();

    static Map<String , ArrayList<Payment>> accountHistory =new HashMap<>();


    static {
        accountBalanceMap.put("99999999",100000.0);
        accountBalanceMap.put("88888888",10000.0);
    }

    BiPredicate<String,Double> balanceCheck=(accountNumber,amt)->{

         Double accountBalance= accountBalanceMap.get(accountNumber);

         if(accountBalance>amt){
             return true;
         }
         else{
             return false;
         }

    };



    @Override
    public Payment transfer(String fromMobileNumber, String toMobileNumber, double amount) {
        Payment payment= new Payment();


        if(balanceCheck.test(fromMobileNumber,amount)){

            Payment.limitCount++;

            Boolean check = limitCheck();


            if(check) {

                Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
                Double toAccountBalance = accountBalanceMap.get(toMobileNumber);

                Double totalFromAccount = fromAccountBalance - amount;
                Double totalToAccount = toAccountBalance + amount;

                accountBalanceMap.put(fromMobileNumber, totalFromAccount);
                accountBalanceMap.put(toMobileNumber, totalToAccount);
                payment.setStatus(PaymentStatus.COMPLETED.getDescription());
                payment.setTransactionId(UUID.randomUUID().toString());
                payment.setUTRId(UUID.randomUUID().toString());
                payment.setTransactionDate(new Date());
            }else{
                payment.setStatus(PaymentStatus.lIMIT_EXCEED.getDescription());
            }



       }

        else {

            payment.setStatus(PaymentStatus.FAILED.getDescription());
            payment.setTransactionId(UUID.randomUUID().toString());
            payment.setUTRId(UUID.randomUUID().toString());
            payment.setTransactionDate(new Date());

        }

      return payment;


    }
    public boolean limitCheck( ){

        if(Payment.limitCount<=3){

            return true;
        }
        else {
            return false;

        }
    }


    }




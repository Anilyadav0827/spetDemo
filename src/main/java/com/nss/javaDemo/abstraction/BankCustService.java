package com.nss.javaDemo.abstraction;

import com.nss.javaDemo.abstraction.factoryDesign.AccountFactory;
import com.nss.javaDemo.abstraction.factoryDesign.CorporateAccountServiceFactory;

public class BankCustService {

    
    public static void main(String[] args) {

        AccountFactory factory= new CorporateAccountServiceFactory();

        RetailAccountService custService =(RetailAccountService)factory.createAccount();

        Account account =custService.createAccount("11111","33333");

        System.out.println("adhar"+account.getAdhar()+"account"+account.getAccount());


    }
}

package com.nss.javaDemo.abstraction.factoryDesign;

import com.nss.javaDemo.abstraction.AccountService;
import com.nss.javaDemo.abstraction.RetailAccountServiceImpl;

public class RetailAccountServiceFactory implements AccountFactory{
    @Override
    public AccountService createAccount() {

        return new RetailAccountServiceImpl();
    }
}

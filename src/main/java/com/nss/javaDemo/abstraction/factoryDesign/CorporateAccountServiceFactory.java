package com.nss.javaDemo.abstraction.factoryDesign;

import com.nss.javaDemo.abstraction.AccountService;
import com.nss.javaDemo.abstraction.CorpoarateAccountServiceImpl;

public class CorporateAccountServiceFactory implements AccountFactory{
    @Override
    public AccountService createAccount() {
        return new CorpoarateAccountServiceImpl();
    }
}

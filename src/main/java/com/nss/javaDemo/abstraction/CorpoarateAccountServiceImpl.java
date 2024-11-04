package com.nss.javaDemo.abstraction;

import java.util.UUID;

public class CorpoarateAccountServiceImpl implements CorporateAccountService{
    @Override
    public Account createAccount(String gst, String pan) {

        Account account= new Account();

        account.setAccount(UUID.randomUUID().toString());
        account.setBalance(1000000.0);

        account.setPan(pan);
        account.setGst(gst);

        SBIAccountDBService.accountMap.put(account.getAccount(),account);
        return account;
    }
}

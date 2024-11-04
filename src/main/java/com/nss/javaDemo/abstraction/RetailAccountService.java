package com.nss.javaDemo.abstraction;

public interface RetailAccountService extends AccountService{

    Account createAccount( String adhar, String pan);
}

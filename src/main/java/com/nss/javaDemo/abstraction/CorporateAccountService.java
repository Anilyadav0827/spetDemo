package com.nss.javaDemo.abstraction;

public interface CorporateAccountService extends AccountService{

    Account createAccount(String gst,String pan);
}

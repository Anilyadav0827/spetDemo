package com.nss.javaDemo.abstraction.factoryDesign;

import com.nss.javaDemo.abstraction.AccountService;

public interface AccountFactory {


    AccountService createAccount();

}

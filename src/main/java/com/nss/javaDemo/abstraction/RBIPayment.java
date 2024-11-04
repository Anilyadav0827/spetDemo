package com.nss.javaDemo.abstraction;

import com.nss.javaDemo.polymorphism.Payment;

public interface RBIPayment {

    Payment transfer(String fromAccount,String toAccount,Double amount);


}

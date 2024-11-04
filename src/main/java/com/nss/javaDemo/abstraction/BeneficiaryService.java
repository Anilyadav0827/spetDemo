package com.nss.javaDemo.abstraction;

import java.util.ArrayList;

public class BeneficiaryService {


    Beneficiary addBeneficiary(Beneficiary beneficiary,Account account){


        ArrayList<Beneficiary> beneficiaries= SBIAccountDBService.accountBeneficiary.get(account.getAccount());

        if(beneficiaries!=null){
            beneficiaries.add(beneficiary);
        }else {
            beneficiaries=new ArrayList<Beneficiary>();
            beneficiaries.add(beneficiary);
            SBIAccountDBService.accountBeneficiary.put(account.getAccount(), beneficiaries);
        }

        return beneficiary;
    }
}

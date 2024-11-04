package com.nss.javaDemo.uberDemo.variablesDemo;

public class Test {



    // int i;

    public static void main(String[] args) {

       // System.out.println(i);

        Variables variables= new Variables();
        System.out.println(variables.getInstanceNumber());

        System.out.println(" varibales: "+Variables.getStaticNumber()+1);

     int  variables3 = Variables.getStaticNumber()+1;
        System.out.println(Variables.getStaticNumber()+1);

     int variable4=Variables.getStaticNumber();

        System.out.println(variable4);




    }




}

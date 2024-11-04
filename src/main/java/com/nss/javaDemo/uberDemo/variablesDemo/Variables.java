package com.nss.javaDemo.uberDemo.variablesDemo;

public class Variables {


private int instanceNumber;
private static int  staticNumber;

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(int instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    public static int getStaticNumber() {
        return  staticNumber;
    }

    public static void setStaticNumber(int staticNumber) {
        Variables.staticNumber = staticNumber;
    }


    // to prove that normal block executes before the construtor executes
    // and prove the static block executes only one time and it excecutes while loading the class and before the cnstr excecute


    public Variables (){
        System.out.println("no arguments constructor");
    }


    static  {
        System.out.println(" from static block");
    }
    {
        System.out.println("non static block");
    }

}

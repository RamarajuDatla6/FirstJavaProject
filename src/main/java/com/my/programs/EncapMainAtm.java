package com.my.programs;

public class EncapMainAtm {
    public static void main(String[] args) {
//        EncapAtm atm1 = new EncapAtm();
//        atm1.custName = "Vijay";
//        atm1.phoneNo = 123456;
//        atm1.accBalance = 550;
//
//        System.out.println("Customer name is "+atm1.custName);
//        atm1.accBalance = 1000;
//        System.out.println("Account balance is : "+atm1.accBalance);
//
//        atm1.withdraw(998);
//        atm1.withdraw(1);
//        atm1.withdraw(10);
//
//        atm1.accBalance = 1000;
//        atm1.withdraw(1000);
        EncapAtm atm1 = new EncapAtm();
        atm1.custName = "Vijay";
        atm1.phoneNo = 123456;
        atm1.balanceAmt = 1000;
        atm1.withdraw(900);
        atm1.withdraw(200);

//        EncapNewAtm atm2 = new EncapNewAtm(123456,"Vijay",1000);
//        atm2.withdraw(900);
//        atm2.withdraw(200);
    }
}

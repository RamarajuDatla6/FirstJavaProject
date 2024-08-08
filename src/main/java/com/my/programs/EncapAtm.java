package com.my.programs;

public class EncapAtm {
    public String custName;
    public double phoneNo;
    public double balanceAmt;

    public void withdraw(double amount){
        if (balanceAmt < amount){
            System.out.println("Insufficient balance");
        }else {
            balanceAmt = balanceAmt - amount;
            System.out.println("Thanks for withdrawing. Remaining balance is :"+balanceAmt);
        }
    }
}

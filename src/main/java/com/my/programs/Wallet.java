package com.my.programs;

import java.util.Scanner;

public class Wallet extends ShoppingCart {
    double wallet_balance = 25.00;

//    public void balace(){
//        double balance = 0.00;
//        System.out.println("Your current wallet balance is "+ balance);
//    }

    public void recharge(double amount){
        wallet_balance = wallet_balance + amount;
        System.out.println("Your recharge successful");
        System.out.println("Your balance after recharge is "+ wallet_balance);
    }

    public void update(double item_price){
        wallet_balance = wallet_balance - item_price;
        System.out.println("Your updated balance"+wallet_balance);
    }

    public void bill(double item_price){
        if (wallet_balance > item_price){
            System.out.println("Thanks for Purchasing");
            update(item_price);
        }else if (item_price > wallet_balance){
            System.out.println("Low balance ");
            double rechargeWith = item_price - wallet_balance;
            System.out.println("Please recharge your wallet with "+ rechargeWith);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount you want to recharge with ");
            double amount = sc.nextDouble();
            recharge(amount);
        }
    }

}

// Create a new class for a Grocery Mart,and create the following fields:
// customer name,customer id,customer phone number,customer account balance & customer address

// user Getter and Setter for  each field

// create the following below methods :
// to allow the customer to shop for a max amount which is availabe in his account,else notify the customer to add more money
// A method to add balance to his  account

package com.my.programs;

public class MainGroceryMart {
    public static void main (String[]args){
        //GrocMart myAccount = new GrocMart("Vijay","#1235","9876543210",500.52,"India");
        //GrocMart myAccount = new GrocMart("defcustname","defid","defphno",300);
        GrocMart myAccount = new GrocMart();
        GrocMart RajuAccount = new GrocMart("Vijay","#12","3210",100,"USA");
        //myAccount.setCustname("Vijay");
        //myAccount.setAccbal(500.52);
        //myAccount.setCustphno("9876543210");
        //myAccount.setCustid("#1235");
        //myAccount.setAddress("India");

        System.out.println(RajuAccount.getAccbal());
        System.out.println(myAccount.getCustphno());

        GrocMart newAcc = new GrocMart("NewCustomer","#12123","56556");
        System.out.println(newAcc.getCustname());
        System.out.println(newAcc.getAccbal());


        myAccount.shop(498.52);
    }
}

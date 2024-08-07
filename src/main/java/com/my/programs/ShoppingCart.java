package com.my.programs;

public class ShoppingCart extends ShoppingList {
    public static double price(String item_name){
        double price = 0;
        if (item_name == "Fruits"){
            price = 40.50;
        } else if (item_name == "Vegetables") {
            price = 60.00;
        } else if (item_name == "Spices") {
            price = 105.25;
        } else if (item_name == "Drinks") {
            price = 20.00;
        }
        return price;
    }
}

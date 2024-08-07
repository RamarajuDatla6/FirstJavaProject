//Create a class ShoppingList which will contain the list of all the items that are there to shop from.

//Create another class ShoppingCart that will extend ShoppingList,
// there will be a method price in ShoppingCart, which will calculate the price of the shopping item.

//Create one more class wallet which will extend ShoppingCart,
// there will be different methods in the wallet class,
// which will generate the bill and update and recharge the wallet  balance accordingly.

// Note - It will also display an appropriate message if the wallet balance is less than the shopping cart value.
package com.my.programs;

public class ShoppingList {
    public static String list(int item_code){
        String item_name = " ";
        switch (item_code){
            case 1:
                item_name = "Fruits";
                System.out.println("Item name is "+item_name);
                return item_name;
            case 2:
                item_name = "Vegetables";
                System.out.println("Item name is "+item_name);
                return item_name;
            case 3:
                item_name = "Spices";
                System.out.println("Item name is "+item_name);
                return item_name;
            case 4:
                item_name = "Drinks";
                System.out.println("Item name is "+item_name);
                return item_name;
            default:
                System.out.println("Wrong item is selected");
                break;
        }
        return item_name;
    }
}

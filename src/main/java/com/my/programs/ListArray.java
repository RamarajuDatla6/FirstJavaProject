package com.my.programs;

import java.util.ArrayList;

public class ListArray {

    private ArrayList<String> shoppingCart = new ArrayList<>();


    public void addItem(String item){
        shoppingCart.add(item);
    }


    public void printList(){
        System.out.println("There are "+ shoppingCart.size()+" items in your cart");
        for (int i = 0;i < shoppingCart.size();i++){
            System.out.println("Item no "+(i + 1)+" is "+shoppingCart.get(i));
        }
    }

    public void modifyCart(int position,String newItem){
        shoppingCart.set(position,newItem);
        System.out.println("Shopping item "+(position + 1)+" has been updated");
    }

    public void removeItem(int position){
        String itemName = shoppingCart.get(position);
        shoppingCart.remove(position);
    }

    public String searchItem (String itemToBeSearched){
        int position = shoppingCart.indexOf(itemToBeSearched);
        if (position >= 0){
            return shoppingCart.get(position);
        }else
            return null;
    }
}

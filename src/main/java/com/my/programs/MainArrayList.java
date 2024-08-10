package com.my.programs;

import java.util.Scanner;

public class MainArrayList {

    private static Scanner sc = new Scanner(System.in);
    public static ListArray shopCart = new ListArray();


    public static void main(String[] args) {

        boolean exit = false;
        int userChoice = 0;
        printInstructions();
        while (!exit){
            System.out.println("Enter your choice");
            userChoice = sc.nextInt();
            sc.nextLine();

            switch (userChoice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    shopCart.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("0 - To print choices");
        System.out.println("1 - To print shopping List");
        System.out.println("2 - To add an item");
        System.out.println("3 - To modify an item");
        System.out.println("4 - To remove an item");
        System.out.println("5 - To search an item");
        System.out.println("6 - To exit the app");
    }
    public static void addItem(){
        System.out.print("Please enter the shopping item");
        shopCart.addItem(sc.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter the item number : ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the replacement");
        String newItem = sc.nextLine();
        shopCart.modifyCart( itemNo-1, newItem);
    }
    public static void removeItem(){
        System.out.print("Insert item to search : ");
        int itemName = sc.nextInt();
        sc.nextLine();
        shopCart.removeItem( itemName-1);
    }
    public static void searchItem(){
        System.out.println("Insert item you want to search : ");
        String searchIT = sc.nextLine();


        if ((shopCart.searchItem(searchIT)) !=null){
            System.out.println("Item found");
        }
        else System.out.println("Item not found");
    }
}

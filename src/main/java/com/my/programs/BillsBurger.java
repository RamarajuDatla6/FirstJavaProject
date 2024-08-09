//Create a program that will generate a bill at McDonald's
//        for four vegetable burgers (@ Rs 45 per vegetable Burger) and three vegetable McPuffs (@ Rs 25 per vegetable McPuff).
//There is a special Independence Day discount of Rs 50 on the final bill amount.
//
package com.my.programs;

public class BillsBurger {
    public static void main(String[] args) {
        int vegBurgers = 4 * 45;
        int vegMcPuffs = 3 * 25;
        int total = vegBurgers+vegMcPuffs;
        int discount = total - 50;
        int bill = discount;
        System.out.println(" veg Burgers 4 = "+vegBurgers);
        System.out.println(" veg McPuffs 3 = "+vegMcPuffs);
        System.out.println(" Total = "+bill);
    }
}

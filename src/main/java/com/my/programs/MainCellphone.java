package com.my.programs;

public class MainCellphone {
    public static void main (String[]args){
        Cellphone Oneplus = new Cellphone();
        Oneplus.setModel("8pro");
        System.out.println("The phone model is " + Oneplus.getModel());
    }
}

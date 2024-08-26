package com.my.programs;

public class ArithmeticException1 {
    public static void main(String[] args) {
        int x =20;
        int y = 10;

//        int z = x/y;
//        System.out.println(z);

        //System.out.println(divideLBYL(x,y));
        System.out.println(divideEAFP(x,y));
    }


    public static double divideLBYL(int x,int y){
        if (y != 0){
            return x/y;
        }else
            return 0;
    }


    public static double divideEAFP(int x,int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return 0;
        }
    }
}


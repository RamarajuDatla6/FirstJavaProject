package com.my.programs;

public class MultiCatchExceptions {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        } catch (ArithmeticException e1){
            System.out.println("This is never reached");
        }


        catch (Exception e){
            System.out.println("Generic exception catch");
        }

//        catch (ArithmeticException e1){
//            System.out.println("This is never reached");
//        }
    }
}

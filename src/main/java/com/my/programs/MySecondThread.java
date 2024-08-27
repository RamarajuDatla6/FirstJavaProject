package com.my.programs;

public class MySecondThread extends Thread {

    @Override
    public void run() {
        System.out.println("This is a sub thread "+currentThread().getName());
        System.out.println("This is a sub thread "+currentThread().getId());
        System.out.println("This is a sub thread " + currentThread().getPriority());




        try {

            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("Interrupted by another thread");
        }


        System.out.println("5 seconds have passed");
    }
}

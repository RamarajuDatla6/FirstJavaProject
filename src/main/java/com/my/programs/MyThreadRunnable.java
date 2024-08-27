package com.my.programs;

public class MyThreadRunnable implements Runnable{

    @Override
    public void run() {
       // System.out.println("This is the runnable interface");



        try {

            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }

        System.out.println("waited for 1 sec and resumed");

    }
}

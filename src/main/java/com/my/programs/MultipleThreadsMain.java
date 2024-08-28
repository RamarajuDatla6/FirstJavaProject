package com.my.programs;

public class MultipleThreadsMain {

    public static void main(String[] args) {

        add addition = new add();


        addCount t1 = new addCount(addition);
        t1.setName("Thread 1");
        addCount t2 = new addCount(addition);
        t2.setName("Thread 2");


        t1.start();
        t2.start();
    }

}

class add{
    int i;

    public synchronized void doCountDown(){
        String color;

        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color = MultipleThreadsColor.red;
                break;
            case "Thread 2":
                color = MultipleThreadsColor.blue;
                break;
            default:
                color = MultipleThreadsColor.yellow;
        }

        int n = 0;
        for (i = 0;i < 10;i++){
            n = n + 1;
            System.out.println(color+Thread.currentThread().getName()+" : n = "+n);

        }
    }
}

class addCount extends Thread{
    private add threadCountdown;


    public addCount(add threadCountdown){
        this.threadCountdown = threadCountdown;
    }


    public void run(){
        threadCountdown.doCountDown();
    }


}
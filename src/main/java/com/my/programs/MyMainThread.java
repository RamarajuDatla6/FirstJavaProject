package com.my.programs;

public class MyMainThread {
    public static void main(String[] args) {

        System.out.println("this is the main thread");

        Thread secThread = new MySecondThread();
        secThread.setName("Thread2");
        //secThread.setPriority(10);
        secThread.start();

//        Thread letsRun = new Thread(new MyThreadRunnable());
//        letsRun.start();                                          or

        MyThreadRunnable r1 = new MyThreadRunnable();
        Thread letsRun = new Thread(r1);
        letsRun.start();
        letsRun.interrupt();

        new Thread(){
            public void run(){
                System.out.println("New Thread");


                try{
                    secThread.join(5000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("interrupted");
                }
            }
        }.start();





        System.out.println("New main thread");

        //   secThread.start();      #3 exception arises.IllegealThreadException
                                   // we can use only one instace on start.we have to create another instance to start

    }
}

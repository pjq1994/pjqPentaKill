package com.panda.complex.test;

public class InterruptDemo implements Runnable{

    public static void main(String[] args) throws InterruptedException {



        Thread t = new Thread(new InterruptDemo());
        t.start();

        Thread.sleep(5000);
        t.interrupt();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().isInterrupted());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("走到异常了");
                Thread.currentThread().interrupt();
            }
            System.out.println("继续");
        }
    }
}

package com.panda.complex.thread;

public class SynchronizedDemo {

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo1 sd=new SynchronizedDemo1();
//        SynchronizedDemo1 sd2=new SynchronizedDemo1();
        Thread t1=new Thread(sd);
        t1.start();
//        Thread.sleep(10);
        sd.m2();
    }
    static class SynchronizedDemo1 implements Runnable{
        int b=0;
        @Override
        public void run() {
            try {
                m1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public synchronized void m1() throws InterruptedException {
            System.out.println("m1");
            b=100;
            Thread.sleep(3000);
            System.out.println("b="+b);
        }
        public synchronized void m2() throws InterruptedException {
            System.out.println("m2");
            Thread.sleep(1000);
            b=500;
            System.out.println(b);
        }
    }

}

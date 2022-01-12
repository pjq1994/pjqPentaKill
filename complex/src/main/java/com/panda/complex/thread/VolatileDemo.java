package com.panda.complex.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VolatileDemo {
    Lock lock = new ReentrantLock();
//    public static boolean flag = false;
    public  static int n=0;

    public static void main(String[] args) {

        new ThreadDemo1().start();
        while(n < 100){

        }
        System.out.println("over and n="+n);
    }
    public static  void add(){
        n++;
    }
    static class ThreadDemo1 extends Thread{
        @Override
        public void run() {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            for(int i=0;i<200;i++){
                add();
            }
        }
    }
}

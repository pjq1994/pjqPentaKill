package com.panda.complex.thread;

public class LockDemo {
    static LockDemo instance;

    private LockDemo() {
    }

    public static  LockDemo getInstance(){
        if (instance==null){
            synchronized (LockDemo.class){
                if (instance==null){
                    instance = new LockDemo();
                }
            }
        }
        return instance;
    }


}

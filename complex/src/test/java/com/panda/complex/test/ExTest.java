package com.panda.complex.test;

import org.junit.Test;

public class ExTest extends ApException{
    public ExTest(String msg) {
        super(msg);
    }

    public static void main(String[] args) {
        ExTest test = new ExTest("测试异常");
        System.out.println(test.getErrorCode());
    }

    @Test
    public void subStr(){
        int len = 10;
        String str = "1";
        
    }
}

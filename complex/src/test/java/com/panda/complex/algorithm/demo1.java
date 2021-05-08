package com.panda.complex.algorithm;

import com.fasterxml.jackson.databind.node.ArrayNode;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月数:");
        int mouth = scanner.nextInt();
        int a=0,b=1,i,t;
        for (i=2;i<=mouth;i++){
            t=b;
            b=a+b;
            a=t;
        }
        System.out.println("第"+mouth+"个月有"+b+"对兔子");
    }
}

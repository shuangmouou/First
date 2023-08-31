package com.FirstClass;

import java.util.Scanner;

public class appointment {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦程度");
        int number = sc.nextInt();
        System.out.println("请输入相亲对象时髦程度");
        int number2 = sc.nextInt();
        if (number > number2){
            System.out.println("相亲成功");
        }
        else {
            System.out.println("傻逼");
        }
    }
}

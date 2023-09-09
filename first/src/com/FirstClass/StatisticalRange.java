package com.FirstClass;

import java.util.Scanner;

public class StatisticalRange {
    public static void main(String[] args) {
        //统计总共有多少个
        int count = 0;
        //录入两个数字表示一个范围，既能被3整除，也能被5整除的有多少个？
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字，开始");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字，结束");
        int num2 = sc.nextInt();
        //开始条件，num1
        //结束条件，num2
        for (int i = num1; i <= num2; i++) {
           /* System.out.println(i);*/
            if (i%3==0 && i%5==0){
               /* System.out.println(i);*/
                count++;
            }
        }
        System.out.println(count);
    }
}

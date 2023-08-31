package com.FirstClass;

public class EvenSum {
    public static void main(String[] args) {
        //求1~100之间的偶数和
        int sum = 0;
        for (int i = 1; i<=100; i++ ){
            /*System.out.println(i);*/
            if (i%2==0){
                sum = i+sum;
            }
        }
        System.out.println(sum);
    }
}

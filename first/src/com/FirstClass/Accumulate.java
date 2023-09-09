package com.FirstClass;

public class Accumulate {
    public static void main(String[] args) {
        //求1~5的和
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            /*System.out.println(i);*/
            sum = sum + i;//sum+=i,意思是sum等于sum+i

        }
        System.out.println(sum);
    }
}

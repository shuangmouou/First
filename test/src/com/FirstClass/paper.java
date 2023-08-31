package com.FirstClass;

public class paper {
    public static void main(String[] args) {
        /*需求:世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?*/


//珠穆朗玛峰的高度
        double height = 8844430;
//纸张的厚度
        double paper = 0.1;
//次数
        int a = 0;

        while (paper < height){
            paper = paper * 2;
            a++;
            System.out.println(a);
        }
    }
}

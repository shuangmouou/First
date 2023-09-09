package com.FirstClass;

public class SelfIncrease<a> {
   /*public static void main(String[] args){
       int a = 10;
       int b = ++a;
       //先加后用，意思就是先a+1之后，然后再赋值给b。
       System.out.println(a);//11
       System.out.println(b);//11
   }*/


    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        //这里的意思是先用后加，意思是先赋值给b后，再a++变成11
        System.out.println(b);//10
        System.out.println(a);//11
    }}

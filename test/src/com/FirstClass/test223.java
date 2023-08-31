package com.FirstClass;


import java.util.Scanner;

public class test223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Integer str2 = Integer.parseInt(str);
        String a = "shm";
        String b = "fhuangmou";

        int result = a.compareTo(b);
        if(str2.equals(result)){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }

    }
}

package com.FirstClass;


import java.util.Scanner;

public class test223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Integer str2 = Integer.parseInt(str);
        //将字符串转换为整数类型
        String a = "shm";
        String b = "fhuangmou";

        int result = a.compareTo(b);
        //result =  13
        if(str2.equals(result)){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }

    }
}

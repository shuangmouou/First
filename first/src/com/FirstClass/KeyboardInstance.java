package com.FirstClass;

import java.util.Scanner;

public class KeyboardInstance {
    public static void main(String[] args) {
        //键盘录入一个三位数，获取其中的个位，十位，百位
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        //这段代码创建了一个Scanner实例，用于从控制台读取输入，以读取用户提供的输入。
        //第二种翻译，这段代码创建了一个Scanner对象sc，调用System.in方法，从标准输入中读取数据。
        System.out.print("请输入一个三位数");
        int number = sc.nextInt();
        //这段代码的意思是，从输入流(Scanner sc)中读取一个int类型的数字，并将其存储在变量number中。
        int ge  = number % 10 ;
        int shi = number /10 %10;
        int bai = number /100 %10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}

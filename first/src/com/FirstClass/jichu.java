package com.FirstClass;

public class jichu {

    public static void main(String []args){
        System.out.println(3+2);
        System.out.println(2 * 5);
        System.out.print(100/ 50);
        System.out.println(10.0 / 3);
        //取模，取余。实际也是做除法运算，不过得到的是余数而已。
        System.out.println(50 % 30);
        System.out.println(100 %100);
        System.out.println(01 / 1);
        //应用场景:
//1.可以用取模来判断，A是否可以被B整除
// A % B   10 % 3 结果为1
//2.可以判断A是否为偶数
//A % 2如果结果为o.那么证明A是一个偶数。如果结果为1，那么证明A是一个奇数//
// 3.在以后，斗地主发牌
//三个玩家
//把每一张牌都定义一个序号
//拿着序号 % 3如果结果为1，就发给第一个玩家。//如果结果为2，那么就发给第二个玩家
//如果结果为o，那么就发给第三个玩家

    }
}

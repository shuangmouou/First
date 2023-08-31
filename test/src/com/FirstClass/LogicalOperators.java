package com.FirstClass;

public class LogicalOperators {
    public static void main(String[] args){
        //1.&并且
        //两边都为真，结果才是真
        System.out.println(true&true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false

        //2.| 或者
        //两边都是假，结果才为假
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true

        //3. ^ 异或
        //相同为false，不同为true
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false

        //4. ! 逻辑非，取反
        //true 为 false， false 为 true
        //取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!true);//false
        System.out.println(!false);//true




    }
}

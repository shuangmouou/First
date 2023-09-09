package com.FirstClass;

/*public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int tiger1 = sc.nextInt();
        System.out.println("请输入第二只老虎");
        int tiger2 = sc.nextInt();
        String result = tiger1 == tiger2 ? "相同重" : "不一样重" ;
        System.out.println(result);
    }
}*/

public class homework {
    public static void main(String[] args) {
        int monk1 = 150;
        int monk2 = 210;
        int monk3 = 165;
        int result = monk2 > monk1 ?  monk2 : monk2;
        String result2 = result > monk3 ? "和尚2最高" : "和尚3最高";
        System.out.println(result2);


    }
}
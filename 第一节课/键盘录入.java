//导包 --Scanner这个类在哪
import java.util.Scanner;
public class 键盘录入{
    //主入口
   public static void main (String[] args){
                //创建对象 --表示我们要开始用Scanner这个类了
                Scanner sc = new Scanner(System.in);
                 //写个小提示
                 System.out.print("请输入字符串"+"\n");
                //接收数据 --真正开始干活了
                String 字符串 = sc.nextLine();
                //打印数据到控制台
                System.out.print("请输入数字"+"\n");
                int 数字 = sc.nextInt();
                System.out.print(字符串+数字);
                
   }
}
import java.util.ArrayList;
import java.util.List;

public class Number和Math类 {
    public static void main(String[] args) {
        /*Integer定义变量时是将变量封装为对象，Integer类提供了自动装箱和拆箱的功能。
         自动装箱是指将int类型的值自动转换为Integer对象，而自动拆箱是指将Integer对象自动转换为int类型的值
         。这样可以方便地在基本数据类型和引用类型之间进行转换。*/

        //int定义时是基础数据类型，int作为基本数据类型，它直接存储整数值，不需要额外的内存开销
        Integer x = 5;
        x =  x + 10;
        System.out.println(x);
        System.out.println("----------");
        integer();

    }

    //以下是一个只能使用Integer的例子

    public static void integer(){
        System.out.println("Integer例子");
        List<Integer> numbers = new ArrayList<>(); // 使用List存储整数值
        /*List<int> numbers = new ArrayList<>();
        如果我们尝试将int类型的值直接添加到List中，会导致编译错误，因为List只能存储对象。
         */
        numbers.add(10); // 添加整数值到List中
        numbers.add(20);
        numbers.add(30);

        for (Integer number : numbers) {
            System.out.println(number); // 输出List中的整数值
        }
    }
}

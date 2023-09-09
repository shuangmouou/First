package com.FirstClass;

public class 强转数据类型以及new的理解 {
    //在Java中，可以使用强制类型转换（也称为类型转换）来将一个数据类型转换为另一个数据类型。强制类型转换的语法如下：
    //<目标类型> <变量名> = (<目标类型>) <表达式>;
    public static void main(String[] args) {

        test223 test1 = new test223();
        int a = 10;
        double b = 3.14;

// 将int类型的变量a转换为double类型
        double c = (double) a;
        System.out.println(c); // 输出: 10.0

// 将double类型的变量b转换为int类型
        int d = (int) b;
        System.out.println(d); // 输出: 3
        String string = String.valueOf(new StringBuffer(test()));
        //new StringBuffer是Java中的一个可变字符串类，它提供了一系列方法来操作字符串。通过new StringBuffer(test())创建的StringBuffer对象会将test()方法返回的字符串作为初始内容。
        //当我们使用new关键字创建一个新对象后赋值给一个变量，可以将其类比为购买一件新的物品并将它放在一个盒子里，然后将盒子的地址（引用）赋值给一个标签。
        //
        //假设你购买了一本新书，并希望将它存储在一个变量中以便后续阅读。你可以使用new关键字创建一个新的书对象，并将它放在一个书盒子里。
        // 然后，你将这个书盒子的地址（引用）赋值给一个标签，比如book。
        //
        //现在，你可以使用book这个标签来操作这本书。你可以打开书盒子，阅读书的内容，或者进行其他操作，比如书签记号、翻页等等。通过这个标签，你可以方便地找到并操作这本书。
        //
        //在这个例子中，书盒子就相当于通过new关键字创建的新对象，而book标签就相当于存储对象引用的变量。通过将对象的引用存储在变量中，我们可以方便地对对象进行操作和访问，就像使用标签来找到并操作书一样。
        //
        //希望这个生活实例能够帮助你更好地理解使用new关键字创建新对象并赋值给变量的作用。
        System.out.println(string);







    }

    public static int test() {
            return 10;
    }

//        public static void fuck() {
//            String sb = new String();
//
//            for (int i = 1; i <= 10; i++) {
//                sb.append(i).append(" "); // 在StringBuilder对象中拼接数字和空格（这个append是报错的，因为string是不可变数据类型，得用可变数据类型，stringbuffer或者stringbuilder）
//            }
//
//            String result = sb.toString(); // 将StringBuilder对象转换为String类型
//
//            System.out.println(result); // 输出拼接后的字符串
//
//    }
//
}



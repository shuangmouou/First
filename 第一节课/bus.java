public class bus{
    public static void main(String[]args){
        //公交车上没人
                int count = 0;
                
        //上车了一个人
                count = count+1;
                System.out.print(count+"\n");
        //上来两位乘客，下去一位乘客
                count = count+2-1;
                System.out.print(count+"\n");      
        //上来两位乘客，下去一位乘客
                count = count+2-1;
                System.out.print(count+"\n");
        //下来一位
                count = count-1;
                System.out.print(count+"\n");
        //上去一位
                count = count+1;
                System.out.print(count);
    }
}
package t_01;

import java.util.Scanner;

/**
 * @ClassName t_01.test07
 * @Description TODO
 * @Author khoing
 * @Date 2019/8/26 21:28
 * @Version 1.0
 **/
//控制台输入数据
public class test07 {
    public static void main(String[] args) {
//        使用Scanner读取整数
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数："+a);
        int b = s.nextInt();
        System.out.println("第二个整数："+b);

//        使用Scanner读取浮点数
        Scanner s1 = new Scanner(System.in);
        float a1 = s1.nextFloat();
        System.out.println("读取的浮点数的值是："+a1);

//        使用Scanner读取字符串
        Scanner s2 = new Scanner(System.in);
        String a2 = s2.nextLine();
        System.out.println("读取的字符串是："+a2);

        Scanner s3 = new Scanner(System.in);

//        读取了整数后，接着读取字符串
        /**
         需要注意的是，如果在通过nextInt()读取了整数后，再接着读取字符串，读出来的是回车换行:"\r\n",
         因为nextInt仅仅读取数字信息，而不会读取回车换行"\r\n".
         所以，如果在业务上需要读取了整数后，接着读取字符串，那么就应该连续执行两次nextLine()，
         第一次是取走回车换行，第二次才是读取真正的字符串         */
        Scanner s4 = new Scanner(System.in);
        int i = s4.nextInt();
        System.out.println("读取的整数是"+ i);
        String rn = s4.nextLine();
        String a4 = s4.nextLine();
        System.out.println("读取的字符串是："+a4);

    }


}

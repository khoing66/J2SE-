package t_01;

/**
 * @ClassName t_01.test05
 * @Description TODO
 * @Author khoing
 * @Date 2019/8/26 21:13
 * @Version 1.0
 **/
//位操作符
public class test05 {
    public static void main(String[] args) {
//    一个整数的二进制表达
        /**
         * 位操作都是对二进制而言的，但是我们平常使用的都是十进制比如5。
         * 而5的二进制是101。
         * 所以在开始学习之前，需要掌握一个整数的二进制表达是多少。
         * 通过Integer.toBinaryString() 方法，将一个十进制整数转换为一个二进制字符串
         */
        int i = 5;
        String b = (Integer.toBinaryString(i)); // 5的二进制的表达101
        System.out.println(i+" 的二进制表达是: "+b);

//        位或
        /**
         * 5的二进制是101
         * 6的二进制是110
         * 所以 5|6 对每一位进行或运算，得到 111->7
         */
        int i1  =5;
        int j1 = 6;

        System.out.println(Integer.toBinaryString(i1)); //5的二进制是101

        System.out.println(Integer.toBinaryString(j1)); //6的二进制是110

        System.out.println(i1|j1); //所以 5|6 对每一位进行或运算，得到 111->7

//        位与
        /**
         * 5的二进制是101
         * 6的二进制是110
         * 所以 5&6 对每一位进行与运算，得到 100->4
         */

        int i2 = 5;
        int j2 = 6;
        System.out.println(Integer.toBinaryString(i2));
        System.out.println(Integer.toBinaryString(j2));
        System.out.println(i2&j2);

//        异或
        /**
         * 相同返回0，相反返回1
         * 5的二进制是101
         * 6的二进制是110
         * 所以 5^6 对每一位进行异或运算，得到 011->3
         *
         * 一些特别情况：
         * 任何数和自己进行异或 都等于 0
         * 任何数和0 进行异或 都等于自己
         */
        int i3  =5;
        int j3 = 6;
        System.out.println(Integer.toBinaryString(i3)); //5的二进制是 101
        System.out.println(Integer.toBinaryString(j3)); //6的二进制是110
        System.out.println(i3^j3); //所以 5^6 对每一位进行或运算，得到 011->3

        System.out.println(i3^0);
        System.out.println(i3^i3);

//        取非
        /**
         * 5 的二进制是 00000101
         * 所以取反即为 11111010
         * 这个二进制换算成十进制即为-6
         */
        byte i4  =5;
        System.out.println(Integer.toBinaryString(i4)); //5的二进制是00000101,所以取非即为11111010,即为-6
        System.out.println(~i4);

//        左移 右移
        /**
         * 左移：根据一个整数的二进制表达，将其每一位都向左移动，最右边一位补0
         * 右移：根据一个整数的二进制表达，将其每一位都向右移动
         * 左移*2
         * 右移/2
         */
        byte i5  =6;
        //6的二进制是110
        System.out.println(Integer.toBinaryString(i5));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(i5<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(i5>>1);



    }

}

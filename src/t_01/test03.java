package t_01;

/**
 * @ClassName t_01.test03
 * @Description TODO
 * @Author khoing
 * @Date 2019/8/26 18:36
 * @Version 1.0
 **/
//类型转换
public class test03 {

    public static void main(String[] args) {
        /**
         * 精度高的数据类型就像容量大的杯子，可以放更大的数据
         * 精度低的数据类型就像容量小的杯子，只能放更小的数据
         * 小杯子往大杯子里倒东西，大杯子怎么都放得下
         * 大杯子往小杯子里倒东西，有的时候放的下，有的时候就会有溢出
         * 需要注意的一点是
         * 虽然short和char都是16位的，长度是一样的
         * 但是彼此之间，依然需要进行强制转换
         */
        char c = 'A';
        short s = 80;
        //虽然short和char都是16位的，长度是一样的
        //但是彼此之间，依然需要进行强制转换
        c = (char) s;
        //直接进行转换，会出现编译错误
        //s = c;

//        低精度向高精度转换
        long l = 50;
        int i = 50;

        //int比较小，要放进比较大的long,随便怎么样，都放的进去
        l = i;

//        高精度向低精度转换
        byte b = 5;
        int i1 = 10;
        int i2 = 300;

        b = (byte) i1;
        //因为i1的值是在byte范围之内，所以即便进行强制转换
        //最后得到的值，也是10
        System.out.println(b);

        //因为i2的值是在byte范围之外，所以就会按照byte的长度进行截取
        //i2的值是300，其对应的二进制数是 100101100
        //按照byte的长度8位进行截取后，其值为 00101100 即44
        b =(byte) i2;
        System.out.println(b);

        //查看一个整数对应的二进制的方法：
        System.out.println(Integer.toBinaryString(i2));





    }

}

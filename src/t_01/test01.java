package t_01;

/**
 * @ClassName Hero
 * @Description TODO
 * @Author khoing
 * @Date 2019/8/26 17:49
 * @Version 1.0
 **/

//基本数据类型
public class test01 {
    public static void main(String[] args) {

//         整型
        /**
         * byte---8位--->-128~127
         * short---16位--->-32768~32767
         * int---32位--->
         * long---64位--->
         */
        byte b = 1;
        short s = 200;
        int i = 300;
        long l = 400;
        //若赋值超过范围，则会报错
        //byte b1 = 128;

//        字符型
        //char类型用于存放一个字符，值用单引号'表示 (双引号表示字符串)
        //其长度和short一样，也是16位的
        //只能存放一个字符，超过一个字符就会产生编译错误

        char c = '1';
        char c1 = '李';

        //char 只能存放一个字符，超过一个字符就会产生编译错误
        //char c2 = '中国'; //报错
        //char c3 = 'ab'; //报错

//        浮点型
        /**浮点数类型有两种
        float 长度为32位
        double 长度为64位
        注意： 默认的小数值是double类型的
        所以 float f = 54.321会出现编译错误，因为54.321的默认类型是 double，其类型 长度为64，超过了float的长度32
        在数字后面加一个字母f，直接把该数字声明成float类型
        float f2 = 54.321f,
                这样就不会出错了**/
        double d = 123.45;

        //该行会出现编译错误，因为54.321是double型的
        //float f = 54.321;
        float f2 = 54.321f;

//        布尔型
        /**
         * 布尔型用于表示真假
         * 其长度为1
         * boolean b1 = true;
         * boolean b2 = false;
         * 分别代表真假
         * 虽然布尔型真正存放的数据是0(false) 1(true)
         * 但是，不能直接使用0 1 进行赋值
         */
        boolean b1 = true;
        boolean b2 = false;

        // 虽然布尔型真正存放的数据是0(false) 1(true)
        // 但是，不能直接使用0 1 进行赋值
        //boolean b3 = 1;

//        String类型
        /**
         * String类型其实并不是基本类型，但是它是如此广泛的被使用，常常被误以为是一种基本类型。
         * String类型是Immutable的，一旦创建就不能够被改变
         */
        String str = "Hello Java";



    }
}

package t_01;

/**
 * @ClassName t_01.test02
 * @Description TODO
 * @Author khoing
 * @Date 2019/8/26 18:06
 * @Version 1.0
 **/
//字面值
public class test02 {
    public static void main(String[] args) {
        /**
         * 创建一个Hero对象会用到new关键字，但是给一个基本类型变量赋值却不是用new. 因为基本类型是Java语言里的一种内置的特殊数据类型，并不是某个类的对象。
         * 给基本类型的变量赋值的方式叫做 字面值，
         * 如下所例：
         * float hp = 313f;
         * int armor = 24;
         */

//    整型字面值
        /**
         * 当以l或者L结尾的时候，一个整数字面值是long类型，否则就是int类型。 建议使用大写的L而非小写的l，因为容易和1混淆。
         * byte,short,int和long的值都可以通过int类型的字面值来创建。整数的字面值可以用如下四种进制来表示：
         * 十进制: 基 10, 包含从0-9的数字，平常用的就是这种
         * 十六进制: 基 16, 包含从0-9的数字，和从A-F的字母。
         * 八进制: 基 8, 包含从0-7的数字
         * 二进制: 基 2, 包含0和1。（从 JAVA7开始就可以创建 二进制的字面值了）
         */
        long val = 26L; //以L结尾的字面值表示long型
        int decVal = 26; //默认就是int型
        int hexVal = 0x1a; //16进制
        int oxVal = 032; //8进制
        int binVal = 0b11010; //2进制
        System.out.println(oxVal);//结果会以十进制显示。

//        浮点数字面值
        /**
         * 当以f或者F结尾的时候，就表示一个float类型的浮点数，否则就是double类型（以d或者D结尾，写不写都可以）。
         * 浮点数还可以用E或者e表示（科学计数法）
         * e2表示10的二次方，即100
         * 1.234e2 = 1.234x100
         */
        float f1 = 123.4F;// 以F结尾的字面值表示float类型
        double d1 = 123.4;// 默认就是double类型
        double d2 = 1.234e2;// 科学计数法表示double

//        字符和字符串字面值
        /**
         * 字符的字面值放在单引号中
         * 字符串的字面值放在双引号中
         * 需要注意的是，\表示转义，比如需要表示制表符，回车换行，双引号等就需要用 \t \r \n \" 的方式进行
         */

        String name = "盖伦";
        char a= 'c';

        //以下是转义字符
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠
        System.out.println(tab);
        System.out.println(carriageReturn);
        System.out.println(newLine);
        System.out.println(doubleQuote);
        System.out.println(singleQuote);
        System.out.println(backslash);




    }

}

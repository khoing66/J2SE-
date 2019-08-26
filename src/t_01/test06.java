package t_01;

/**
 * @ClassName t_01.test06
 * @Description TODO
 * @Author khoing
 * @Date 2019/8/26 21:27
 * @Version 1.0
 **/
//三元操作符
public class test06 {
    public static void main(String[] args) {
    /**
     * 表达式?值1:值2
     * 如果表达式为真 返回值1
     * 如果表达式为假 返回值2
     */
        int i = 5;
        int j = 6;

        int k = i < j ? 99 : 88;

        // 相当于
        if (i < j) {
            k = 99;
        } else {
            k = 88;
        }

        System.out.println(k);

    }


}

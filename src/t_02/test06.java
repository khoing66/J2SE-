package t_02;

import java.util.Arrays;

/**
 * @ClassName test06
 * @Description TODO
 * @Author khoing
 * @Date 2019/8/26 22:15
 * @Version 1.0
 **/
//Arrays工具类
public class test06 {
    /**
     * Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。 大大提高了开发人员的工作效率。
     */
    public static void main(String[] args) {
//    数组复制
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        //左开右闭
        int[] b = Arrays.copyOfRange(a, 0, 3);
        Arrays.toString(b);

//        排序
        /**
         *  选择法排序 和 冒泡法排序，Arrays工具类提供了一个sort方法，只需要一行代码即可完成排序功能。
         */

        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));

//        搜索
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));

//        判断是否相同
        int a1[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int b1[] = new int[] { 18, 62, 68, 82, 65, 8 };
        System.out.println(Arrays.equals(a1, b1));


//        同一个值填充数组a
        Arrays.fill(a1, 5);
        System.out.println(Arrays.toString(a1));
    }
}

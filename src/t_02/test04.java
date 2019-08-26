package t_02;

import java.util.Arrays;

/**
 * @ClassName test04
 * @Description TODO
 * @Author khoing
 * @Date 2019/8/26 21:47
 * @Version 1.0
 **/
//选择法排序
public class test04 {
    public static void main(String[] args) {
        int a [] = new int[]{18,62,68,82,65,9};
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //第一种遍历数组
        System.out.println(Arrays.toString(a));
        //第二种
        for (int value : a) {
            System.out.println(value);

        }


    }
}

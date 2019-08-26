package t_02;

import java.awt.image.Kernel;
import java.util.Arrays;

/**
 * @ClassName test05
 * @Description TODO
 * @Author khoing
 * @Date 2019/8/26 21:59
 * @Version 1.0
 **/
//冒泡法排序
public class test05 {
    public static void main(String[] args) {
        int a [] = new int[]{18,62,68,82,65,9};
        int temp;
        int flag = 0;
        for (int j = a.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    flag = 1;
                }
            }
            if (0 == flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(a));


    }


}

package com.zyh.jb.week1;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName Arr
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/5
 **/
public class Arr {
    final static int Max = 5;

    public static void main(String[] args) {
        int[] a = new int[Max];
        Random random = new Random();
        for (int i = 0; i < Max; i++) {
            a[i] = random.nextInt(100);
            System.out.println(a[i] + " ");

        }
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println("最大值：" + max);
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];

            }
        }
        System.out.println("最小值：" + min);
        int sum = a[0];
        for (int i = 0; i<a.length; i++){
            sum += a[i];
        }
        System.out.println("和为：" + sum);
        Arrays.sort(a);
        System.out.println("排序后：" + Arrays.toString(a));

    }


}

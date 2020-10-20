package com.zyh.jb.week3;

import sun.text.resources.it.FormatData_it_IT;

import java.util.Date;
import java.util.Random;

/**
 * @ClassName OverLoadTestApp
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/19
 **/
public class OverLoadTestApp {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] data = new int[5][2];
        for(int[] tmp : data){
            tmp[0] = random.nextInt(2000);
            tmp[1] = random.nextInt(2000);
            System.out.println(OverLoadTest.sum(tmp[0], tmp[1]));
        }
    }
}
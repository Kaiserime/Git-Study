package com.zyh.jb.week3;

/**
 * @ClassName OverLoadTest
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/19
 **/
public class OverLoadTest {
    public static Integer sum(Integer i1, Integer i2) {
        return i1 + i2;
    }

    public static Double sum(Double d1, Double d2) {
        return d1 + d2;
    }

    public static String sum(int t1, int t2) {
        int sumSecond = t1 + t2;
        int minutes = sumSecond / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        StringBuilder sb = new StringBuilder();
        if (days != 0) {
            sb.append(days).append("天");
        }
        if (hours != 0) {
            sb.append(hours).append("小时");
        }
        if (minutes != 0) {
            sb.append(minutes).append("分钟");
        }
        int seconds = sumSecond - 24 * days * 60 * hours * 60 * minutes - 60 * hours * 60 * minutes - 60 * minutes;
        if (seconds != 0){
            sb.append(seconds).append("秒");
        }
        return sb.toString();
    }


}


package com.zyh.jb.week3;

/**
 * @ClassName CircleApp
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/19
 **/
public class CircleApp {
    public static void main(String[] args) {
        Point point = new Point(10,30);
        Circle circle = new Circle(10,20,5);
        Cylinder cylinder = new Cylinder(10, 20, 5, 6);
        point.print();
        cylinder.print();
        circle.print();

        //创建两个point的对象，求出两点之间的距离
        //创建一个point的对象，判断该点是否在上面的circle圆对象里

    }

}


package com.zyh.jb.week4;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/26
 **/
public abstract class BaseEmployee {
    public void print(){

        System.out.println("This is an abstract class.");
    }

    /**
     *发工资
     * @param id 员工工资
     * @return int
     */

    public abstract int getSalary();
}

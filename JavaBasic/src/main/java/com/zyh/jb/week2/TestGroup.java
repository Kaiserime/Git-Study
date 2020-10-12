package com.zyh.jb.week2;

import com.zyh.jb.week1.Arr;
import lombok.ToString;

import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName TestGroup
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/12
 **/
public class TestGroup {
    public static void main(String[] args) {
        Book book1 = new Book("追风筝的人",39,new Date());
        Book book2 = new Book("海边的卡夫卡",38,new Date() );
        Book book3 = new Book("教父",69,new Date());
        Book book4 = new Book("狂人日记",29,new Date());
        Book book5 = new Book("三体",49,new Date());

        phone phone1 = new phone("Iphone","6999");
        phone phone2 = new phone("OPPO","2999");
        phone phone3 = new phone("华为","5999");

        student student1 = new student("20029323546", "吴亦凡", "男", new phone[]{phone1}, new Book[]{book1});
        student student2 = new student("20029323547", "鹿晗", "男", new phone[]{phone2}, new Book[]{book1, book3});
        student student3 = new student("20029323548","迪丽热巴","女",new phone[]{phone3},new Book[]{book1,book4});

        Group group1 = new Group("复仇者联盟","first","吴亦凡");
        Group group2 = new Group("正义联盟","second","鹿晗，迪丽热巴");
        System.out.println(group1);
    }
}

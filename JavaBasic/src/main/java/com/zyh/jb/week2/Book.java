package com.zyh.jb.week2;

import lombok.*;

import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/12
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String name;
    private Integer price;
    private Date publishDate;


}
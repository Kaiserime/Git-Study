package com.zyh.jb.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName student
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/12
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class student {
    private String id;
    private String studentName;
    private String gender;
    private phone[] phones;
    private Book[] books;
}

package com.zyh.jb.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Group
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/12
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Group {
    private String groupName;
    private String id;
    private String student;
}

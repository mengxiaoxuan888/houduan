package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data                   //git,set方法
@AllArgsConstructor     //有参构造
@NoArgsConstructor      //无参构造
@ToString               //字符串打印
@Accessors(chain = true)
//CT,C#,WKTYPE,PTYPE
public class Projects {
    private int id;
    private String type;
    private String name;
    private String subname;
    private String introduce;
    private String details;
}

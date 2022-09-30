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
//捞资料
public class Salvage_Data {
    private int id;
    private String name;
    private String region;
    private String desc;
}

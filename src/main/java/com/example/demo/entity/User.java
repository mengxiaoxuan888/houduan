package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
//TableName("t_user")   //数据库中表叫做t_user，实体类叫User
//用户表
public class User {
    //TableId(value = "uid")    //数据库中表栏位叫做uid，实体类中叫id
    private int id;
    private String name;
    //TableField(value = "user_addr")   //数据库中表栏位叫做user_addr，实体类中叫addr
    private  String addr;
    @TableField(exist = false)  //不映射数据库表中的任何字段
    private String aaa;
}

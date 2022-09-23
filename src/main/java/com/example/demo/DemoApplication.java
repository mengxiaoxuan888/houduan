package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.example.demo.dao")   //第一种方式：这种方式更加灵活   第二种方式：@Mapping
public class DemoApplication {

    public static void main(String[] args) {SpringApplication.run(DemoApplication.class, args);}

    @GetMapping("/")
    public String index(){
        return "ok，后端环境搭建完成";
    }

}

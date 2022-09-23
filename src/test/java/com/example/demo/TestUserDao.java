package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestUserDao {
    @Autowired
    private UserDao userDao;

    //查询所有
    @Test
    public void testFindAll(){
        List<User> users = userDao.selectList(null);
        users.forEach(user -> System.out.print("user ="+user));
    }

    //根据主键查询1个
    @Test
    public void testFindById(){
        User user= userDao.selectById("1");
        System.out.println("user = " + user);
    }

    //条件查询
    @Test
    public void testFind(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.eq("name","小明");//查询name栏位=小明
        //queryWrapper.lt("age","20");//查询age<20
        //queryWrapper.le("age","20");//查询age<=20
        // gt 大于  ge 大于等于
        List<User> users= userDao.selectList(queryWrapper);
        users.forEach(user -> System.out.println("user = " + user));
    }

    //模糊查询
    @Test
    public void testFindLike(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.like("name","小");//查询name栏位包含小字
        //queryWrapper.likeLeft("name","小");//查询name栏位以小开头
        //queryWrapper.likeRight("name","小");//查询name栏位以小结尾
        List<User> users= userDao.selectList(queryWrapper);
        users.forEach(user -> System.out.println("user = " + user));
    }

    //保存
    @Test
    public void testSave(){
        User user = new User();
        user.setName("李四").setAddr("江西");
        userDao.insert(user);
    }

    //修改方法
    //基于主键id进行数据的修改
    @Test
    public void testUpdateById(){
        User user = userDao.selectById('4');
        user.setName("万股五");
        userDao.updateById(user);
    }

    //批量修改

    //删除方法
    //基于id进行删除
    @Test
    public void testDeleteById(){
        userDao.deleteById("6");
    }

    //基于条件进行删除
    @Test
    public void testDelete(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name","xiaowu");
        userDao.delete(queryWrapper);
    }

    //分页查询的使用
}

package com.dao;

import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sun.reflect.generics.tree.VoidDescriptor;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.getUserList();
//        for (User user : userList) {
//            System.out.println(user);
//        }
//        User userById = mapper.getUserById(2);
//        System.out.println(userById);
//        sqlSession.close();

        mapper.addUser(new User(7, "月社妃", "112211"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(3, "sion", "123d"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delUser(3);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test4(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("the_pwd","13452");
        map.put("the_id",9);
        map.put("the_name","gura");
        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test5(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("the_id",1);
        System.out.println(mapper.getUserById2(map));
        sqlSession.commit();
        sqlSession.close();
    }

}

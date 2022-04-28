package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
//     查全部用户

    List<User> getUserList();
    // 根据id查用户
    @Select("select * from mybatis.user where  id=#{id} ")
    User getUserById(@Param("id")int id2);
    //    插一个用户
    void addUser(User  user);

    void  updateUser(User user);

    void  delUser(int id);

}

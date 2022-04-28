package com.dao;

import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
//     查全部用户
    List<User> getUserList();
    // 根据id查用户
    User getUserById(int id);
    //    插一个用户
    void addUser(User  user);

    void  updateUser(User user);

    void  delUser(int id);

}

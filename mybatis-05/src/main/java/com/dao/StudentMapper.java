package com.dao;

import com.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生的信息以及对应的老师的信息
    List<Student> getAllStudent();
}

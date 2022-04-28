package com.dao;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
//    获取指定老师信息以及他的学生的信息
    Teacher getTeacher(@Param("tid") int id);
}

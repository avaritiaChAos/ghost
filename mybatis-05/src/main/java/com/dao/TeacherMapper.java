package com.dao;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    Teacher getTeacherById(@Param("tid") int  id);
}

package com.dao;

import com.pojo.Blog;
import com.utils.IdUtils;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Mytest {
    @Test
    public void addBlogTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap blog = new HashMap<>();
        blog.put("title","Java");
        mapper.queryBlogIf(blog);
        sqlSession.close();

    }
}

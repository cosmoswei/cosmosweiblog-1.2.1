package com.wei.cosmosweiblog.mapper;

import com.wei.cosmosweiblog.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BlogDao {
    List<Blog> queryAllBlog();

    Blog getBolgById(Integer id);

    int addBlog(Blog blog);

    @Select("select count(*) from blog_blog")
    int queryBlogCount();

    List<Blog> searchBlogByTitle(String title);
}

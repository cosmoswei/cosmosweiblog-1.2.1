package com.wei.cosmosweiblog.mapper;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.BlogUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface BlogUserDao {
    BlogUser queryUserById(Integer id);

    @Select("select * from blog_user")
    List<BlogUser> queryAllUser();

    BlogUser queryByName(String username);

    @Select("select count(*) from blog_user")
    int queryBlogUserCount();

    List<BlogUser> searchBlogByUsername(String username);

}

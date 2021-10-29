package com.wei.cosmosweiblog.service;

import com.wei.cosmosweiblog.pojo.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> queryAllBlog();

    Blog getBolgById(Integer id);

    int addBlog(Blog blog);

    int queryBlogCount();

    List<Blog> searchBlogByTitle(String title);

}

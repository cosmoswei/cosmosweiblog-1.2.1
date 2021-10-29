package com.wei.cosmosweiblog.service.impl;

import com.wei.cosmosweiblog.mapper.BlogDao;
import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.service.BlogService;
import com.wei.cosmosweiblog.service.BlogUserService;
import com.wei.cosmosweiblog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogDao blogDao;

    @Override
    public List<Blog> queryAllBlog() {
        return blogDao.queryAllBlog();
    }

    @Override
    public Blog getBolgById(Integer id) {
        return blogDao.getBolgById(id);
    }

    @Override
    public int addBlog(Blog blog) {
        return blogDao.addBlog(blog);
    }

    @Override
    public int queryBlogCount() {
        return blogDao.queryBlogCount();
    }

    @Override
    public List<Blog> searchBlogByTitle(String title) {
        return blogDao.searchBlogByTitle(title);
    }
}

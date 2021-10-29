package com.wei.cosmosweiblog.service.impl;

import com.wei.cosmosweiblog.mapper.BlogUserDao;
import com.wei.cosmosweiblog.pojo.BlogUser;
import com.wei.cosmosweiblog.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BlogUserServiceImpl implements BlogUserService {

    @Autowired
    private BlogUserDao blogUserDao;

    @Override
    public BlogUser queryUserById(Integer id) {
        return blogUserDao.queryUserById(id);
    }

    @Override
    public List<BlogUser> queryAllUser() {
        return blogUserDao.queryAllUser();
    }

    @Override
    public BlogUser queryByName(String username) {
        return blogUserDao.queryByName(username);
    }

    @Override
    public List<BlogUser> searchBlogByUsername(String username) {
        return blogUserDao.searchBlogByUsername(username);
    }
}

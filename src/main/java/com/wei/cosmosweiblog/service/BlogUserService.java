package com.wei.cosmosweiblog.service;

import com.wei.cosmosweiblog.pojo.BlogUser;

import java.util.List;

public interface BlogUserService {
    BlogUser queryUserById(Integer id);

    List<BlogUser> queryAllUser();

    BlogUser queryByName(String username);

    List<BlogUser> searchBlogByUsername(String username);

}

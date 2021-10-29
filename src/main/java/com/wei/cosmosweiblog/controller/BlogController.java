package com.wei.cosmosweiblog.controller;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.service.BlogService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @RequestMapping("/addBlog")
    public String addBlog(Blog blog) {
        blog.setUpdateTime(new SimpleDateFormat("yyyyy-MM-dd HH:mm:ss").toString());
        blogService.addBlog(blog);
        return "redirect:/toBlogList";
    }

    @RequestMapping("/toBlogList")
    public String toBlogList(Model model) {
        List<Blog> blogList = blogService.queryAllBlog();
        model.addAttribute("blogList", blogList);
        return "blog-list";
    }

    @RequestMapping("/toBlog/{id}")
    public String testBlog(@PathVariable("id") Integer id, Model model) {
        if (id > blogService.queryBlogCount() || id == 0) {
            id = 1;
        }
        Blog blog = blogService.getBolgById(id);
        model.addAttribute("blog", blog);
        return "blog";
    }

    @RequestMapping("/toSearchBlog")
    public String toSearchBlog(String search, Model model) {
        List<Blog> blogList = blogService.searchBlogByTitle(search);
        model.addAttribute("blogList", blogList);
        return "blog-list";
    }
}

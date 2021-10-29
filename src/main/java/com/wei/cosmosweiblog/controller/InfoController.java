package com.wei.cosmosweiblog.controller;

import com.wei.cosmosweiblog.constant.Constant;
import com.wei.cosmosweiblog.pojo.*;
import com.wei.cosmosweiblog.service.BlogService;
import com.wei.cosmosweiblog.service.BookService;
import com.wei.cosmosweiblog.service.DebateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("/info")
public class InfoController {
    @Autowired
    BlogService blogService;
    @Autowired
    BookService bookService;
    @Autowired
    DebateService debateService;

    @RequestMapping("/download/resume")
    public String resumeDownload(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = "/workspace/blog/info/";

        String fileName = "黄旭伟.doc";
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));

        File file = new File(path, fileName);

        InputStream inputStream = new FileInputStream(file);

        OutputStream outputStream = response.getOutputStream();


        byte[] buffer = new byte[1024];
        int index = 0;

        while ((index = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, index);
            outputStream.flush();
        }
        outputStream.close();
        inputStream.close();
        return null;
    }

    @RequestMapping("/download/src")
    public String sourceDownload(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = "/workspace/blog/info/";
        System.out.println("目标地址+" + path);

        String fileName = "cosmosweiblog.zip";
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));

        File file = new File(path, fileName);

        InputStream inputStream = new FileInputStream(file);

        OutputStream outputStream = response.getOutputStream();

        byte[] buffer = new byte[1024];
        int index = 0;

        while ((index = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, index);
            outputStream.flush();
        }
        outputStream.close();
        inputStream.close();
        return null;
    }

    @RequestMapping("/toInfo")
    public String testInfo(Model model) {
        List<Blog> blogList = blogService.queryAllBlog();
        List<Debate> debateList = debateService.queryAllDebate();
        List<Book> bookList = bookService.queryAllBook();
        int blogCount = blogList.size();
        int debateCount = debateList.size();
        int bookCount = bookList.size();

        int tempBlog = (int) (Math.random() * blogCount);
        if (tempBlog > blogCount - Constant.INFO_STEP_SIZE) {
            tempBlog = blogCount - Constant.INFO_STEP_SIZE;
        }
        int tempDebate = (int) (Math.random() * debateCount);
        if (tempDebate > debateCount - Constant.INFO_STEP_SIZE) {
            tempDebate = debateCount - Constant.INFO_STEP_SIZE;
        }
        int tempBook = (int) (Math.random() * bookCount);
        if (tempBook > blogCount - Constant.INFO_STEP_SIZE) {
            tempBook = bookCount - Constant.INFO_STEP_SIZE;
        }

        List<Book> indexBookList = bookList.subList(tempBook, tempBook + 5);
        List<Blog> indexBlogList = blogList.subList(tempBlog, tempBlog + Constant.INFO_STEP_SIZE);
        List<Debate> indexDebateList = debateList.subList(tempDebate, tempDebate + Constant.INFO_STEP_SIZE);


        model.addAttribute("indexBookList", indexBookList);
        model.addAttribute("indexDebateList", indexDebateList);
        model.addAttribute("indexBlogList", indexBlogList);
        return "info";
    }
}

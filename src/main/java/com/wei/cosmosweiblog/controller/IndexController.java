package com.wei.cosmosweiblog.controller;

import com.wei.cosmosweiblog.pojo.*;
import com.wei.cosmosweiblog.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wei.cosmosweiblog.constant.Constant;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    BlogService blogService;
    @Autowired
    BookService bookService;
    @Autowired
    ProjectService projectService;
    @Autowired
    DebateService debateService;
    @Autowired
    DevLogService devLogService;
    @Autowired
    InterviewService interviewService;

    @RequestMapping({"/", "/index"})
    public String index(Model model) {
        List<Blog> blogList = blogService.queryAllBlog();
        List<Interview> interviewList = interviewService.queryAllInterview();
        List<Debate> debateList = debateService.queryAllDebate();
        List<Book> bookList = bookService.queryAllBook();
        List<Project> projectList = projectService.queryAllProject();
        List<DevLog> devLogList = devLogService.queryAllDevLog();

        int blogCount = blogList.size();
        int interviewCount = interviewList.size();
        int debateCount = debateList.size();
        int bookCount = bookList.size();
        int projectCount = projectList.size();
        int devLogCount = devLogList.size();
        model.addAttribute("blogCount", blogCount);
        model.addAttribute("bookCount", bookCount);


        int tempBlog = (int) (Math.random() * blogCount);
        if (tempBlog > blogCount - Constant.BLOG_STEP_SIZE) {
            tempBlog = blogCount - Constant.BLOG_STEP_SIZE;
        }
        int tempInterview = (int) (Math.random() * interviewCount);
        if (tempInterview > interviewCount - Constant.INTERVIEW_STEP_SIZE) {
            tempInterview = interviewCount - Constant.INTERVIEW_STEP_SIZE;
        }
        int tempDebate = (int) (Math.random() * debateCount);
        if (tempDebate > debateCount - Constant.DEBATE_STEP_SIZE) {
            tempDebate = debateCount - Constant.DEBATE_STEP_SIZE;
        }
        int tempBook = (int) (Math.random() * bookCount);
        if (tempBook > blogCount - Constant.BOOK_STEP_SIZE) {
            tempBook = bookCount - Constant.BOOK_STEP_SIZE;
        }
        int tempProject = (int) (Math.random() * projectCount);
        if (tempProject > projectCount - Constant.PROJECT_STEP_SIZE) {
            tempProject = projectCount - Constant.PROJECT_STEP_SIZE;
        }
        int tempDevLog = (int) (Math.random() * devLogCount);
        if (tempDevLog > devLogCount - Constant.DEBATE_STEP_SIZE) {
            tempDevLog = devLogCount - Constant.DEBATE_STEP_SIZE;
        }

        List<Book> indexBookList = bookList.subList(tempBook, tempBook + Constant.BOOK_STEP_SIZE);
        List<Blog> indexBlogList = blogList.subList(tempBlog, tempBlog + Constant.BLOG_STEP_SIZE);
        List<Debate> indexDebateList = debateList.subList(tempDebate, tempDebate + Constant.DEBATE_STEP_SIZE);
        List<Interview> indexInterviewList = interviewList.subList(tempInterview, tempInterview + Constant.INTERVIEW_STEP_SIZE);
        List<Project> indexProjectList = projectList.subList(tempProject, tempProject + Constant.PROJECT_STEP_SIZE);

        model.addAttribute("indexBookList", indexBookList);
        model.addAttribute("indexInterviewList", indexInterviewList);
        model.addAttribute("indexDebateList", indexDebateList);
        model.addAttribute("indexBlogList", indexBlogList);
        model.addAttribute("indexProjectList", indexProjectList);
        model.addAttribute("devLogList", devLogList);
        return "index";
    }
}

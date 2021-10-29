package com.wei.cosmosweiblog.controller;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Interview;
import com.wei.cosmosweiblog.service.BlogService;
import com.wei.cosmosweiblog.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/interview")
public class InterviewController {

    @Autowired
    InterviewService interviewService;

    @RequestMapping("/addBlog")
    public String addBlog(Interview interview) {
        interview.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").toString());
        interviewService.addInterview(interview);
        return "redirect:/toInterviewList";
    }

    @RequestMapping("/toInterviewList")
    public String toBlogList(Model model) {
        List<Interview> interviewList = interviewService.queryAllInterview();
        model.addAttribute("interviewList", interviewList);
        return "interview-list";
    }

    @RequestMapping("/toInterview/{id}")
    public String toBlog(@PathVariable("id") Integer id, Model model) {
        if (id > interviewService.queryInterviewCount() || id == 0) {
            id = 1;
        }
        Interview interview = interviewService.getInterviewById(id);
        model.addAttribute("interview", interview);
        return "interview";
    }

    @RequestMapping("/toSearchInterview")
    public String toSearchInterview(String search, Model model) {
        List<Interview> interviewList = interviewService.searchInterviewByTitle(search);
        model.addAttribute("interviewList", interviewList);
        return "interview-list";
    }
}

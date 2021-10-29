package com.wei.cosmosweiblog.controller;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Debate;
import com.wei.cosmosweiblog.service.DebateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/debate")
public class DebateController {
    @Autowired
    DebateService debateService;

    @RequestMapping("/toDebateList")
    public String toDebateList(Model model) {
        List<Debate> debateList = debateService.queryAllDebate();
        model.addAttribute("debateList", debateList);
        return "debate-list";
    }

    @RequestMapping("/toDebate/{id}")
    public String toDebate(@PathVariable("id") Integer id, Model model) {
        if (id > debateService.queryDebateCount() || id == 0) {
            id = 1;
        }
        Debate debate = debateService.getDebateById(id);
        model.addAttribute("debate", debate);
        return "debate";
    }

    @RequestMapping("/toSearchDebate")
    public String toSearchDebate(String search, Model model) {
        List<Debate> debateList = debateService.searchDebateByTitle(search);
        model.addAttribute("debateList", debateList);
        return "debate-list";
    }
}

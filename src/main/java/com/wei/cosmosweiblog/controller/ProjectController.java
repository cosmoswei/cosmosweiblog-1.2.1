package com.wei.cosmosweiblog.controller;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Project;
import com.wei.cosmosweiblog.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @RequestMapping("/toProjectList")
    public String toProjectList(Model model) {
        List<Project> projectList = projectService.queryAllProject();
        model.addAttribute("projectList", projectList);
        return "project-list";
    }

    @RequestMapping("/toSearchProject")
    public String toSearchProject(String search, Model model) {
        List<Project> projectList = projectService.searchProjectByName(search);
        model.addAttribute("projectList", projectList);
        return "project-list";
    }
}

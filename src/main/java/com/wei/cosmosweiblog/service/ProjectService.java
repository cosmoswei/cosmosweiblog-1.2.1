package com.wei.cosmosweiblog.service;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Project;

import java.util.List;

public interface ProjectService {
    List<Project> queryAllProject();

    Blog getProjectById(Integer id);

    int addProject(Project blog);

    List<Project> searchProjectByName(String name);

}

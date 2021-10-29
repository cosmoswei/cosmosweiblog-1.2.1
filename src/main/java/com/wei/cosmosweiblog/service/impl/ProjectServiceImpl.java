package com.wei.cosmosweiblog.service.impl;

import com.wei.cosmosweiblog.mapper.ProjectDao;
import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Project;
import com.wei.cosmosweiblog.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectDao projectDao;

    @Override
    public List<Project> queryAllProject() {
        return projectDao.queryAllProject();
    }

    @Override
    public Blog getProjectById(Integer id) {
        return projectDao.getProjectById(id);
    }

    @Override
    public int addProject(Project blog) {
        return projectDao.addProject(blog);
    }

    @Override
    public List<Project> searchProjectByName(String name) {
        return projectDao.searchProjectByName(name);
    }
}

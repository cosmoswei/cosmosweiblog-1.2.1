package com.wei.cosmosweiblog.mapper;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectDao {
    List<Project> queryAllProject();

    Blog getProjectById(Integer id);

    int addProject(Project blog);

    @Select("select count(*) from blog_project")
    int queryProjectCount();

    List<Project> searchProjectByName(String name);

}

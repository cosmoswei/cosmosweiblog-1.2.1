package com.wei.cosmosweiblog.mapper;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Interview;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InterviewDao {
    List<Interview> queryAllInterview();

    Interview getInterviewById(Integer id);

    int addInterview(Interview interview);

    @Select("select count(*) from blog_interview")
    int queryInterviewCount();

    List<Interview> searchInterviewByTitle(String title);

}

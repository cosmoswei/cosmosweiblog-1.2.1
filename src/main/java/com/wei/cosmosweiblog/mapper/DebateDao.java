package com.wei.cosmosweiblog.mapper;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Debate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DebateDao {
    List<Debate> queryAllDebate();

    Debate getDebateById(Integer id);

    int addDebate(Debate debate);

    @Select("select count(*) from blog_debate")
    int queryDebateCount();

    List<Debate> searchDebateByTitle(String title);

}

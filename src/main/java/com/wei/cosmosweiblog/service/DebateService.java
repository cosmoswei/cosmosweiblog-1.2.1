package com.wei.cosmosweiblog.service;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Debate;

import java.util.List;

public interface DebateService {
    List<Debate> queryAllDebate();

    Debate getDebateById(Integer id);

    int addDebate(Debate debate);

    int queryDebateCount();

    List<Debate> searchDebateByTitle(String title);

}

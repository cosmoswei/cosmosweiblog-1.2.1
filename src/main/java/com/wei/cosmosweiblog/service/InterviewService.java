package com.wei.cosmosweiblog.service;

import com.wei.cosmosweiblog.pojo.Interview;

import java.util.List;

public interface InterviewService {
    List<Interview> queryAllInterview();

    Interview getInterviewById(Integer id);

    int addInterview(Interview interview);

    int queryInterviewCount();

    List<Interview> searchInterviewByTitle(String title);

}

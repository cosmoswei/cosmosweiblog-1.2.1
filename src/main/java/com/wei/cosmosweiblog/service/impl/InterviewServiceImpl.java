package com.wei.cosmosweiblog.service.impl;

import com.wei.cosmosweiblog.mapper.InterviewDao;
import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Interview;
import com.wei.cosmosweiblog.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    InterviewDao interviewDao;

    @Override
    public List<Interview> queryAllInterview() {
        return interviewDao.queryAllInterview();
    }

    @Override
    public Interview getInterviewById(Integer id) {
        return interviewDao.getInterviewById(id);
    }

    @Override
    public int addInterview(Interview interview) {
        return interviewDao.addInterview(interview);
    }

    @Override
    public int queryInterviewCount() {
        return interviewDao.queryInterviewCount();
    }

    @Override
    public List<Interview> searchInterviewByTitle(String title) {
        return interviewDao.searchInterviewByTitle(title);
    }
}

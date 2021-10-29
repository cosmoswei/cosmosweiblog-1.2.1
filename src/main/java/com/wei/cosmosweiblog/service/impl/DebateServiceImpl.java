package com.wei.cosmosweiblog.service.impl;

import com.wei.cosmosweiblog.mapper.DebateDao;
import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.Debate;
import com.wei.cosmosweiblog.service.DebateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebateServiceImpl implements DebateService {
    @Autowired
    DebateDao debateDao;

    @Override
    public List<Debate> queryAllDebate() {
        return debateDao.queryAllDebate();
    }

    @Override
    public Debate getDebateById(Integer id) {
        return debateDao.getDebateById(id);
    }

    @Override
    public int addDebate(Debate debate) {
        return debateDao.addDebate(debate);
    }

    @Override
    public int queryDebateCount() {
        return debateDao.queryDebateCount();
    }

    @Override
    public List<Debate> searchDebateByTitle(String title) {
        return debateDao.searchDebateByTitle(title);
    }
}

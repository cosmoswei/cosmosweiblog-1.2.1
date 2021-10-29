package com.wei.cosmosweiblog.service.impl;

import com.wei.cosmosweiblog.mapper.DevLogDao;
import com.wei.cosmosweiblog.pojo.DevLog;
import com.wei.cosmosweiblog.service.DevLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevLogServiceImpl implements DevLogService {
    @Autowired
    DevLogDao devLogDao;

    @Override
    public List<DevLog> queryAllDevLog() {
        return devLogDao.queryAllDevLog();
    }

    @Override
    public DevLog getDevLogById(Integer id) {
        return devLogDao.getDevLogById(id);
    }

    @Override
    public int addDevLog(DevLog devLog) {
        return devLogDao.addDevLog(devLog);
    }

    @Override
    public int queryDevLogCount() {
        return devLogDao.queryDevLogCount();
    }

    @Override
    public List<DevLog> searchDevLogByTitle(String title) {
        return devLogDao.searchDevLogByTitle(title);
    }
}

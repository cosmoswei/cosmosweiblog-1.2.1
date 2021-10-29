package com.wei.cosmosweiblog.service;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.DevLog;

import java.util.List;

public interface DevLogService {
    List<DevLog> queryAllDevLog();

    DevLog getDevLogById(Integer id);

    int addDevLog(DevLog devLog);

    int queryDevLogCount();

    List<DevLog> searchDevLogByTitle(String title);

}

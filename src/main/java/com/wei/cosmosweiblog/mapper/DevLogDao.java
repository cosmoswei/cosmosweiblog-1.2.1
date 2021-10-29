package com.wei.cosmosweiblog.mapper;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.DevLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DevLogDao {
    List<DevLog> queryAllDevLog();

    DevLog getDevLogById(Integer id);

    int addDevLog(DevLog devLog);

    @Select("select count(*) from blog_devlog")
    int queryDevLogCount();

    List<DevLog> searchDevLogByTitle(String title);

}

package com.wei.cosmosweiblog.controller;

import com.wei.cosmosweiblog.mapper.DevLogDao;
import com.wei.cosmosweiblog.pojo.DevLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/devLog")
public class DevLogController {
    @Autowired
    DevLogDao devLogDao;

    @RequestMapping("/toDevLog/{id}")
    public String toDevLog(@PathVariable("id") Integer id, Model model) {
        if (id > devLogDao.queryDevLogCount() || id == 0) {
            id = 1;
        }
        DevLog devLog = devLogDao.getDevLogById(id);
        model.addAttribute("devLog", devLog);
        System.out.println(devLog);
        return "dev-log";
    }

}

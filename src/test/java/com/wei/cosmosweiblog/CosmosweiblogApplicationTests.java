package com.wei.cosmosweiblog;

import com.wei.cosmosweiblog.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Random;

@SpringBootTest
class CosmosweiblogApplicationTests {
    @Autowired
    private BlogUserService blogUserService;
    @Autowired
    private BlogService blogService;
    @Autowired
    private ProjectService projectService;
    @Autowired
    private BookService bookService;
    @Autowired
    private InterviewService interviewService;
    @Autowired
    private DebateService debateService;
    @Autowired
    private DevLogService devLogService;

    @Test
    void contextLoads() {
    }

}

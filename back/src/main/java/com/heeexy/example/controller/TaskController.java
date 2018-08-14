package com.heeexy.example.controller;

import com.heeexy.example.request.TaskAddRequest;
import com.heeexy.example.response.BaseResponse;
import com.heeexy.example.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/commit")
    public BaseResponse addArticle(@RequestBody TaskAddRequest request) {
        return taskService.taskCommit(request);
    }

}

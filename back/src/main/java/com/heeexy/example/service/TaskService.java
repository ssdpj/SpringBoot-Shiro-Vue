package com.heeexy.example.service;

import com.heeexy.example.request.TaskAddRequest;
import com.heeexy.example.response.BaseResponse;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
public interface TaskService {

    /**
     *  任务提交
     * @param request
     * @return
     */
    BaseResponse taskCommit(TaskAddRequest request);
}

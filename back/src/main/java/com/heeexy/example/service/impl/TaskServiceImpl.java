package com.heeexy.example.service.impl;

import com.heeexy.example.mapper.tpl.TaskMapper;
import com.heeexy.example.request.TaskAddRequest;
import com.heeexy.example.response.BaseResponse;
import com.heeexy.example.service.TaskService;
import com.heeexy.example.service.handler.TaskHandler;
import com.heeexy.example.util.constants.CommonEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
@Service
@Slf4j
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskHandler taskHandler;

    @Override
    public BaseResponse taskCommit(TaskAddRequest request){
        BaseResponse response =null;
        try {
            response = taskHandler.commit(request);
        } catch (Exception e) {
            log.error("TaskService:taskCommit=>{}",e.getLocalizedMessage());
            response = BaseResponse.builder().code(CommonEnum.FAILED.getCode()).msg(CommonEnum.FAILED.getMsg()).build();
        }
        return response;
    }

}

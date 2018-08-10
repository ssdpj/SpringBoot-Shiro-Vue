package com.heeexy.example.service.handler;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Task;
import com.heeexy.example.request.TaskAddRequest;
import com.heeexy.example.response.BaseResponse;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.ImgUtils;
import com.heeexy.example.util.UUIDUtils;
import com.heeexy.example.util.constants.TaskStatus;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
@Service
public class TaskHandler extends BaseHandler {

    public BaseResponse commit(TaskAddRequest request) {
        BaseResponse response = new BaseResponse();
        Task task = new Task();
        BeanUtils.copyProperties(request, task);
        task.setTaskNo(UUIDUtils.getUUID(16));
        if (StringUtils.isBlank(task.getImgUrl())) {
            task.setImgUrl(ImgUtils.getRandomImg());
        }
        task.setCreator(request.getBkUser().getUserId());
        task.setCrtTime(new Date());
        task.setUpdateTime(new Date());
        task.setStatus(TaskStatus.COMMIT);
        Long insert = taskExtendMapper.insertAndReturnId(task);
        return (insert != null && insert > 0) ? CommonUtil.successRes(task) : CommonUtil.errorRes("任务提交失败");
    }

    public Task list() {

        Task task = taskMapper.selectByPrimaryKey(1L);
        return task;
    }

}

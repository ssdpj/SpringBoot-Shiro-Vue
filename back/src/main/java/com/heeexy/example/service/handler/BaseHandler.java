package com.heeexy.example.service.handler;

import com.heeexy.example.mapper.extend.TaskExtendMapper;
import com.heeexy.example.mapper.tpl.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
@Service
public class BaseHandler {

    @Autowired
    protected TaskMapper taskMapper;

    @Autowired
    protected TaskExtendMapper taskExtendMapper;

}

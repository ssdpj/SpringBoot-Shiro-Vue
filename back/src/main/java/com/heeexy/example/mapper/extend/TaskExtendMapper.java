package com.heeexy.example.mapper.extend;

import com.heeexy.example.model.Task;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
public interface TaskExtendMapper {

    Long insertAndReturnId(Task record);
}

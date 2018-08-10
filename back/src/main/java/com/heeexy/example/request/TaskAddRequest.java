package com.heeexy.example.request;

import lombok.Data;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
@Data
public class TaskAddRequest extends BaseRequest{
    private String taskName;
    private String desc;
    private String imgUrl;
    private Integer type;
    private String startDate;
    private String endDate;
}

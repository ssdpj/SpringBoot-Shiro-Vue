package com.heeexy.example.util.constants;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author: hxy
 * @description: 通用常量类, 单个业务的常量请单开一个类, 方便常量的分类管理
 * @date: 2017/10/24 10:15
 */
public class Constants {

    public static final String SUCCESS_CODE = "100";
    public static final String SUCCESS_MSG = "请求成功";

    /**
     * session中存放用户信息的key值
     */
    public static final String SESSION_USER_INFO = "userInfo";
    public static final String SESSION_USER_PERMISSION = "userPermission";


    public static final List<String> imgUrl_Arr = Lists.newArrayList(
            "https://images.pexels.com/photos/1125774/pexels-photo-1125774.jpeg?auto=compress&cs=tinysrgb&h=350",
            "https://images.pexels.com/photos/995301/pexels-photo-995301.jpeg?auto=compress&cs=tinysrgb&h=350",
            "https://images.pexels.com/photos/823841/pexels-photo-823841.jpeg?auto=compress&cs=tinysrgb&h=350"
    );


}

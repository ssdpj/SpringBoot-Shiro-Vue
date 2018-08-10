package com.heeexy.example.util.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
@AllArgsConstructor
public enum  CommonEnum {

    SUCCESS("0000","请求成功"),
    FAILED("1000","请求失败"),
    REQUEST_ERROR("5000","请求处理异常，请稍后再试"),
    ROUTE_ERROR("6000","请求路径不存在"),
    AUTH_ERROR("4000","权限不足"),
    LOGIN_EXPIRED("7000","登陆已过期,请重新登陆"),
    PARAM_ERROR("9000","参数不正确，请检查参数后重新提交");

    @Getter
    private String code;
    @Getter
    private String msg;

}

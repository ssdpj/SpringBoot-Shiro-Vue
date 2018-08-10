package com.heeexy.example.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse implements Serializable {

    private static final long serialVersionUID = -8331059275804079121L;
    private String code;
    private String msg;
    private Object data;

}

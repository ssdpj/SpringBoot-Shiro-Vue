package com.heeexy.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BKUser {
    private Integer userId;
    private String username;
    private String password;
    private String nickName;

}

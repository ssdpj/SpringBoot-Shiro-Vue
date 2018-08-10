package com.heeexy.example.util.constants;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
public interface TaskStatus {
    // 已提交
    int COMMIT = 1;
    // 审核中
    int AUDITING = 2;
    // 已接单
    int ACCEPTED = 3;
    // 进行中
    int PROGRESS = 4;
    // 待验收
    int VERIFICATION = 5;
    // 完成
    int COMPLETE = 6;


}

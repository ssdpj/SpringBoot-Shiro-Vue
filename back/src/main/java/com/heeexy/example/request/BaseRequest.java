package com.heeexy.example.request;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.BKUser;
import com.heeexy.example.util.constants.Constants;
import lombok.Data;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
@Data
public class BaseRequest {

    private BKUser bkUser;

    public void setUser(BKUser bkUser) {
        this.bkUser = bkUser;
    }

    public void setUser() {
        this.bkUser = this.getUser();
    }

    protected BKUser getUser() {
        Session session = SecurityUtils.getSubject().getSession();
        return (BKUser) session.getAttribute(Constants.SESSION_USER_INFO);
    }
}

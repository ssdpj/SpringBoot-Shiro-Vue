package com.heeexy.example.util;

import java.util.UUID;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
public class UUIDUtils {

    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String getUUID(int count) {
        return UUID.randomUUID().toString().replace("-", "").substring(0, count);
    }
}

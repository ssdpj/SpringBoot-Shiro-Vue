package com.heeexy.example.util;

import com.heeexy.example.util.constants.Constants;

import java.util.List;
import java.util.Random;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
public class ImgUtils {

    public static String getRandomImg() {
        Random r = new Random();
        List<String> imgUrl_arr = Constants.imgUrl_Arr;
        int index = r.nextInt(imgUrl_arr.size());
        return imgUrl_arr.get(index);
    }

}

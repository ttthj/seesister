package com.example.seesister.utils;

import com.example.seesister.SeeSisterApp;

/**
 * 描述：获取文件资源工具类
 */

public class ResUtils {
    /* 获取文件资源 */
    public static String getString(int strId) {
        return SeeSisterApp.getContext().getResources().getString(strId);
    }
}

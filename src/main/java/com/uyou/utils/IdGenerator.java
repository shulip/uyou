package com.uyou.utils;

import java.text.SimpleDateFormat;

/**
 * @author zxwang
 * @createdAt 2022/1/13 22:26
 * @description
 */
public class IdGenerator {

    private IdGenerator() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 根据时间戳生成唯一id
     */
    public static int getDateId(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
        String id = sdf.format(System.currentTimeMillis());
        return Integer.parseInt(id);
    }

}

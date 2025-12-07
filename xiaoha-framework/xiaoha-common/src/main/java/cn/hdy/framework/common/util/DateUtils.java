package cn.hdy.framework.common.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/12/4 11:00
 * @Version: v1.0.0
 * @Description: 日期工具类
 **/
public class DateUtils {

    /**
     * LocalDateTime 转时间戳
     *
     * @param localDateTime
     * @return
     */
    public static long localDateTime2Timestamp(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
    }

}

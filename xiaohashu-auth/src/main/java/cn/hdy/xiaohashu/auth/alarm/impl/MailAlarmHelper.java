package cn.hdy.xiaohashu.auth.alarm.impl;

import cn.hdy.xiaohashu.auth.alarm.AlarmInterface;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/30 18:43
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Slf4j
public class MailAlarmHelper implements AlarmInterface {
    /**
     * 发送告警信息
     *
     * @param message
     * @return
     */
    @Override
    public boolean send(String message) {
        log.info("==> 【邮件告警】：{}", message);

        // 业务逻辑...

        return true;
    }
}

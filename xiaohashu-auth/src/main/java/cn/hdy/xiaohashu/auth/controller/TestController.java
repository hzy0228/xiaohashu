package cn.hdy.xiaohashu.auth.controller;

import cn.hdy.xiaohashu.auth.alarm.AlarmInterface;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/30 18:36
 * @Version: v1.0.0
 * @Description: TODO
 **/
@RestController
@Slf4j
public class TestController {

    @NacosValue(value = "${rate-limit.api.limit}", autoRefreshed = true)
    private Integer limit;

    @Resource
    private AlarmInterface alarm;

    @GetMapping("/test")
    public String test() {
        return "当前限流阈值为: " + limit;
    }

    @GetMapping("/alarm")
    public String sendAlarm() {
        alarm.send("测试告警");
        return "alarm success";
    }
}

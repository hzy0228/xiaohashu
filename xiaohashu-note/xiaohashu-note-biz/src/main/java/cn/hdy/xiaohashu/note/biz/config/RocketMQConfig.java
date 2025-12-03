package cn.hdy.xiaohashu.note.biz.config;

import org.apache.rocketmq.spring.autoconfigure.RocketMQAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/12/1 11:08
 * @Version: v1.0.0
 * @Description: RocketMQ 配置
 **/
@Configuration
@Import(RocketMQAutoConfiguration.class)
public class RocketMQConfig {
}

package cn.hdy.framework.biz.context.config;

import cn.hdy.framework.biz.context.interceptor.FeignRequestInterceptor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/15 17:04
 * @Version: v1.0.0
 * @Description: Feign 请求拦截器自动配置
 **/
@AutoConfiguration
public class FeignContextAutoConfiguration {

    @Bean
    public FeignRequestInterceptor feignRequestInterceptor() {
        return new FeignRequestInterceptor();
    }
}

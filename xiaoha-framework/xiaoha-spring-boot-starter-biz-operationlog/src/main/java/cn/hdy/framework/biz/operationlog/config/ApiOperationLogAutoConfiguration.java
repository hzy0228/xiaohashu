package cn.hdy.framework.biz.operationlog.config;

import cn.hdy.framework.biz.operationlog.aspect.ApiOperationLogAspect;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/22 15:28
 * @Version: v1.0.0
 * @Description: TODO
 **/
@AutoConfiguration
public class ApiOperationLogAutoConfiguration {
    @Bean
    public ApiOperationLogAspect apiOperationLogAspect() {
        return new ApiOperationLogAspect();
    }
}

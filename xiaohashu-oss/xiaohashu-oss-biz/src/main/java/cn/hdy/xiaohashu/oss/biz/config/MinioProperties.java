package cn.hdy.xiaohashu.oss.biz.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/10 14:23
 * @Version: v1.0.0
 * @Description: TODO
 **/
@ConfigurationProperties(prefix = "minio")
@Component
@Data
public class MinioProperties {

    private String endpoint;
    private String accessKey;
    private String secretKey;
}

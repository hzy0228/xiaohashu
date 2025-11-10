package cn.hdy.xiaohashu.oss.biz.strategy.impl;

import cn.hdy.xiaohashu.oss.biz.strategy.FileStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/10 13:53
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Slf4j
public class AliyunOSSFileStrategy implements FileStrategy {

    /**
     * 文件上传
     *
     * @param file
     * @param bucketName
     * @return
     */
    @Override
    public String uploadFile(MultipartFile file, String bucketName) {
        log.info("## 上传文件至阿里云 OSS ...");
        return null;
    }
}

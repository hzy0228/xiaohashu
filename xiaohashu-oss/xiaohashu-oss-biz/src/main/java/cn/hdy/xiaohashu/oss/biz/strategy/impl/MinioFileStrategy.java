package cn.hdy.xiaohashu.oss.biz.strategy.impl;

import cn.hdy.xiaohashu.oss.biz.config.MinioProperties;
import cn.hdy.xiaohashu.oss.biz.strategy.FileStrategy;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.errors.*;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/10 13:52
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Slf4j
public class MinioFileStrategy implements FileStrategy {

    @Resource
    private MinioProperties minioProperties;

    @Resource
    private MinioClient minioClient;


    /**
     * 文件上传
     *
     * @param file
     * @param bucketName
     * @return
     */
    @Override
    public String uploadFile(MultipartFile file, String bucketName) throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        log.info("## 上传文件至Minio 。。。");

        if (file == null || file.getSize() == 0) {
            log.error("上传文件异常，文件大小为空");
            throw new RuntimeException("文件大小不能为空");
        }

        String originalFileName = file.getOriginalFilename();

        String contentType = file.getContentType();

        String key = UUID.randomUUID().toString().replace("-", "");

        assert originalFileName != null;
        String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));

        String objectName = String.format("%s%s", key, suffix);
        log.info("==> 开始上传文件至 Minio, ObjectName: {}", objectName);

        minioClient.putObject(PutObjectArgs.builder()
                .bucket(bucketName)
                .object(objectName)
                .stream(file.getInputStream(), file.getSize(), -1)
                .contentType(contentType)
                .build());

        String url = String.format("%s/%s/%s", minioProperties.getEndpoint(), bucketName, objectName);
        log.info("==> 上传文件至 Minio 成功，访问路径: {}", url);

        return url;
    }
}

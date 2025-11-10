package cn.hdy.xiaohashu.oss.biz.strategy;

import io.minio.errors.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/10 13:49
 * @Version: v1.0.0
 * @Description: 文件策略接口
 **/
public interface FileStrategy {

    /**
     * 文件上传
     * @param file
     * @param bucketName
     * @return
     */
    String uploadFile(MultipartFile file, String bucketName) throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException;
}

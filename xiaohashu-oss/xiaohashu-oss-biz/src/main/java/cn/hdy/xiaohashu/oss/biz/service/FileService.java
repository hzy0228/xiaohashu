package cn.hdy.xiaohashu.oss.biz.service;

import cn.hdy.framework.common.response.Response;
import io.minio.errors.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/10 14:00
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface FileService {

    /**
     * 上传文件
     * @param file
     * @return
     */
    Response<?> uploadFile(MultipartFile file) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException;
}

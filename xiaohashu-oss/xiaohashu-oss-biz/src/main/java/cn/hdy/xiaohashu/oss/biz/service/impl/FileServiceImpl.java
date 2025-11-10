package cn.hdy.xiaohashu.oss.biz.service.impl;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.oss.biz.service.FileService;
import cn.hdy.xiaohashu.oss.biz.strategy.FileStrategy;
import io.minio.errors.*;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/10 14:02
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Service
@Slf4j
public class FileServiceImpl implements FileService {

    @Resource
    private FileStrategy fileStrategy;

    private static final String BUCKET_NAME = "xiaohashu";


    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    @Override
    public Response<?> uploadFile(MultipartFile file) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {

        // 上传文件
        String url = fileStrategy.uploadFile(file, BUCKET_NAME);

        return Response.success(url);
    }
}

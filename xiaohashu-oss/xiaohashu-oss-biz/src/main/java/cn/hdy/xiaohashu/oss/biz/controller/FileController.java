package cn.hdy.xiaohashu.oss.biz.controller;

import cn.hdy.framework.biz.context.holder.LoginUserContextHolder;
import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.oss.biz.service.FileService;
import io.minio.errors.*;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/10 14:04
 * @Version: v1.0.0
 * @Description: TODO
 **/
@RestController
@RequestMapping("/file")
@Slf4j
public class FileController {

    @Resource
    private FileService fileService;

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Response<?> uploadFile(@RequestPart(value = "file") MultipartFile file) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        log.info("当前用户 ID ：{}", LoginUserContextHolder.getUserId());
        return fileService.uploadFile(file);
    }
}

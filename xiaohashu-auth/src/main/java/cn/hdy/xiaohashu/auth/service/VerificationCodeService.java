package cn.hdy.xiaohashu.auth.service;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.auth.model.vo.verificationcode.SendVerificationCodeReqVO;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/26 8:04
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface VerificationCodeService {

    /**
     * 发送短信验证码
     *
     * @param sendVerificationCodeReqVO
     * @return
     */
    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);
}

package cn.hdy.xiaohashu.auth.service;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.auth.model.vo.user.UserLoginReqVO;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/27 11:58
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface UserService {

    /**
     * 登录与注册
     *
     * @param userLoginReqVO
     * @return
     */
    Response<String> loginAndRegister(UserLoginReqVO userLoginReqVO);
}

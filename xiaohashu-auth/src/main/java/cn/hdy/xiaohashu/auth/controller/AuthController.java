package cn.hdy.xiaohashu.auth.controller;

import cn.hdy.framework.biz.operationlog.aspect.ApiOperationLog;
import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.auth.model.vo.user.UpdatePasswordReqVO;
import cn.hdy.xiaohashu.auth.model.vo.user.UserLoginReqVO;
import cn.hdy.xiaohashu.auth.service.AuthService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/27 12:18
 * @Version: v1.0.0
 * @Description: TODO
 **/
@RestController
@Slf4j
public class AuthController {

    @Resource
    private AuthService userService;

    @PostMapping("/login")
    @ApiOperationLog(description = "用户登录/用户注册")
    public Response<String> loginAndRegister(@Validated @RequestBody UserLoginReqVO userLoginReqVO) {
        return userService.loginAndRegister(userLoginReqVO);
    }

    @PostMapping("/logout")
    @ApiOperationLog(description = "账号登出")
    public Response<?> logout() {
        return userService.logout();
    }

    @PostMapping("/password/update")
    @ApiOperationLog(description = "修改密码")
    public Response<?> updatePassword(@Validated @RequestBody UpdatePasswordReqVO updatePasswordReqVO) {
        return userService.updatePassword(updatePasswordReqVO);
    }
}

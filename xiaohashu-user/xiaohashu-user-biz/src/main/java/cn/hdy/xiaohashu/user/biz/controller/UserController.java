package cn.hdy.xiaohashu.user.biz.controller;

import cn.hdy.framework.biz.operationlog.aspect.ApiOperationLog;
import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.user.biz.model.vo.UpdateUserInfoReqVO;
import cn.hdy.xiaohashu.user.biz.service.UserService;
import cn.hdy.xiaohashu.user.dto.req.FindUserByIdReqDTO;
import cn.hdy.xiaohashu.user.dto.req.FindUserByPhoneReqDTO;
import cn.hdy.xiaohashu.user.dto.req.RegisterUserReqDTO;
import cn.hdy.xiaohashu.user.dto.req.UpdateUserPasswordReqDTO;
import cn.hdy.xiaohashu.user.dto.resp.FindUserByIdRspDTO;
import cn.hdy.xiaohashu.user.dto.resp.FindUserByPhoneRspDTO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/15 10:22
 * @Version: v1.0.0
 * @Description: 用户
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户信息修改
     *
     * @param updateUserInfoReqVO
     * @return
     */
    @PostMapping(value = "/update", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Response<?> updateUserInfo(@Validated UpdateUserInfoReqVO updateUserInfoReqVO) {
        return userService.updateUserInfo(updateUserInfoReqVO);
    }

    /**
     * 用户注册
     *
     * @param registerUserReqDTO
     * @return
     */
    @PostMapping("/register")
    @ApiOperationLog(description = "用户注册")
    public Response<Long> register(@Validated @RequestBody RegisterUserReqDTO registerUserReqDTO) {
        return userService.register(registerUserReqDTO);
    }

    /**
     * 手机号查询用户信息
     *
     * @param findUserByPhoneReqDTO
     * @return
     */
    @PostMapping("/findByPhone")
    @ApiOperationLog(description = "手机号查询用户信息")
    public Response<FindUserByPhoneRspDTO> findByPhone(@Validated @RequestBody FindUserByPhoneReqDTO findUserByPhoneReqDTO) {
        return userService.findByPhone(findUserByPhoneReqDTO);
    }

    /**
     * 密码更新
     *
     * @param updateUserPasswordReqDTO
     * @return
     */
    @PostMapping("/password/update")
    @ApiOperationLog(description = "密码更新")
    public Response<?> updatePassword(@Validated @RequestBody UpdateUserPasswordReqDTO updateUserPasswordReqDTO) {
        return userService.updatePassword(updateUserPasswordReqDTO);
    }


    /**
     * 查询用户信息
     *
     * @param findUserByIdReqDTO
     * @return
     */
    @PostMapping("/findById")
    @ApiOperationLog(description = "查询用户信息")
    public Response<FindUserByIdRspDTO> findById(@Validated @RequestBody FindUserByIdReqDTO findUserByIdReqDTO) {
        return userService.findById(findUserByIdReqDTO);
    }
}

package cn.hdy.xiaohashu.user.api;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.user.constant.ApiConstants;
import cn.hdy.xiaohashu.user.dto.req.FindUserByPhoneReqDTO;
import cn.hdy.xiaohashu.user.dto.req.RegisterUserReqDTO;
import cn.hdy.xiaohashu.user.dto.req.UpdateUserPasswordReqDTO;
import cn.hdy.xiaohashu.user.dto.resp.FindUserByPhoneRspDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/15 18:25
 * @Version: v1.0.0
 * @Description: TODO
 **/
@FeignClient(name = ApiConstants.SERVICE_NAME)
public interface UserFeignApi {

    String PREFIX = "/user";

    /**
     * 用户注册
     *
     * @param registerUserReqDTO
     * @return
     */
    @PostMapping(value = PREFIX + "/register")
    Response<Long> registerUser(@RequestBody RegisterUserReqDTO registerUserReqDTO);


    /**
     * 根据手机号查询用户信息
     *
     * @param findUserByPhoneReqDTO
     * @return
     */
    @PostMapping(value = PREFIX + "/findByPhone")
    Response<FindUserByPhoneRspDTO> findByPhone(@RequestBody FindUserByPhoneReqDTO findUserByPhoneReqDTO);

    /**
     * 密码更新
     * @param updateUserPasswordReqDTO
     * @return
     */
    @PostMapping(value = PREFIX + "/password/update")
    Response<?> updatePassword(@RequestBody UpdateUserPasswordReqDTO updateUserPasswordReqDTO);
}

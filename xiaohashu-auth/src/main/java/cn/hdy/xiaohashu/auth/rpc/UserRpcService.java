package cn.hdy.xiaohashu.auth.rpc;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.user.api.UserFeignApi;
import cn.hdy.xiaohashu.user.dto.req.FindUserByPhoneReqDTO;
import cn.hdy.xiaohashu.user.dto.req.RegisterUserReqDTO;
import cn.hdy.xiaohashu.user.dto.req.UpdateUserPasswordReqDTO;
import cn.hdy.xiaohashu.user.dto.resp.FindUserByPhoneRspDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/15 18:30
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Component
public class UserRpcService {

    @Resource
    private UserFeignApi userFeignApi;

    public Long registerUser(String phone) {
        RegisterUserReqDTO registerUserReqDTO = new RegisterUserReqDTO();
        registerUserReqDTO.setPhone(phone);

        Response<Long> response = userFeignApi.registerUser(registerUserReqDTO);

        if (!response.isSuccess()) {
            return null;
        }

        return response.getData();

    }

    /**
     * 根据手机号查询用户信息
     *
     * @param phone
     * @return
     */
    public FindUserByPhoneRspDTO findUserByPhone(String phone) {
        FindUserByPhoneReqDTO findUserByPhoneReqDTO = new FindUserByPhoneReqDTO();
        findUserByPhoneReqDTO.setPhone(phone);

        Response<FindUserByPhoneRspDTO> response = userFeignApi.findByPhone(findUserByPhoneReqDTO);

        if (!response.isSuccess()) {
            return null;
        }

        return response.getData();
    }

    public void updatePassword(String encodePassword) {
        UpdateUserPasswordReqDTO updateUserPasswordReqDTO = new UpdateUserPasswordReqDTO();
        updateUserPasswordReqDTO.setEncodePassword(encodePassword);

        userFeignApi.updatePassword(updateUserPasswordReqDTO);


    }
}

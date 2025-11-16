package cn.hdy.xiaohashu.user.biz.service;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.user.biz.model.vo.UpdateUserInfoReqVO;
import cn.hdy.xiaohashu.user.dto.req.FindUserByPhoneReqDTO;
import cn.hdy.xiaohashu.user.dto.req.RegisterUserReqDTO;
import cn.hdy.xiaohashu.user.dto.req.UpdateUserPasswordReqDTO;
import cn.hdy.xiaohashu.user.dto.resp.FindUserByPhoneRspDTO;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/15 9:48
 * @Version: v1.0.0
 * @Description: 用户业务
 **/
public interface UserService {

    /**
     * 更新用户信息
     *
     * @param updateUserInfoReqVO
     * @return
     */
    Response<?> updateUserInfo(UpdateUserInfoReqVO updateUserInfoReqVO);

    /**
     * 用户注册
     *
     * @param registerUserReqDTO
     * @return
     */
    Response<Long> register(RegisterUserReqDTO registerUserReqDTO);

    /**
     * 根据手机号查询用户信息
     *
     * @param findUserByPhoneReqDTO
     * @return
     */
    Response<FindUserByPhoneRspDTO> findByPhone(FindUserByPhoneReqDTO findUserByPhoneReqDTO);

    /**
     * 更新密码
     *
     * @param updateUserPasswordReqDTO
     * @return
     */
    Response<?> updatePassword(UpdateUserPasswordReqDTO updateUserPasswordReqDTO);
}

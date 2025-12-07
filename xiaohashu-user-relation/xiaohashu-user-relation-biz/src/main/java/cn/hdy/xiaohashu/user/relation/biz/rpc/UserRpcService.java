package cn.hdy.xiaohashu.user.relation.biz.rpc;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.user.api.UserFeignApi;
import cn.hdy.xiaohashu.user.dto.req.FindUserByIdReqDTO;
import cn.hdy.xiaohashu.user.dto.resp.FindUserByIdRspDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/28 11:15
 * @Version: v1.0.0
 * @Description: 用户服务
 **/
@Component
public class UserRpcService {

    @Resource
    private UserFeignApi userFeignApi;

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    public FindUserByIdRspDTO findById(Long userId) {
        FindUserByIdReqDTO findUserByIdReqDTO = new FindUserByIdReqDTO();
        findUserByIdReqDTO.setId(userId);

        Response<FindUserByIdRspDTO> response = userFeignApi.findById(findUserByIdReqDTO);

        if (Objects.isNull(response) || !response.isSuccess()) {
            return null;
        }

        return response.getData();
    }

}

package cn.hdy.xiaohashu.user.relation.biz.service;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.user.relation.biz.model.vo.FollowUserReqVO;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/12/3 15:33
 * @Version: v1.0.0
 * @Description: 关注业务
 **/
public interface RelationService {

    /**
     * 关注用户
     * @param followUserReqVO
     * @return
     */
    Response<?> follow(FollowUserReqVO followUserReqVO);
}

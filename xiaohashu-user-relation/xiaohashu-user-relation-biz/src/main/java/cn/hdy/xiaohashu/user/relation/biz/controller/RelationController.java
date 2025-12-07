package cn.hdy.xiaohashu.user.relation.biz.controller;

import cn.hdy.framework.biz.operationlog.aspect.ApiOperationLog;
import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.user.relation.biz.model.vo.FollowUserReqVO;
import cn.hdy.xiaohashu.user.relation.biz.service.RelationService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/12/3 16:26
 * @Version: v1.0.0
 * @Description: 用户关系
 **/
@RestController
@RequestMapping("/relation")
@Slf4j
public class RelationController {

    @Resource
    private RelationService relationService;

    @PostMapping("/follow")
    @ApiOperationLog(description = "关注用户")
    public Response<?> follow(@Validated @RequestBody FollowUserReqVO followUserReqVO) {
        return relationService.follow(followUserReqVO);
    }
}

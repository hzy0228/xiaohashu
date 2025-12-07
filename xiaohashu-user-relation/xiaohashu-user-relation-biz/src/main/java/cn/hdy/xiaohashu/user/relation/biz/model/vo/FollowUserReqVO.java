package cn.hdy.xiaohashu.user.relation.biz.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/12/3 15:31
 * @Version: v1.0.0
 * @Description: 关注用户
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FollowUserReqVO {


    @NotNull(message = "被关注用户 ID 不能为空")
    private Long followUserId;
}

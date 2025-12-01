package cn.hdy.xiaohashu.user.dto.req;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/26 10:20
 * @Version: v1.0.0
 * @Description: 根据用户 ID 查询用户信息
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserByIdReqDTO {


    /**
     * 手机号
     */
    @NotNull(message = "用户 ID 不能为空")
    private Long id;
}

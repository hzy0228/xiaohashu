package cn.hdy.xiaohashu.note.biz.rpc;

import cn.hdy.xiaohashu.distributed.id.generator.api.DistributedIdGeneratorFeignApi;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/24 13:43
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Component
public class DistributedIdGeneratorRpcService {

    @Resource
    private DistributedIdGeneratorFeignApi distributedIdGeneratorFeignApi;

    /**
     * 生成雪花算法 ID
     *
     * @return
     */
    public String getSnowflakeId() {
        return distributedIdGeneratorFeignApi.getSnowflakeId("note");
    }
}

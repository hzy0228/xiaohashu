package cn.hdy.xiaohashu.kv.api;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.kv.constant.ApiConstants;
import cn.hdy.xiaohashu.kv.dto.req.AddNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.req.DeleteNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.req.FindNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.rsp.FindNoteContentRspDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/16 21:52
 * @Version: v1.0.0
 * @Description: K-V 键值存储 Feign 接口
 **/
@FeignClient(name = ApiConstants.SERVICE_NAME)
public interface KeyValueFeignApi {


    String PREFIX = "/kv";

    @PostMapping(value = PREFIX + "/note/content/add")
    Response<?> addNoteContent(@RequestBody AddNoteContentReqDTO addNoteContentReqDTO);

    @PostMapping(value = PREFIX + "/note/content/find")
    Response<FindNoteContentRspDTO> findNoteContent(@RequestBody FindNoteContentReqDTO findNoteContentReqDTO);

    @PostMapping(value = PREFIX + "/note/content/delete")
    Response<?> deleteNoteContent(@RequestBody DeleteNoteContentReqDTO deleteNoteContentReqDTO);

}

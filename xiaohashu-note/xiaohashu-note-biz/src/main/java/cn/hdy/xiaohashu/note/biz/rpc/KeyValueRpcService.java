package cn.hdy.xiaohashu.note.biz.rpc;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.kv.api.KeyValueFeignApi;
import cn.hdy.xiaohashu.kv.dto.req.AddNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.req.DeleteNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.req.FindNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.rsp.FindNoteContentRspDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/24 13:45
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Component
public class KeyValueRpcService {

    @Resource
    private KeyValueFeignApi keyValueFeignApi;


    /**
     * 保存笔记内容
     *
     * @param uuid
     * @param content
     * @return
     */
    public boolean saveNoteContent(String uuid, String content) {
        AddNoteContentReqDTO addNoteContentReqDTO = new AddNoteContentReqDTO();
        addNoteContentReqDTO.setUuid(uuid);
        addNoteContentReqDTO.setContent(content);

        Response<?> response = keyValueFeignApi.addNoteContent(addNoteContentReqDTO);

        if (Objects.isNull(response) || !response.isSuccess()) {
            return false;
        }

        return true;
    }

    /**
     * 删除笔记内容
     *
     * @param uuid
     * @return
     */
    public boolean deleteNoteContent(String uuid) {
        DeleteNoteContentReqDTO deleteNoteContentReqDTO = new DeleteNoteContentReqDTO();
        deleteNoteContentReqDTO.setUuid(uuid);

        Response<?> response = keyValueFeignApi.deleteNoteContent(deleteNoteContentReqDTO);

        return Objects.nonNull(response) && response.isSuccess();
    }

    /**
     * 查询笔记内容
     *
     * @param uuid
     * @return
     */
    public String findNoteContent(String uuid) {
        FindNoteContentReqDTO findNoteContentReqDTO = new FindNoteContentReqDTO();
        findNoteContentReqDTO.setUuid(uuid);

        Response<FindNoteContentRspDTO> response = keyValueFeignApi.findNoteContent(findNoteContentReqDTO);

        if (Objects.isNull(response) || !response.isSuccess() || Objects.isNull(response.getData())) {
            return null;
        }

        return response.getData().getContent();
    }

}


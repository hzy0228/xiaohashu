package cn.hdy.xiaohashu.kv.biz.service;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.kv.dto.req.AddNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.req.DeleteNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.req.FindNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.rsp.FindNoteContentRspDTO;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/16 18:15
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface NoteContentService {

    /**
     * 添加笔记内容
     *
     * @param addNoteContentReqDTO
     * @return
     */
    Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO);

    /**
     * 查询笔记内容
     *
     * @param findNoteContentReqDTO
     * @return
     */
    Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO);


    /**
     * 删除笔记内容
     *
     * @param deleteNoteContentReqDTO
     * @return
     */
    Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO);

}

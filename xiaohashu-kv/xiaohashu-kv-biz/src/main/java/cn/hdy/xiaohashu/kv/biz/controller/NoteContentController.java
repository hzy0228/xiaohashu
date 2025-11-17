package cn.hdy.xiaohashu.kv.biz.controller;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.kv.biz.service.NoteContentService;
import cn.hdy.xiaohashu.kv.dto.req.AddNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.req.DeleteNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.req.FindNoteContentReqDTO;
import cn.hdy.xiaohashu.kv.dto.rsp.FindNoteContentRspDTO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/16 18:20
 * @Version: v1.0.0
 * @Description: TODO
 **/
@RestController
@RequestMapping("/kv")
@Slf4j
public class NoteContentController {

    @Resource
    private NoteContentService noteContentService;

    /**
     * 添加笔记内容
     * @param addNoteContentReqDTO
     * @return
     */
    @PostMapping(value = "/note/content/add")
    public Response<?> addNoteContent(@Validated @RequestBody AddNoteContentReqDTO addNoteContentReqDTO) {
        return noteContentService.addNoteContent(addNoteContentReqDTO);
    }


    /**
     * 查询笔记内容
     * @param findNoteContentReqDTO
     * @return
     */
    @PostMapping(value = "/note/content/find")
    public Response<FindNoteContentRspDTO> findNoteContent(@Validated @RequestBody FindNoteContentReqDTO findNoteContentReqDTO) {
        return noteContentService.findNoteContent(findNoteContentReqDTO);
    }

    /**
     * 删除笔记内容
     * @param deleteNoteContentReqDTO
     * @return
     */
    @PostMapping(value = "/note/content/delete")
    public Response<?> deleteNoteContent(@Validated @RequestBody DeleteNoteContentReqDTO deleteNoteContentReqDTO) {
        return noteContentService.deleteNoteContent(deleteNoteContentReqDTO);
    }
}

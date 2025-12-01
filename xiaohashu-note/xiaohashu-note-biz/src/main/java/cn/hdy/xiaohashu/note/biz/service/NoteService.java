package cn.hdy.xiaohashu.note.biz.service;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.note.biz.model.vo.FindNoteDetailReqVO;
import cn.hdy.xiaohashu.note.biz.model.vo.FindNoteDetailRspVO;
import cn.hdy.xiaohashu.note.biz.model.vo.PublishNoteReqVO;
import cn.hdy.xiaohashu.note.biz.model.vo.UpdateNoteReqVO;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/24 13:59
 * @Version: v1.0.0
 * @Description: 笔记业务
 **/
public interface NoteService {

    /**
     * 笔记发布
     *
     * @param publishNoteReqVO
     * @return
     */
    Response<?> publishNote(PublishNoteReqVO publishNoteReqVO);

    /**
     *
     * 笔记详情
     *
     * @param findNoteDetailReqVO
     * @return
     */
    Response<FindNoteDetailRspVO> findNoteDetail(FindNoteDetailReqVO findNoteDetailReqVO);


    /**
     * 笔记更新
     *
     * @param updateNoteReqVO
     * @return
     */
    Response<?> updateNote(UpdateNoteReqVO updateNoteReqVO);
}

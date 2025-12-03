package cn.hdy.xiaohashu.note.biz.service;

import cn.hdy.framework.common.response.Response;
import cn.hdy.xiaohashu.note.biz.model.vo.*;

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

    /**
     * 删除本地笔记缓存
     *
     * @param noteId
     */
    void deleteNoteLocalCache(Long noteId);


    /**
     * 笔记删除
     *
     * @param deleteNoteReqVO
     * @return
     */
    Response<?> deleteNote(DeleteNoteReqVO deleteNoteReqVO);

    /**
     * 笔记仅对自己可见
     *
     * @param updateNoteVisibleOnlyMeReqVO
     * @return
     */
    Response<?> visibleOnlyMe(UpdateNoteVisibleOnlyMeReqVO updateNoteVisibleOnlyMeReqVO);

    /**
     * 笔记置顶 / 取消置顶
     * @param topNoteReqVO
     * @return
     */
    Response<?> topNote(TopNoteReqVO topNoteReqVO);
}

package cn.hdy.xiaohashu.note.biz.constant;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/29 9:22
 * @Version: v1.0.0
 * @Description: TODO
 **/
public class RedisKeyConstants {

    /**
     * 笔记详情 KEY 前缀
     */
    public static final String NOTE_DETAIL_KEY = "note:detail:";


    /**
     * 构建完整的笔记详情 KEY
     * @param noteId
     * @return
     */
    public static String buildNoteDetailKey(Long noteId) {
        return NOTE_DETAIL_KEY + noteId;
    }

}

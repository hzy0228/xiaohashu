package cn.hdy.xiaohashu.note.biz.constant;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/12/1 11:09
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface MQConstants {

    /**
     * Topic 主题：删除笔记本地缓存
     */
    String TOPIC_DELETE_NOTE_LOCAL_CACHE = "DeleteNoteLocalCacheTopic";


    /**
     * Topic 主题：延迟双删 Redis 笔记缓存
     */
    String TOPIC_DELAY_DELETE_NOTE_REDIS_CACHE = "DelayDeleteNoteRedisCacheTopic";


}

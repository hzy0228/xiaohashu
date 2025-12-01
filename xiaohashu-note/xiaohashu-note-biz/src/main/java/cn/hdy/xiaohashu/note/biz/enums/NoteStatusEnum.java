package cn.hdy.xiaohashu.note.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/24 11:37
 * @Version: v1.0.0
 * @Description: 笔记状态
 **/
@Getter
@AllArgsConstructor
public enum NoteStatusEnum {

    BE_EXAMINE(0), // 待审核
    NORMAL(1), // 正常展示
    DELETED(2), // 被删除
    DOWNED(3), // 被下架
    ;

    private final Integer code;
}

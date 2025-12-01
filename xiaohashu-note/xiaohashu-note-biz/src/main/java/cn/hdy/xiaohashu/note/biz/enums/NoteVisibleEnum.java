package cn.hdy.xiaohashu.note.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/24 11:38
 * @Version: v1.0.0
 * @Description: 笔记可见性
 **/
@Getter
@AllArgsConstructor
public enum NoteVisibleEnum {

    PUBLIC(0), // 公开，所有人可见
    PRIVATE(1); // 仅自己可见

    private final Integer code;
}

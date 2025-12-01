package cn.hdy.xiaohashu.kv.dto.rsp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/17 8:42
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindNoteContentRspDTO {

    /**
     * 笔记内容 UUID
     */
    private UUID uuid;

    /**
     * 笔记内容
     */
    private String content;
}

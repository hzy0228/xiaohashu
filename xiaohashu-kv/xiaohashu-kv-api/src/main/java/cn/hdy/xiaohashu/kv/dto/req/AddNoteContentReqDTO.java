package cn.hdy.xiaohashu.kv.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/16 18:13
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddNoteContentReqDTO {


    @NotNull(message = "笔记 ID 不能为空")
    private Long noteId;

    @NotBlank(message = "笔记内容不能为空")
    private String content;

}

package cn.hdy.xiaohashu.kv.dto.req;

import jakarta.validation.constraints.NotBlank;
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


    @NotBlank(message = "笔记内容 UUID 不能为空")
    private String uuid;

    @NotBlank(message = "笔记内容不能为空")
    private String content;

}

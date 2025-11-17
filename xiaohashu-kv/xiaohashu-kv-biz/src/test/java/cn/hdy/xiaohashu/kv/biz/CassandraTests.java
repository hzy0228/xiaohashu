package cn.hdy.xiaohashu.kv.biz;

import cn.hdy.framework.common.util.JsonUtils;
import cn.hdy.xiaohashu.kv.biz.domain.dataobject.NoteContentDO;
import cn.hdy.xiaohashu.kv.biz.domain.repository.NoteContentRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.UUID;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/16 17:42
 * @Version: v1.0.0
 * @Description: TODO
 **/
@SpringBootTest
@Slf4j
public class CassandraTests {

    @Resource
    private NoteContentRepository noteContentRepository;

    /**
     * 测试插入数据
     */
    @Test
    void testInsert() {
        NoteContentDO noteContentDO = NoteContentDO.builder()
                .id(UUID.randomUUID())
                .content("这是一条评论")
                .build();
        noteContentRepository.save(noteContentDO);
    }

    /**
     * 测试修改数据
     */
    @Test
    void testUpdate() {
        NoteContentDO nodeContent = NoteContentDO.builder()
                .id(UUID.fromString("5000885a-8645-474d-9e98-791e794b8554"))
                .content("代码测试笔记内容更新")
                .build();

        noteContentRepository.save(nodeContent);
    }

    /**
     * 测试查询数据
     */
    @Test
    void testSelect() {
        Optional<NoteContentDO> optional = noteContentRepository.findById(UUID.fromString("5000885a-8645-474d-9e98-791e794b8554"));
        optional.ifPresent(noteContentDO -> log.info("查询结果：{}", JsonUtils.toJsonString(noteContentDO)));
    }

    /**
     * 测试删除数据
     */
    @Test
    void testDelete() {
        noteContentRepository.deleteById(UUID.fromString("5000885a-8645-474d-9e98-791e794b8554"));
    }

}

package cn.hdy.xiaohashu.kv.biz.domain.repository;

import cn.hdy.xiaohashu.kv.biz.domain.dataobject.NoteContentDO;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/16 17:39
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface NoteContentRepository extends CassandraRepository<NoteContentDO, UUID> {
}

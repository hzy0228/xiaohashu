package cn.hdy.xiaohashu.auth;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/26 8:26
 * @Version: v1.0.0
 * @Description: TODO
 **/
@SpringBootTest
@Slf4j
public class ThreadPoolTaskExecutorTests {

    @Resource
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;


    @Test
    void testSubmit() {
        threadPoolTaskExecutor.submit(() -> log.info("线程池测试"));
    }


}

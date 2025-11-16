package cn.hdy.xiaohashu.user.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/10 15:09
 * @Version: v1.0.0
 * @Description: TODO
 **/
@SpringBootApplication
@MapperScan("cn.hdy.xiaohashu.user.biz.domain.mapper")
@EnableFeignClients(basePackages = "cn.hdy.xiaohashu")
public class XiaohashuUserBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohashuUserBizApplication.class, args);
    }
}

package cn.hdy.xiaohashu.user.relation.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/12/3 14:27
 * @Version: v1.0.0
 * @Description: TODO
 **/
@SpringBootApplication
@MapperScan("cn.hdy.xiaohashu.user.relation.biz.domain.mapper")
@EnableFeignClients(basePackages = "cn.hdy.xiaohashu")
public class XiaohashuUserRelationBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohashuUserRelationBizApplication.class, args);
    }
}

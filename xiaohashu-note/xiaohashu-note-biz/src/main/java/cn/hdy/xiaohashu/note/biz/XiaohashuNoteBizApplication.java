package cn.hdy.xiaohashu.note.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/24 11:14
 * @Version: v1.0.0
 * @Description: TODO
 **/
@SpringBootApplication
@MapperScan("cn.hdy.xiaohashu.note.biz.domain.mapper")
@EnableFeignClients(basePackages = "cn.hdy.xiaohashu")
public class XiaohashuNoteBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohashuNoteBizApplication.class, args);
    }


}

package cn.hdy.framework.biz.operationlog.aspect;

import java.lang.annotation.*;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/22 15:27
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";
}

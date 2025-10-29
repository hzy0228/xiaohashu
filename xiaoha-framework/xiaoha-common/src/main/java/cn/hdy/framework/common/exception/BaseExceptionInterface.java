package cn.hdy.framework.common.exception;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/22 15:01
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface BaseExceptionInterface {

    // 获取异常码
    String getErrorCode();

    // 获取异常信息
    String getErrorMessage();
}

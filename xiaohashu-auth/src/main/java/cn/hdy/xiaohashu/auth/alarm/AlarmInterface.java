package cn.hdy.xiaohashu.auth.alarm;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/30 18:42
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface AlarmInterface {

    /**
     * 发送告警信息
     *
     * @param message
     * @return
     */
    boolean send(String message);
}

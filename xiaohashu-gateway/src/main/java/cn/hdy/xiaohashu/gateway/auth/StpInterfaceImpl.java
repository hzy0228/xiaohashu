package cn.hdy.xiaohashu.gateway.auth;


import cn.dev33.satoken.stp.StpInterface;
import cn.hdy.xiaohashu.gateway.constant.RedisKeyConstants;
import cn.hutool.core.collection.CollUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/11/3 9:32
 * @Version: v1.0.0
 * @Description: 自定义权限验证接口扩展
 **/
@Component
@Slf4j
public class StpInterfaceImpl implements StpInterface {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Resource
    private ObjectMapper objectMapper;


    /**
     * 获取用户权限
     *
     * @param loginId
     * @param loginType
     * @return
     */
    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        // 返回此 loginId 拥有的权限列表
        log.info("## 获取用户权限列表, loginId: {}", loginId);

        // 构建 用户-角色 Redis Key
        String userRolesKey = RedisKeyConstants.buildUserRoleKey(Long.valueOf(loginId.toString()));

        // 根据用户 ID ，从 Redis 中获取该用户的角色集合
        String userRolesValue = redisTemplate.opsForValue().get(userRolesKey);
        if (StringUtils.isBlank(userRolesValue)) {
            return null;
        }

        try {
            List<String> userRoleKeys = objectMapper.readValue(userRolesValue, new TypeReference<>() {
            });

            if (CollUtil.isNotEmpty(userRoleKeys)) {
                List<String> rolePermissionKeys = userRoleKeys.stream()
                        .map(RedisKeyConstants::buildRolePermissionsKey)
                        .toList();
                List<String> rolePermissionsValues = redisTemplate.opsForValue().multiGet(rolePermissionKeys);

                if (CollUtil.isNotEmpty(rolePermissionsValues)) {
                    List<String> permissions = Lists.newArrayList();

                    rolePermissionsValues.forEach(jsonValue -> {
                        try {

                            List<String> rolePermissions = objectMapper.readValue(jsonValue, new TypeReference<>() {
                            });
                            permissions.addAll(rolePermissions);
                        } catch (JsonProcessingException e) {
                            log.error("==> JSON 解析错误: ", e);
                        }

                    });
                    // 返回此用户所拥有的权限
                    return permissions;
                }


            }
        } catch (JsonProcessingException e) {
            log.error("==> JSON 解析错误: ", e);
        }


        return Collections.emptyList();
    }

    /**
     * 获取用户角色
     *
     * @param loginId
     * @param loginType
     * @return
     */
    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        log.info("## 获取用户角色列表, loginId: {}", loginId);

        // 构建 用户-角色 Redis Key
        String userRolesKey = RedisKeyConstants.buildUserRoleKey(Long.valueOf(loginId.toString()));

        // 根据用户 ID ，从 Redis 中获取该用户的角色集合
        String userRolesValue = redisTemplate.opsForValue().get(userRolesKey);

        if (StringUtils.isBlank(userRolesValue)) {
            return null;
        }

        // 将 JSON 字符串转换为 List<String> 集合
        try {
            return objectMapper.readValue(userRolesValue, new TypeReference<>() {
            });
        } catch (JsonProcessingException e) {
            log.error("==> JSON 解析错误: ", e);
        }

        return Collections.emptyList();
    }
}

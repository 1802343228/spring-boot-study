package com.soft1851.springboot.mbp.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName AdminService
 * @Description 模拟Admin服务
 * @Author mq_xu
 * @Date 2020/4/15
 * @Version 1.0
 */
@Service
public class AdminService {

    /**
     * 根据role获取权限
     *
     * @param role
     * @return List<String>
     */
    public List<String> getPermissionsByRole(String role) {
        Map<String, List<String>> map = new TreeMap<>();
        String[] admins = {"专辑管理", "歌曲管理",role+"权限"};
        String[] superAdmins = {"权限管理", "系统设置",role+"权限"};
        map.put("admin", Arrays.asList(admins));
        map.put("superAdmin", Arrays.asList(superAdmins));
        return map.get(role);
    }

    public boolean checkRole(String role) {
        if ("admin".equals(role) || ("superAdmin".equals(role))) {
            return true;
        } else {
            return false;
        }
    }
}

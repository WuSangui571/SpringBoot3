package com.sangui.springboot.service;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

/**
 * @author sangui
 */
public interface UserService {
    /**
     * 保存用户信息
     * @param id
     * @param name
     */
    void save(int id, String name);

    /**
     * 根据Id删除用户
     * @param id
     */
    void deleteById(int id);
}

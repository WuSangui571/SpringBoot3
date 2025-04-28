package com.sangui.lombok.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-27
 * @Description: User
 * @Version: 1.0
 */
// Data等价于ToString,
@Data
@NoArgsConstructor
// 全参数构造方法
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private Integer age;

}

package com.sangui.other;


import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-28
 * @Description: Person
 * @Version: 1.0
 */
// 符合建造者模式的代码
@Builder
@Data
public class Person {
    private String name;
    private int age;
    @Singular("addPhone")
    private List<String> phones;
}

package com.sangui.lombok.bean;


import lombok.*;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-27
 * @Description: Person
 * @Version: 1.0
 */
@Setter
@Getter
@ToString(exclude = {"age"})
//@EqualsAndHashCode(exclude = {"age"})
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
}

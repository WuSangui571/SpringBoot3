package com.sangui.test;


import com.sangui.builderpattern.Person;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-27
 * @Description: Test
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 方式一：分步写法
        /*Person.PersonBuilder builder = Person.builder();
        builder.age(111);
        builder.name("tom");
        Person person = builder.build();
        System.out.println(person);*/

        // 方式二：链式调用
        Person person = Person.builder()
                .age(24)
                .name("jack")
                .build();
        System.out.println(person);
    }
}

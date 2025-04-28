package com.sangui.lombok.test;


import com.sangui.lombok.bean.Person;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-27
 * @Description: PersonTest
 * @Version: 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackson");
        person.setAge(112);
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person);

        Person person2 = new Person();
        person2.setName("jackson");
        person2.setAge(110);

        boolean equals = person.equals(person2);
        System.out.println(equals);
    }
}

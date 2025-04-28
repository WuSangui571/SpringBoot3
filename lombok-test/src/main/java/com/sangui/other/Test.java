package com.sangui.other;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-28
 * @Description: Test
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("18843982373");
//        list.add("17463847384");
//        Person person = Person.builder()
//                .name("jack")
//                .age(44)
//                .phones(list)
//                .build();
//        System.out.println(person);

        Person person = Person.builder()
                .addPhone("18493859384")
                .name("jack")
                .age(44)
                .addPhone("18373628473")
                .build();
        System.out.println(person);
    }
}

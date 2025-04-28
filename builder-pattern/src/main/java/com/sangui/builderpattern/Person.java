package com.sangui.builderpattern;


/**
 * @Author: sangui
 * @CreateTime: 2025-04-27
 * @Description: Person
 * @Version: 1.0
 */
// 建造模式,23中GoF设计者模式之一
public class Person {
    // 一般建造模式的bean使用final进行修饰
    private final String name;
    private final int age;

    // 提供一个私有的全参数的构造方法
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter方法
    public String getName() {
        return name;
    }

    // getter方法
    public int getAge() {
        return age;
    }

    // 通过这个公开的静态方法获取静态对象
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 静态内部类：建造者
    public static class PersonBuilder {
        private String name;
        private int age;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }
        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, age);
        }
    }
}

package com.sangui.lombok.test;


import com.sangui.lombok.bean.Customer;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-27
 * @Description: CustomerTest
 * @Version: 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("zhangsan",11);
        System.out.println(customer);
    }
}

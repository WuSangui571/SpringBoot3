package com.sangui.springboot.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-25
 * @Description: AppBean
 * @Version: 1.0
 */
@ConfigurationProperties(prefix = "app2.abc")
public class AppBean {
    // 数组，数组中元素是简单类型
    private String[] names;

    // 数组，数组中元素是bean
    private Address[] addressArray;

    // List集合，集合中元素是bean
    private List<Address> addressList;

    // Map集合，String=Bean
    private Map<String,Address> addressMap;


    @Override
    public String toString() {
        return "AppBean{" +
                "names=" + Arrays.toString(names) +
                ", addressArray=" + Arrays.toString(addressArray) +
                ", addressList=" + addressList +
                ", addressMap=" + addressMap +
                '}';
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Address[] getAddressArray() {
        return addressArray;
    }

    public void setAddressArray(Address[] addressArray) {
        this.addressArray = addressArray;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Map<String, Address> getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map<String, Address> addressMap) {
        this.addressMap = addressMap;
    }

    public AppBean() {
    }

    public AppBean(String[] names, Address[] addressArray, List<Address> addressList, Map<String, Address> addressMap) {
        this.names = names;
        this.addressArray = addressArray;
        this.addressList = addressList;
        this.addressMap = addressMap;
    }
}

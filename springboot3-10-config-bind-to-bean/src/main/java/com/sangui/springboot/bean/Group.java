package com.sangui.springboot.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-25
 * @Description: v
 * @Version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "group")
@PropertySource("classpath:/a/b/group-info.properties")
//@PropertySource("classpath:/a/b/group-info.yml")
public class Group {
    private String name;
    private String leader;
    private String count;

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", leader='" + leader + '\'' +
                ", count='" + count + '\'' +
                '}';
    }

    public Group() {
    }

    public Group(String name, String leader, String count) {
        this.name = name;
        this.leader = leader;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}

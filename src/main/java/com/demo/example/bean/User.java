package com.demo.example.bean;

import org.springframework.stereotype.Component;

/**
 * Created by luhaob on 2019/1/16.
 */
@Component
public class User {

    private String username = "zhihao.miao";

    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}

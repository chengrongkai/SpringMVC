package com.crk.pojo;

import java.util.List;

/**
 * Created by 程荣凯 on 2018/3/11.
 */
public class UserInfo {
    private String id;
    private String name;
    private Integer age;
    private List<String> test;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }

    public UserInfo(String id, String name, Integer age,List<String> list) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.test = list;
    }
}

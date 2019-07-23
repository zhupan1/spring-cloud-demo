package com.pan.user.service.entity;

/**
 * @Author: Pan P Zhu
 * @Date: 23/07/2019 17:04
 * @Description: 实体类
 */
public class TestModel {


    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

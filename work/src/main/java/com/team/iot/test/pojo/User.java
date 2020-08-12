package com.team.iot.test.pojo;

public class User {

    private int id;
    private String name;
    private String code;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User() {
    }

    public User(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public User(String name, String code) {
        this.name = name;
        this.code = code;
    }
}

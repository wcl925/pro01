package com.team.iot.test.pojo;

public class Staff {
    private String id;
    private String user;
    private String password;
    private String position;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

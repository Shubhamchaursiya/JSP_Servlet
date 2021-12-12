package com.hotwax.bean;

public class StudentLogin {
    private String userId;
    private String password;


    public StudentLogin(String userId, String password) {
        this.userId = userId;
        this.password = password;


    }


    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "StudentLogin{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

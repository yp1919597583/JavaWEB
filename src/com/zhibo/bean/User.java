package com.zhibo.bean;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phonenumber;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }

    public User() {
    }

    public User(Integer id, String username, String password, String email, String phonenumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}

package com.wei.cosmosweiblog.pojo;

import java.io.Serializable;

public class BlogUser implements Serializable {

    private static final long serialVersionUID = -86149542952698496L;
    private Integer id;
    private String phone;
    private String email;
    private String username;
    private String password;
    private String address;
    private String perm;
    private String role;

    public BlogUser() {
    }

    public BlogUser(Integer id, String phone, String email, String username, String password, String address, String perm, String role) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address = address;
        this.perm = perm;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPerm() {
        return perm;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", perm='" + perm + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

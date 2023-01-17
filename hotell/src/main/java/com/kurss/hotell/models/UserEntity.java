package com.kurss.hotell.models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "User")
public class UserEntity {
    @Id
    private String name;

    private String phone;
    private String mail,password;
    private String role;



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UserEntity() {

    }
    public UserEntity(String phone, String name, String mail, String password, String role) {
        this.phone = phone;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.role = role;
    }
}
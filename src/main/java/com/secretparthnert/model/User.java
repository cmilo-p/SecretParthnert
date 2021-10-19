package com.secretparthnert.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {
    
    @Id
    @Column(name = "_id")
    private int _id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "rol")
    // Clase rol para instanciar
    private int rol;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "gender")
    private String gender;

    public User() {
    }

    public User(String name, String email, int rol, String username, String password, String gender) {
        this.name = name;
        this.email = email;
        this.rol = rol;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" + "_id=" + _id + ", name=" + name + ", email=" + email + ", rol=" + rol + ", username=" + username + ", password=" + password + ", gender=" + gender + '}';
    }

}

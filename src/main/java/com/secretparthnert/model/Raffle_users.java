package com.secretparthnert.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "raffle_users")
public class Raffle_users implements Serializable {
    
    @Id
    @Column(name = "_id")
    private int _id;
    
    // Clase Raffle para instanciar
    @Column(name = "raffle")
    private int raffle;
    
    // Clase User para instanciar
    @Column(name = "user")
    private int user;

    public Raffle_users() {
    }

    public Raffle_users(int raffle, int user) {
        this.raffle = raffle;
        this.user = user;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getRaffle() {
        return raffle;
    }

    public void setRaffle(int raffle) {
        this.raffle = raffle;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Raffle_users{" + "_id=" + _id + ", raffle=" + raffle + ", user=" + user + '}';
    }

}

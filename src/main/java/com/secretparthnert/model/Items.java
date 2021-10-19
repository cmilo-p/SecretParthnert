package com.secretparthnert.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Items implements Serializable {
    
    @Id
    @Column(name = "_id")
    private int _id;
    
    // Clase TpItems para instanciar
    @Column(name = "tpItem")
    private int tpItem;
    
    @Column(name = "description")
    private String description;
    
    // Clase Raffle para instanciar
    @Column(name = "raffleCode")
    private int raffleCode;

    public Items() {
    }

    public Items(int tpItem, String description, int raffleCode) {
        this.tpItem = tpItem;
        this.description = description;
        this.raffleCode = raffleCode;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getTpItem() {
        return tpItem;
    }

    public void setTpItem(int tpItem) {
        this.tpItem = tpItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRaffleCode() {
        return raffleCode;
    }

    public void setRaffleCode(int raffleCode) {
        this.raffleCode = raffleCode;
    }

    @Override
    public String toString() {
        return "Items{" + "_id=" + _id + ", tpItem=" + tpItem + ", description=" + description + ", raffleCode=" + raffleCode + '}';
    }
    
}

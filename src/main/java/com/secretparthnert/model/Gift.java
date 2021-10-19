package com.secretparthnert.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gifts")
public class Gift implements Serializable {
    
    @Id
    @Column(name = "_id")
    private int _id;
    
    // Clase User para instanciar
    @Column(name = "user")
    private int user;
    
    // Clase Items para instanciar
    @Column(name = "items")
    private int items;
    
    @Column(name = "details")
    private String details;
    
    @Column(name = "quantity")
    private int quantity;
    
    @Column(name = "trademark")
    private String trademark;
    
    @Column(name = "material")
    private String material;
    
    @Column(name = "type")
    private String type;
    
    @Column(name = "size")
    private String size;
    
    @Column(name = "color")
    private String color;

    public Gift() {
    }

    public Gift(int user, int items, String details, int quantity, String trademark, String material, String type, String size, String color) {
        this.user = user;
        this.items = items;
        this.details = details;
        this.quantity = quantity;
        this.trademark = trademark;
        this.material = material;
        this.type = type;
        this.size = size;
        this.color = color;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gift{" + "_id=" + _id + ", user=" + user + ", items=" + items + ", details=" + details + ", quantity=" + quantity + ", trademark=" + trademark + ", material=" + material + ", type=" + type + ", size=" + size + ", color=" + color + '}';
    }

}

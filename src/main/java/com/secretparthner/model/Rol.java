package com.secretparthner.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol implements Serializable {

    @Id
    @Column(name = "_id")
    private int _id;

    @Column(name = "description")
    private String description;

    public Rol() {
    }

    public Rol(String description) {
        this.description = description;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Rol{" + "_id=" + _id + ", description=" + description + '}';
    }
    
}

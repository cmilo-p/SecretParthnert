
package com.secretparthner.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tpitems")
public class TpItems implements Serializable {
    
    @Id
    @Column(name = "_id")
    private int _id;
    
    @Column(name = "description")
    private String description;

    public TpItems() {
    }

    public TpItems(String description) {
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
        return "TpItems{" + "_id=" + _id + ", description=" + description + '}';
    }

}

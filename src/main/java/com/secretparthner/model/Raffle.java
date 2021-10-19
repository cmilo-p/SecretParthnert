package com.secretparthner.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "raffles")
public class Raffle implements Serializable {
    
    @Id
    @Column(name = "_id")
    private int _id;
    
    @Column(name = "codigo")
    private String codigo;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "minValue")
    private float minValue;
    
    @Column(name = "maxValue")
    private float maxValue;
    
    @Column(name = "participants")
    private int participants;
    
    @Column(name = "initDate")
    private Date initDate;
    
    @Column(name = "finalDate")
    private Date finalDate;

    public Raffle() {
    }

    public Raffle(String codigo, String name, String description, float minValue, float maxValue, int participants, Date initDate, Date finalDate) {
        this.codigo = codigo;
        this.name = name;
        this.description = description;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.participants = participants;
        this.initDate = initDate;
        this.finalDate = finalDate;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getMinValue() {
        return minValue;
    }

    public void setMinValue(float minValue) {
        this.minValue = minValue;
    }

    public float getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(float maxValue) {
        this.maxValue = maxValue;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    @Override
    public String toString() {
        return "Raffle{" + "_id=" + _id + ", codigo=" + codigo + ", name=" + name + ", description=" + description + ", minValue=" + minValue + ", maxValue=" + maxValue + ", participants=" + participants + ", initDate=" + initDate + ", finalDate=" + finalDate + '}';
    }
    
}

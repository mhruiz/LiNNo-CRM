package com.litto.crm.entity;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activity")
public class ActivityEntity {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "deal")
    private DealEntity deal;

    @Column(name = "type")
    private String type;

    @Column(name = "date")
    private Date date;

    @Column(name = "description")
    private String description;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public ActivityEntity() {
    }

    public ActivityEntity(int id, DealEntity deal, String type, Date date, String description) {
        this.id = id;
        this.deal = deal;
        this.type = type;
        this.date = date;
        this.description = description;
    }

    public ActivityEntity(DealEntity deal, String type, Date date, String description) {
        this.deal = deal;
        this.type = type;
        this.date = date;
        this.description = description;
    }

    // =================================================================================================================
    // Getters and Setters
    // =================================================================================================================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DealEntity getDeal() {
        return deal;
    }

    public void setDeal(DealEntity deal) {
        this.deal = deal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

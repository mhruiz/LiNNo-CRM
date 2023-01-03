package com.litto.crm.payload;

import com.litto.crm.entity.DealEntity;
import java.util.Date;

public class ActivityDTO {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private int id;
    private DealEntity deal;
    private String type;
    private Date date;
    private String description;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public ActivityDTO() {
    }

    public ActivityDTO(int id, DealEntity deal, String type, Date date, String description) {
        this.id = id;
        this.deal = deal;
        this.type = type;
        this.date = date;
        this.description = description;
    }

    public ActivityDTO(int id, String type, Date date, String description) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.description = description;
    }

    public ActivityDTO(DealEntity deal, String type, Date date, String description) {
        this.deal = deal;
        this.type = type;
        this.date = date;
        this.description = description;
    }

    public ActivityDTO(String type, Date date, String description) {
        this.type = type;
        this.date = date;
        this.description = description;
    }
    // =================================================================================================================
    // Getters
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

    public void setDel(DealEntity deal) {
        this.deal = deal;
    }

    public String getType() {
        return type;
    }

    // =================================================================================================================
    // Setters
    // =================================================================================================================

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

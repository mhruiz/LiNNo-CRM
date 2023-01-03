package com.litto.crm.payload;

import com.litto.crm.entity.ActivityEntity;
import com.litto.crm.entity.CompanyEntity;
import com.litto.crm.entity.ContactEntity;
import java.util.Date;
import java.util.List;

public class DealDTO {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private int id;
    private String title;
    private Date createDate;
    private Date lastUpdate;
    private String currentState;
    private ContactEntity pointContact;
    private CompanyEntity company;
    private List<ActivityEntity> listActivities;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public DealDTO() {
    }

    public DealDTO(int id, String title, Date createDate, Date lastUpdate, String currentState,
            ContactEntity pointContact, CompanyEntity company, List<ActivityEntity> listActivities) {
        this.id = id;
        this.title = title;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.currentState = currentState;
        this.pointContact = pointContact;
        this.company = company;
        this.listActivities = listActivities;
    }

    public DealDTO(int id, String title, Date createDate, Date lastUpdate, String currentState) {
        this.id = id;
        this.title = title;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.currentState = currentState;
    }


    public DealDTO(String title, Date createDate, Date lastUpdate, String currentState, ContactEntity pointContact,
            CompanyEntity company, List<ActivityEntity> listActivities) {
        this.title = title;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.currentState = currentState;
        this.pointContact = pointContact;
        this.company = company;
        this.listActivities = listActivities;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    // =================================================================================================================
    // Setters
    // =================================================================================================================

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public ContactEntity getPointContact() {
        return pointContact;
    }

    public void setPointContact(ContactEntity pointContact) {
        this.pointContact = pointContact;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }

    public List<ActivityEntity> getListActivities() {
        return listActivities;
    }

    public void setListActivities(List<ActivityEntity> listActivities) {
        this.listActivities = listActivities;
    }
}

package com.litto.crm.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "deals")
public class DealEntity {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "creation_date")
    private Date createDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "current_state")
    private String currentState;

    @OneToOne
    @JoinColumn(name = "point_of_contact_id")
    private ContactEntity contactEntity;

    @OneToOne
    @JoinColumn(name = "company_id")
    private CompanyEntity company;

    @OneToMany(mappedBy = "deal")
    private List<ActivityEntity> listActivities;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public DealEntity() {
    }

    public DealEntity(int id, String title, Date createDate, Date lastUpdate, String currentState,
            ContactEntity contactEntity, CompanyEntity company,
            List<ActivityEntity> listActivities) {
        this.id = id;
        this.title = title;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.currentState = currentState;
        this.contactEntity = contactEntity;
        this.company = company;
        this.listActivities = listActivities;
    }

    public DealEntity(String title, Date createDate, Date lastUpdate, String currentState,
            ContactEntity contactEntity, CompanyEntity company,
            List<ActivityEntity> listActivities) {
        this.title = title;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.currentState = currentState;
        this.contactEntity = contactEntity;
        this.company = company;
        this.listActivities = listActivities;
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

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public ContactEntity getContactEntity() {
        return contactEntity;
    }

    public void setContactEntity(ContactEntity contactEntity) {
        this.contactEntity = contactEntity;
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

package com.litto.crm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class CompanyEntity {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "web")
    private String web;

    @Column(name = "address")
    private String address;

    @Column(name = "sector")
    private String sector;

    @Column(name = "logo")
    private String logo;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public CompanyEntity() {
    }

    public CompanyEntity(int id, String name, String web, String address, String sector, String logo) {
        this.id = id;
        this.name = name;
        this.web = web;
        this.address = address;
        this.sector = sector;
        this.logo = logo;
    }

    public CompanyEntity(String name, String web, String address, String sector, String logo) {
        this.name = name;
        this.web = web;
        this.address = address;
        this.sector = sector;
        this.logo = logo;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}

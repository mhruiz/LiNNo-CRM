package com.litto.crm.payload;

public class CompanyDTO {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private int id;
    private String name;
    private String web;
    private String address;
    private String sector;
    private String logo;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public CompanyDTO() {
    }

    public CompanyDTO(int id, String name, String web, String address, String sector, String logo) {
        this.id = id;
        this.name = name;
        this.web = web;
        this.address = address;
        this.sector = sector;
        this.logo = logo;
    }

    public CompanyDTO(String name, String web, String address, String sector, String logo) {
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

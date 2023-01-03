package com.litto.crm.payload;

public class ContactDTO {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private int id;
    private String name;
    private String lastName;
    private String email;
    private String picture;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public ContactDTO() {
    }

    public ContactDTO(int id, String name, String lastName, String email, String picture) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.picture = picture;
    }

    public ContactDTO(String name, String lastName, String email, String picture) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.picture = picture;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    // =================================================================================================================
    // Setters
    // =================================================================================================================

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}

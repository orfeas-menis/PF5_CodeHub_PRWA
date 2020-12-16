package pf5.codehub.team5.webapp.form;

import pf5.codehub.team5.webapp.domain.User;

import java.util.Date;

public class RepairForm {

    private String street;
    private String streetNumber;
    private String postalCode;
    private String city;
    private Date dateTime;
    private String description;
    private String status;
    private String category;
    private double cost;
    private User user;

    public RepairForm(){}
    public RepairForm(String street, String streetNumber, String postalCode, String city, Date dateTime, String description, String status, String category, double cost, User user) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.dateTime = dateTime;
        this.description = description;
        this.status = status;
        this.category = category;
        this.cost = cost;
        this.user = user;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

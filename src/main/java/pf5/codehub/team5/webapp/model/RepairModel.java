package pf5.codehub.team5.webapp.model;


import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.enums.Category;
import pf5.codehub.team5.webapp.enums.Status;


import java.time.LocalDate;
import java.util.Date;

public class RepairModel {
    private Long id;
    private String street;
    private String streetNumber;
    private String postalCode;
    private String city;
    private String dateTime;
    private String description;
    private Status status;
    private Category category;
    private double cost;
    private String userVat;

    public RepairModel(){}

    public RepairModel(Long id, String street, String streetNumber, String postalCode, String city, String dateTime, String description, Status status, Category category, double cost, String userVat) {
        this.id = id;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.dateTime = dateTime;
        this.description = description;
        this.status = status;
        this.category = category;
        this.cost = cost;
        this.userVat = userVat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getUserVat() {
        return userVat;
    }

    public void setUserVat(String userVat) {
        this.userVat = userVat;
    }
}

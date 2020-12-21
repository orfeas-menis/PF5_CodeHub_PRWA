package pf5.codehub.team5.webapp.domain;

import org.springframework.format.annotation.DateTimeFormat;
import pf5.codehub.team5.webapp.enums.Category;
import pf5.codehub.team5.webapp.enums.Status;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "REPAIR")
public class Repair {

    private static final int MAX_LENGTH_SHORT = 60;
    private static final int MAX_LENGTH_LONG = 120;


    @Id
    @Column(name = "repair_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street", length = MAX_LENGTH_SHORT)
    private String street;

    @Column(name = "street_number", length = MAX_LENGTH_SHORT)
    private String streetNumber;

    @Column(name = "postal_code", length = MAX_LENGTH_SHORT)
    private String postalCode;

    @Column(name = "city", length = MAX_LENGTH_SHORT)
    private String city;

    @Column(name = "date_time", length = MAX_LENGTH_SHORT)
    @DateTimeFormat
    private LocalDate dateTime;

    @Column(name = "description", length = MAX_LENGTH_LONG)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Category category;

    @Column(name = "cost")
    private double cost;

    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private User user;

    public Repair() {

    }

    public Repair(Long id, String street, String streetNumber, String postalCode, String city, LocalDate dateTime, String description, Status status, Category category, double cost, User user) {
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
        this.user = user;
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

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

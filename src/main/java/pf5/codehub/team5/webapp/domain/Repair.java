package pf5.codehub.team5.webapp.domain;

import pf5.codehub.team5.webapp.enums.Category;
import pf5.codehub.team5.webapp.enums.Status;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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
    private Date dateTime;

    @Column(name = "description", length = MAX_LENGTH_LONG)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Set<Category> categories;

    @Column(name = "cost")
    private double cost;

    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private User user;

    public Repair(String street, String streetNumber, String postalCode, String city, Date dateTime, String description, Status status, Set<Category> categories, double cost, User user) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.dateTime = dateTime;
        this.description = description;
        this.status = status;
        this.categories = categories;
        this.cost = cost;
        this.user = user;
    }

    public Repair() {
        this.status = Status.PENDIND;
    }

    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public double getCost() {
        return cost;
    }

    public User getUser() {
        return user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

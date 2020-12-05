package pf5.codehub.team5.webapp.domain;


import org.hibernate.usertype.UserType;
import pf5.codehub.team5.webapp.enums.PropertyType;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "USER")
public class User {

    private static final int MAX_LENGTH_SHORT = 60;

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vat", length = MAX_LENGTH_SHORT, nullable = false)
    private String vat;

    @Column(name = "firstname", length = MAX_LENGTH_SHORT)
    private String firstName;

    @Column(name = "lastname", length = MAX_LENGTH_SHORT)
    private String lastName;

    @Column(name = "email", length = MAX_LENGTH_SHORT)
    private String email;

    @Column(name = "phone_number", length = MAX_LENGTH_SHORT)
    private String phoneNumber;

    @Column(name = "password", length = MAX_LENGTH_SHORT)
    private String password;

    @Column(name = "street", length = MAX_LENGTH_SHORT)
    private String street;

    @Column(name = "street_number", length = MAX_LENGTH_SHORT)
    private String streetNumber;

    @Column(name = "postal_code", length = MAX_LENGTH_SHORT)
    private String postalCode;

    @Column(name = "city", length = MAX_LENGTH_SHORT)
    private String city;

    @Enumerated(EnumType.STRING)
    @Column(name = "property_type")
    private List<PropertyType> propertyTypes;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    private Set<UserType> userTypes;

    @OneToMany(mappedBy = "user", targetEntity = Repair.class)
    private List<Repair> repairs;


    public User() {
    }

    public User(Long id, String vat, String firstName, String lastName, String email, String phoneNumber, String password, String street, String streetNumber, String postalCode, String city, List<PropertyType> propertyTypes, Set<UserType> userTypes, List<Repair> repairs) {
        this.id = id;
        this.vat = vat;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.propertyTypes = propertyTypes;
        this.userTypes = userTypes;
        this.repairs = repairs;
    }

    public Long getId() {
        return id;
    }

    public String getVat() {
        return vat;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
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

    public List<PropertyType> getPropertyTypes() {
        return propertyTypes;
    }

    public Set<UserType> getUserTypes() {
        return userTypes;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void setPropertyTypes(List<PropertyType> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public void setUserTypes(Set<UserType> userTypes) {
        this.userTypes = userTypes;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }
}

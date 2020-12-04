package pf5.codehub.team5.webapp.domain;


import org.hibernate.usertype.UserType;
import pf5.codehub.team5.webapp.enums.PropertyType;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "USER")
public class User {

    private static final int MAX_NAME_LENGTH = 60;

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vat", length = MAX_NAME_LENGTH, nullable = false)
    private String vat;

    @Column(name = "firstname", length = MAX_NAME_LENGTH)
    private String firstName;

    @Column(name = "lastname", length = MAX_NAME_LENGTH)
    private String lastName;

    @Column(name = "email", length = MAX_NAME_LENGTH)
    private String email;

    @Column(name = "phone_number", length = MAX_NAME_LENGTH)
    private String phoneNumber;

    @Column(name = "password", length = MAX_NAME_LENGTH)
    private String password;

    @Column(name = "address", length = MAX_NAME_LENGTH)
    private String address;

    /*
    @Column(name = "street", length = MAX_NAME_LENGTH)
    private String street;

    @Column(name = "street_number", length = MAX_NAME_LENGTH)
    private String streetNumber;

    @Column(name = "postal_code", length = MAX_NAME_LENGTH)
    private String postalCode;

    @Column(name = "city", length = MAX_NAME_LENGTH)
    private String city;
     */

    @Column(name = "property_type")
    private List<PropertyType> propertyTypes;

    @Column(name = "user_type")
    private Set<UserType> userTypes;

    public User(Long id, String vat, String firstName, String lastName, String email, String phoneNumber, String password, String address, List<PropertyType> propertyTypes, Set<UserType> userTypes) {
        this.id = id;
        this.vat = vat;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.address = address;
        this.propertyTypes = propertyTypes;
        this.userTypes = userTypes;
    }

    public User(){
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

    public String getAddress() {
        return address;
    }

    public List<PropertyType> getPropertyTypes() {
        return propertyTypes;
    }

    public Set<UserType> getUserTypes() {
        return userTypes;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPropertyTypes(List<PropertyType> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public void setUserTypes(Set<UserType> userTypes) {
        this.userTypes = userTypes;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", vat='" + vat + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", propertyTypes=" + propertyTypes +
                ", userTypes=" + userTypes +
                '}';
    }
}

package io.doherty.john.weekthreelab.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private long id;

    private String street;
    private String apt;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public Address() { }

    public Address(String street, String apt, String city, String state, String zipcode, String country) {
        this.street = street;
        this.apt = apt;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getApt() {
        return apt;
    }
    public void setApt(String apt) {
        this.apt = apt;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

}
package com.wchallenge.main.model;

import java.io.Serializable;

public class Address implements Serializable {

    //Variables
    private String street;
    private String suite;
    private String city;
    private String zipcode;

    private Geography geo;

    //Constructors
    public Address (){}

    public Address(String street, String suite, String city, String zipcode, Geography geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    //Begin getters and setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geography getGeo() {
        return geo;
    }

    public void setGeo(Geography geo) {
        this.geo = geo;
    }
    //End getters and setters

    //Constants
    private static final long serialVersionUID = 939055206570795012L;
}
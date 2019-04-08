package com.wchallenge.main.model;

import java.io.Serializable;

public class Geography implements Serializable {

    //Variables
    private String lat;
    private String lng;

    //Constructors
    public Geography() {}

    public Geography(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    //Begin getters and setters
    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
    //End getters and setters

    //Constructors
    private static final long serialVersionUID = -1765244514246488912L;
}
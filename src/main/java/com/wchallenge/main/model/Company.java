package com.wchallenge.main.model;

import java.io.Serializable;

public class Company implements Serializable {

    //Variables
    private String name;
    private String catchPhrase;
    private String bs;

    //Constructors
    public Company() {}

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    //Begin getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }
    //End getters and setters

    //Constants
    private static final long serialVersionUID = -35530515700172325L;
}

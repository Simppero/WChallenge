package com.wchallenge.main.model;

import java.io.Serializable;

public class Album implements Serializable {

    //Variables
    private Integer id;
    private Integer userId;
    private String title;

    //Constructors
    public Album() {}

    public Album(Integer id, Integer userId, String title) {
        this.id = id;
        this.userId = userId;
        this.title = title;
    }

    //Begin getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //End getters and setters

    //Constants
    private static final long serialVersionUID = -1299766635607518899L;
}

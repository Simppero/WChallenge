package com.wchallenge.main.model;

import java.io.Serializable;

public class Post implements Serializable {

    //Variables
    private Integer userId;
    private Integer id;
    private String title;
    private String body;

    //Constructors
    public Post() {
    }

    public Post(Integer userId, Integer id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    //Begin getters and setters
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    //End getters and setters

    //Constants
    private static final long serialVersionUID = 1190392624556408597L;
}

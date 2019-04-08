package com.wchallenge.main.model;

import java.io.Serializable;

public class Comment implements Serializable {

    //Variables
    private Integer postId;
    private Integer id;
    private String name;
    private String email;
    private String body;

    //Constructors
    public Comment() {
    }

    public Comment(Integer postId, Integer id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    //Begin getters and setters
    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    //End getters and setters

    //Constants
    private static final long serialVersionUID = 4206923750556993393L;
}
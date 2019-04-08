package com.wchallenge.main.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Permission implements Serializable {

    //Variables
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long albumId;
    @ElementCollection
    private List<String> users;

    //Constructors
    public Permission() {
    }

    public Permission(Long id, Long userId, Long albumId, String username) {
        this.id = id;
        this.userId = userId;
        this.albumId = albumId;
    }

    //Begin getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
    //End getters and setters

    //Constants
    private static final long serialVersionUID = 358974678757322565L;
}

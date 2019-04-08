package com.wchallenge.main.model;

import java.io.Serializable;

public class Photo implements Serializable {

    //Variables
    private Integer id;
    private Integer albumId;
    private String title;
    private String url;
    private String thumbnailUrl;

    //Constructors
    public Photo() {}

    public Photo(Integer id, Integer albumId, String title, String url, String thumbnailUrl) {
        this.id = id;
        this.albumId = albumId;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    //Begin getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
    //End getters and setters

    //Constants
    private static final long serialVersionUID = -2421154835794988908L;
}

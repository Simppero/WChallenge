package com.wchallenge.main.rest;

import com.wchallenge.main.model.*;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResourceService {

    private final RestTemplate restTemplate;
    public static final String typicodeURL = "https://jsonplaceholder.typicode.com";

    private ResourceService(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    public User[] getUsers() {
        return restTemplate.getForObject(typicodeURL + "/users", User[].class);
    }

    public User getUserById(Integer userId){
        return restTemplate.getForObject(typicodeURL + "/users/" + userId, User.class);
    }

    public Album[] getAlbums(){
        return restTemplate.getForObject(typicodeURL + "/albums", Album[].class);
    }

    public Album getAlbumsById(Integer id){
        return restTemplate.getForObject(typicodeURL + "/albums/" + id, Album.class);
    }

    public Photo[] getPhotos(){
        return restTemplate.getForObject(typicodeURL + "/photos", Photo[].class);
    }

    public Post[] getPosts(){
        return restTemplate.getForObject(typicodeURL + "/posts", Post[].class);
    }

    public Comment[] getComments(){
        return restTemplate.getForObject(typicodeURL + "/comments", Comment[].class);
    }

}

package com.wchallenge.main.utils;

import com.wchallenge.main.model.Photo;
import com.wchallenge.main.rest.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PhotoUtils {

    @Autowired
    ResourceService resourceService;

    public List<Photo> findPhotos(){
        return Arrays.asList(resourceService.getPhotos());
    }

    public List<Photo> findPhotosByAlbum(Integer id){
        final List<Photo> photos = findPhotos();
        final List<Photo> result = photos.stream().filter(f -> f.getAlbumId().equals(id)).collect(Collectors.toList());
        return result;
    }
}

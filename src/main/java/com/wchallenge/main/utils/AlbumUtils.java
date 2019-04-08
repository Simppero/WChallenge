package com.wchallenge.main.utils;

import com.wchallenge.main.model.Album;
import com.wchallenge.main.rest.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AlbumUtils {

    @Autowired
    ResourceService resourceService;


    public List<Album> findAlbums(){
        return Arrays.asList(resourceService.getAlbums());
    }

    public Album findAlbumById(Integer id){
        return resourceService.getAlbumsById(id);
    }

    public List<Album> findAlbumsByUser(Integer id){
        final List<Album> albums = findAlbums();
        final List<Album> result = albums.stream().filter(f -> f.getUserId().equals(id)).collect(Collectors.toList());
        return result;
    }

}

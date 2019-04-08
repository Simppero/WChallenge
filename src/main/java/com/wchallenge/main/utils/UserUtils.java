package com.wchallenge.main.utils;

import com.wchallenge.main.model.User;
import com.wchallenge.main.rest.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserUtils {

    @Autowired
    ResourceService resourceService;

    public List<User> findUsers(){
        return Arrays.asList(resourceService.getUsers());
    }

    public User findUserById(Integer id){
        return resourceService.getUserById(id);
    }

}

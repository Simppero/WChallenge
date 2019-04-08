package com.wchallenge.main.utils;

import com.wchallenge.main.model.Comment;
import com.wchallenge.main.model.Post;
import com.wchallenge.main.rest.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostUtils {

    @Autowired
    ResourceService resourceService;

    public List<Post> findPosts(){
        return Arrays.asList(resourceService.getPosts());
    }

    public List<Post> findPostsByUserId(Integer id){
        final List<Post> posts = findPosts();
        final List<Post> result = posts.stream().filter(f -> f.getUserId().equals(id)).collect(Collectors.toList());
        return result;
    }

    public List<Comment> findComments(){
        return  Arrays.asList(resourceService.getComments());
    }

    public List<Comment> findCommentsByPostId(Integer id){
        final List<Comment> comments = findComments();
        final List<Comment> result = comments.stream().filter(f -> f.getPostId().equals(id)).collect(Collectors.toList());
        return result;
    }

    public List<Comment> findCommentsByPosts(List<Post> posts) {
        final List<Comment> comments = findComments();
        final List<Comment> result = new ArrayList<>();
        for (final Post post : posts) {
            result.addAll(comments.stream().filter(g -> g.getPostId().equals(post.getId())).collect(Collectors.toList()));
        }
        return result;
    }
}

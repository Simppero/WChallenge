package com.wchallenge.main.controller;

import com.wchallenge.main.dao.PermissionDao;
import com.wchallenge.main.model.*;
import com.wchallenge.main.utils.AlbumUtils;
import com.wchallenge.main.utils.PhotoUtils;
import com.wchallenge.main.utils.PostUtils;
import com.wchallenge.main.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserUtils userUtils;

    @Autowired
    private AlbumUtils albumUtils;

    @Autowired
    private PhotoUtils photoUtils;

    @Autowired
    private PostUtils postUtils;

    @Autowired
    private PermissionDao permissionDao;


    @GetMapping("/")
    public String typicode(Model model) {
        model.addAttribute("users", userUtils.findUsers());
        return "index";
    }

    @RequestMapping("/user")
    public String userInfo(Integer id, Model model) {
        final User user = userUtils.findUserById(id);
        final List<Album> albums = albumUtils.findAlbumsByUser(id);
        model.addAttribute("user", user);
        model.addAttribute("albums", albums);
        return "user.css";
    }

    @GetMapping("/user/album/{id}")
    public String album(Model model, @PathVariable("id") Integer id) {
        final Album album = albumUtils.findAlbumById(id);
        final User user = userUtils.findUserById(album.getUserId());
        final List<Photo> photos = photoUtils.findPhotosByAlbum(id);

        model.addAttribute("album", album);
        model.addAttribute("user", user);
        model.addAttribute("photos", photos);

        return "album";
    }

    @GetMapping("/user/album/{id}/permissions")
    public String permissionsGet(@PathVariable("id") Integer id, Model model) {
        final Album album = albumUtils.findAlbumById(id);

        Permission permission = permissionDao.findByAlbumId(Long.valueOf(id));

        if (permission == null) {
            permission = new Permission();
            permission.setAlbumId(Long.valueOf(id));
            permission.setUserId(Long.valueOf(album.getUserId()));
            permission.setUsers(new ArrayList<>());
            permissionDao.save(permission);
        }

        model.addAttribute("users", userUtils.findUsers());
        model.addAttribute("album", album);
        model.addAttribute("usersChecked", permission.getUsers());

        return "permissions";
    }

    @PostMapping("/user/album/{albumId}/permissions")
    public String permissionsPost(@PathVariable("albumId") Integer id, @RequestParam("example") List<String> values, Model model) {

        final Permission permission = permissionDao.findByAlbumId(Long.valueOf(id));

        permission.setUsers(values);
        permissionDao.save(permission);

        return permissionsGet(id, model);
    }

    @GetMapping("/user/posts/{userId}")
    public String getPosts(Model model, @PathVariable("userId") Integer id) {

        final List<Post> posts = postUtils.findPostsByUserId(id);

        final List<Comment> comments = postUtils.findCommentsByPosts(posts);

        model.addAttribute("posts", posts);
        model.addAttribute("comments", comments);

        return "posts";
    }
}

package com.wchallenge.main.dao;

import com.wchallenge.main.model.Permission;
import org.springframework.data.repository.CrudRepository;

public interface PermissionDao extends CrudRepository<Permission, Long> {

    Permission findByAlbumId(Long albumId);

}

package com.mvictorl.dao;

import com.mvictorl.entity.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mvictorl on 7/13/17.
 */

@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, Long> {
    @Query("select a.role from UserRole a, User b where b.userName=?1 and a.userId=b.userId")
    public List<String> findRoleByUserName(String username);
}

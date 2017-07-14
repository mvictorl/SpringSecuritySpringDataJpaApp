package com.mvictorl.dao;

import com.mvictorl.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mvictorl on 7/13/17.
 */

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public User findByUserName(String username);
}

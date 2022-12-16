package com.thales.dao;

import com.thales.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User,Integer> {

    @Query("SELECT u FROM User u WHERE u.login=:login")
    User findByLogin(String login);

}

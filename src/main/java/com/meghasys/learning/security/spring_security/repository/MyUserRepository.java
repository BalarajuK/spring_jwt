package com.meghasys.learning.security.spring_security.repository;

import com.meghasys.learning.security.spring_security.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface MyUserRepository extends JpaRepository<MyUser, Long> {
    Optional<MyUser> findByUserName(String username);
}

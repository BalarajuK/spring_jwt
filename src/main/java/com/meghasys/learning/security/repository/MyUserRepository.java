package com.meghasys.learning.security.repository;

import com.meghasys.learning.security.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MyUserRepository extends JpaRepository<MyUser, Long> {
    Optional<MyUser> findByUserName(String username);
}

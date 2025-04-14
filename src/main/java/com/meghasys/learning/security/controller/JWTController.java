package com.meghasys.learning.security.controller;

import com.meghasys.learning.security.model.LoginUser;
import com.meghasys.learning.security.services.jwt.MyJWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class JWTController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyJWTService jwtService;

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/jwt/authenticate")
    public String authenticateAndGetToken(@RequestBody LoginUser user) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(userDetailsService.loadUserByUsername(user.getUsername()));
        } else {
            throw new UsernameNotFoundException("Invalid Credentials");
        }

    }

}

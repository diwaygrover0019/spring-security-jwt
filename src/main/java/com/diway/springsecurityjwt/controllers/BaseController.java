package com.diway.springsecurityjwt.controllers;

import com.diway.springsecurityjwt.models.AuthenticationRequest;
import com.diway.springsecurityjwt.models.AuthenticationResponse;
import com.diway.springsecurityjwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/authenticate")
    public ResponseEntity createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        AuthenticationResponse authenticationResponse = userService.createJwtForAuthenticatedUser(authenticationRequest);
        return ResponseEntity.ok(authenticationResponse);
    }
}

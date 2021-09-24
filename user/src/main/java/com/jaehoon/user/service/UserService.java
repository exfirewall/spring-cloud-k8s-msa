package com.jaehoon.user.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUser(Long id){
        String user = "test" + id;
        return user;
    }
}

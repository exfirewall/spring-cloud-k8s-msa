package com.jaehoon.order.repository;

import com.jaehoon.order.model.value.UserResponse;
import org.springframework.stereotype.Repository;

import java.net.URI;

@Repository
public class UserRepository extends ApiRepository{
    private String url;

    public void setUrl(String url){this.url = url;}
    public String getUrl(){return this.url;}

    public UserResponse getOrdererInfo(URI uri, Class<UserResponse> responseType){
        UserResponse userResponse = this.get(uri, responseType);
        return userResponse;
    }

package com.jaehoon.order.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public abstract class ApiRepository {
    @Autowired
    protected RestTemplate restTemplate;

    public <T> T get(URI uri, Class<T> responseType) {return restTemplate.getForObject(uri, responseType);}
}

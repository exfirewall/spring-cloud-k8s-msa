package com.jaehoon.order.repository;

import com.jaehoon.order.model.value.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.net.URI;

@Slf4j
@Repository
public class UserRepository extends ApiRepository {
    @Value("http://localhost:1234/users")
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public UserResponse getOrdererInfo(URI uri, Class<UserResponse> responseType) {
        UserResponse userResponse = this.get(uri, responseType);
        log.debug("userResponse check : " + userResponse.getUser());
        return userResponse;
    }
}

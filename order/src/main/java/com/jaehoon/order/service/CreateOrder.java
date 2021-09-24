package com.jaehoon.order.service;

import com.jaehoon.order.model.value.UserDto;
import com.jaehoon.order.model.value.UserResponse;
import com.jaehoon.order.repository.UserRepository;
import com.jaehoon.order.utils.OrderUtils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.Objects;

@Service
public class CreateOrder implements OrderSerivce{
    private UserRepository userRepository;

    public CreateOrder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    URI uri = OrderUtils.getUri(userRepository.getUrl());
    UserResponse userResponse = userRepository.getOrdererInfo(uri, UserResponse.class);
    UserDto userDto = new UserDto();

}

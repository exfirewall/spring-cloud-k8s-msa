package com.jaehoon.order.service;

import com.jaehoon.order.model.domain.Order;
import com.jaehoon.order.model.value.UserDto;
import com.jaehoon.order.model.value.UserResponse;
import com.jaehoon.order.repository.UserRepository;
import com.jaehoon.order.utils.OrderUtils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.Objects;
import java.util.Random;

@Service
public class CreateOrder implements OrderSerivce{
    private UserRepository userRepository;

    public CreateOrder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Order loadDomain() {

        Order order = new Order();

        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        order.setOrdNo(String.valueOf(random.nextInt()));

        // 주문자 세팅
        int ordMemNo = 1234;
        URI uri = OrderUtils.getUri(userRepository.getUrl() + "/" + ordMemNo);
        UserResponse userResponse = userRepository.getOrdererInfo(uri, UserResponse.class);
        order.setOrdNm(userResponse.getUser());

        // 상품 세팅


        // 주문 리턴

        return order;
    }
}

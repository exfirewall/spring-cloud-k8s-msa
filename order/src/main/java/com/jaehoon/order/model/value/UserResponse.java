package com.jaehoon.order.model.value;

import com.jaehoon.order.model.ApiBasicResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse extends ApiBasicResponse {
    private String user;
}

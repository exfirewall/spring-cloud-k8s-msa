package com.jaehoon.user.controller;

import com.jaehoon.user.controller.type.ApiResponse;
import com.jaehoon.user.model.type.StatusCode;
import com.jaehoon.user.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users/", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    public ApiResponse<String> getUser(@PathVariable Long id) throws Exception {
        String user = userService.getUser(id);
        ApiResponse<String> response = new ApiResponse<>(StatusCode.OK);
        response.setResult(user);
        return response;
    }
}

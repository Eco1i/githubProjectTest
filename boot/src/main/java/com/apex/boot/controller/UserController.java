package com.apex.boot.controller;

import com.apex.boot.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ecoli
 * @date 23/2/19 0:43
 */
@RestController
@RequestMapping("/actor")
public class UserController {

    @GetMapping("/getUser")
    public String getUserInfo() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        User user = new User("Ecoli",22);
        return mapper.writeValueAsString(user);

    }

}

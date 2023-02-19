package com.ecoli.service.impl;

import com.ecoli.pojo.User;
import com.ecoli.service.TestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ecoli
 * @date 23/2/19 10:20
 */
@Service("TestService")
public class TestServiceImpl implements TestService {
    @Override
    public String getInfoById(Integer id) {
        User user = new User("001", "ecoli", 23);
        ObjectMapper mapper = new ObjectMapper();

        String info = null;
        try {
            info = mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return info;
    }
}

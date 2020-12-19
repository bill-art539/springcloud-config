package com.bill.service.impl;

import com.bill.mapper.LoginMapper;
import com.bill.pojo.User;
import com.bill.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginserviceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;


    @Override
    public User login(String username) {
        User user= loginMapper.login(username);
        return user;
    }
}

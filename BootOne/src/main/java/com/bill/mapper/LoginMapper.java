package com.bill.mapper;

import com.bill.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {
    User login(String username);
}

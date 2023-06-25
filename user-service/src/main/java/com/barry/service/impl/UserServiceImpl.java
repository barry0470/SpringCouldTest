package com.barry.service.impl;

import com.barry.entity.User;
import com.barry.mapper.UserMapper;
import com.barry.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author barry
 * @version 1.0
 * @date 2023/6/25 16:57
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper mapper;

    @Override
    public User getUserById(int uid) {
        return mapper.getUserById(uid);
    }
}

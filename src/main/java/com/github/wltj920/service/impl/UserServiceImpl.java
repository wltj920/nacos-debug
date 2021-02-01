package com.github.wltj920.service.impl;

import com.github.wltj920.domain.User;
import com.github.wltj920.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final User ZK = User.builder().id("1").name("ZK").build();

    @Override
    public User getStaticUser() {
        return ZK;
    }
}

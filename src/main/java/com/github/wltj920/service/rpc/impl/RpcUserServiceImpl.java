package com.github.wltj920.service.rpc.impl;

import com.github.wltj920.domain.User;
import com.github.wltj920.service.UserService;
import com.github.wltj920.service.rpc.RpcUserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * RPC用户服务的实现类
 *
 * @author ZhuKun
 * @since 2021-01-28
 */
@DubboService(version = "1.0.0")
public class RpcUserServiceImpl implements RpcUserService {

    @Autowired
    private UserService userService;

    @Override
    public User getUser() {
        return userService.getStaticUser();
    }
}

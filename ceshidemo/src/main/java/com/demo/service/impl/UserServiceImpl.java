package com.demo.service.impl;

import io.jboot.aop.annotation.Bean;
import com.demo.service.UserService;
import com.demo.model.User;
import io.jboot.service.JbootServiceBase;

/**
 * @author yh128
 * @className UserServiceImpl
 * @description 用户服务实现类
 * @createTime 2019/6/11 15:41
 */
@Bean
public class UserServiceImpl extends JbootServiceBase<User> implements UserService {

}
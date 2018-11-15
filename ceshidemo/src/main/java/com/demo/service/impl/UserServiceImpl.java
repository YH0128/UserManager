package com.demo.service.impl;

import io.jboot.aop.annotation.Bean;
import com.demo.service.UserService;
import com.demo.model.User;
import io.jboot.service.JbootServiceBase;

import javax.inject.Singleton;

@Bean
@Singleton
public class UserServiceImpl extends JbootServiceBase<User> implements UserService {

}
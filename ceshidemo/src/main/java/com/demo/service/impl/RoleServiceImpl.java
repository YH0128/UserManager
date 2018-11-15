package com.demo.service.impl;

import io.jboot.aop.annotation.Bean;
import com.demo.service.RoleService;
import com.demo.model.Role;
import io.jboot.service.JbootServiceBase;

import javax.inject.Singleton;

@Bean
@Singleton
public class RoleServiceImpl extends JbootServiceBase<Role> implements RoleService {

}
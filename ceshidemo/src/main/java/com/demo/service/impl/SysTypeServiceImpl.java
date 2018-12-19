package com.demo.service.impl;

import io.jboot.aop.annotation.Bean;
import com.demo.service.SysTypeService;
import com.demo.model.SysType;
import io.jboot.service.JbootServiceBase;

import javax.inject.Singleton;

@Bean
@Singleton
public class SysTypeServiceImpl extends JbootServiceBase<SysType> implements SysTypeService {

}
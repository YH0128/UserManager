package com.demo.service.impl;

import io.jboot.aop.annotation.Bean;
import com.demo.service.FilesService;
import com.demo.model.Files;
import io.jboot.service.JbootServiceBase;

import javax.inject.Singleton;

@Bean
@Singleton
public class FilesServiceImpl extends JbootServiceBase<Files> implements FilesService {

}
package com.demo.service.impl;

import io.jboot.aop.annotation.Bean;
import com.demo.service.FilesService;
import com.demo.model.Files;
import io.jboot.service.JbootServiceBase;

/**
 * @author yh128
 * @className FilesServiceImpl
 * @description 文件服务实现类
 * @createTime 2019/6/11 15:40
 */
@Bean
public class FilesServiceImpl extends JbootServiceBase<Files> implements FilesService {

}
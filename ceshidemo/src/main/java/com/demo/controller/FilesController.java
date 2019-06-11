package com.demo.controller;

import com.demo.service.FilesService;
import com.demo.service.UserService;
import com.jfinal.aop.Inject;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

/**
 * @author yh128
 * @className FilesController
 * @description 文件服务控制类
 * @createTime 2019/6/11 15:44
 */
@RequestMapping("/file")
public class FilesController extends JbootController {
    @Inject
    private FilesService filesService;

    @Inject
    private UserService userService;


}

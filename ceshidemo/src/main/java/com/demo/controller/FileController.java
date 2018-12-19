package com.demo.controller;/*
 *@CLASSNAME : FileController
 *@Author : yh0128
 *@CreateTime : 20181211
 *@Description :
 */

import com.demo.service.FilesService;
import com.demo.service.UserService;
import io.jboot.core.rpc.annotation.JbootrpcService;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

@RequestMapping("/file")
public class FileController extends JbootController {
    @JbootrpcService
    private FilesService filesService;

    @JbootrpcService
    private UserService userService;


}

package com.demo.controller;/*
 *@CLASSNAME : UserController
 *@Author :
 *@CreateTime :
 *@Description :
 */

import com.demo.model.User;
import com.demo.service.UserService;
import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Page;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/user")
public class UserController extends JbootController {
    @Inject
    private UserService userService;

    public void index() {
        int page = getParaToInt("page", 1);
        Page userPage = userService.paginate(page, 10);
        setAttr("pageData", userPage);
        render("/user.html");
    }

    public void list(){
        System.out.println("列表查询开始");
        List<User> userList = userService.findAll();
        System.out.println("列表查询结束");
        renderText(Arrays.toString(userList.toArray()));
    }

}

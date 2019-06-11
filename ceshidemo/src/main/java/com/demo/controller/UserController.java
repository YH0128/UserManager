package com.demo.controller;

import com.demo.help.ModelHelp;
import com.demo.model.User;
import com.demo.service.UserService;
import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Page;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author yh128
 * @className UserController
 * @description 用户控制类
 * @createTime 2019/6/11 15:28
 */
@RequestMapping("/user")
public class UserController extends JbootController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);



    @Inject
    private UserService userService;


    /**
     * 登录查看精准数据页面
     */
    public void login() {
        logger.debug("登录界面访问");
        int page = getParaToInt("page", 1);
        Page userPage = userService.paginate(page, 10);
        setAttr("pageData", userPage);

        render("/file/html/user.html");
    }

    /**
     * 默认进来的主界面
     */
    public void index() {

        render("/file/main.html");
    }

    public void register() {
        render("/file/html/register.html");
    }

    public void registerByAddUser() {
        logger.info("用户注册开始");

        HttpServletRequest request = getRequest();
        Map<String, String[]> map = request.getParameterMap();
        request.getParameterMap();

        User user = getBean(User.class, "user");
        user = (User) ModelHelp.copyToModelByMap(user, map);
        System.out.println(user.toString());

        Object save = userService.save(user);

        if (save != null) {
            logger.info("用户注册成功:>{}", user.toString());
            //注册成功返回主页并且已登录状态
            render("/file/html/main.html");
        } else {
            logger.info("用户注册失败:>{}", user.toString());
            renderText("新增失败");
        }
    }

    public void ceshi() {
        render("/file/html/upload.html");
    }

    public void list() {
        System.out.println("列表查询开始");
        List<User> userList = userService.findAll();
        System.out.println("列表查询结束");
        renderText(Arrays.toString(userList.toArray()));
    }

}

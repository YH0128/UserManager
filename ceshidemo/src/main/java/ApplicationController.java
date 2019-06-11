import com.demo.model.User;
import com.demo.service.UserService;
import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import io.jboot.Jboot;

import io.jboot.app.JbootApplication;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @author yh128
 * @className ApplicationController
 * @description 启动类
 * @createTime 2019/6/11 15:43
 */
@RequestMapping("/")
public class ApplicationController extends JbootController {
    public void index() {
        renderText("欢迎来到鲁甸乡社区[Welcome to Ludian Township Community]");
    }
    public static void main(String[] args) {
        JbootApplication.run(args);
    }
}
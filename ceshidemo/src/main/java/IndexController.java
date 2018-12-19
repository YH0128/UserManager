import com.demo.model.User;
import com.demo.service.UserService;
import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import io.jboot.Jboot;
import io.jboot.core.rpc.annotation.JbootrpcService;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/demo")
public class IndexController extends JbootController {

    @JbootrpcService
    UserService userService;


    public void index() {
        renderText("开发的开发就是开发呀");
    }

    public void dbtest(){
        List<Record> records = Db.find("select * from user");
        renderJson(records);
    }


    public void dbtest1(){
         Record user =  Db.findById("user",1);
        renderText(user.toString());
    }

    public void dtest(){
        List<User> records =userService.findAll();
        renderText(Arrays.toString(records.toArray()));
    }


    public static void main(String[] args) {
        Jboot.run(args);
    }
}
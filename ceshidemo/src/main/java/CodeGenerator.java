import com.jfinal.kit.PathKit;
import io.jboot.codegen.model.JbootBaseModelGenerator;
import io.jboot.codegen.model.JbootModelGenerator;
import io.jboot.codegen.service.JbootServiceImplGenerator;
import io.jboot.codegen.service.JbootServiceInterfaceGenerator;

/**
 * @author yanghui
 * @className CodeGenerator
 * @description Jboot正向工程代码生成器
 * @createTime 2019/6/11 15:42
 */
public class CodeGenerator {

    /**
     * 如果项目中已经有jboot.properties的数据源设置，下面两行可以注释掉，generator会自动调用配置文件中的设置
     * JbootApplication.setBootArg("jboot.datasource.url", "jdbc:mysql://localhost:3306/jboot?characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&autoReconnect=true");
     * JbootApplication.setBootArg("jboot.datasource.user", "root");
     */
    public static void main(String[] args) {


        //设置model的包名
        String modelPackage = "com.demo.model";
        String baseModelPackage = modelPackage + ".base";

        //生成代码保存的路径
        String modelDir = PathKit.getWebRootPath() + "/src/main/java/" + modelPackage.replace(".", "/");
        String baseModelDir = PathKit.getWebRootPath() + "/src/main/java/" + baseModelPackage.replace(".", "/");

        System.out.println("start generate...");
        System.out.println("generate dir:" + modelDir);

        //生成Model和BaseModel
        new JbootBaseModelGenerator(baseModelPackage, baseModelDir).generate();
        new JbootModelGenerator(modelPackage, baseModelPackage, modelDir).generate();

        //设置service层的包名
        String servicePackage = "com.demo.service";
        //生成service接口和实现类，实现类以provider命名，可以改为你需要的名称。
        new JbootServiceInterfaceGenerator(servicePackage, modelPackage).generate();
        new JbootServiceImplGenerator(servicePackage, modelPackage).setImplName("impl").generate();
        System.out.println("Task complete.");
    }
}
import io.jboot.codegen.model.JbootModelGenerator;
import io.jboot.codegen.service.JbootServiceGenerator;

public class CodeGenerator {

    public static void main(String args[]){
        //依赖model的包名
        String modelPackage = "com.demo.model";
        //生成service 的包名
        String basePackage = "com.demo.service";

        JbootModelGenerator.run(modelPackage);
        JbootServiceGenerator.run(basePackage, modelPackage);

    }
}
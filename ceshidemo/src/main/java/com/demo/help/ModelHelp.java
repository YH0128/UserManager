package com.demo.help;


import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Date;
import java.util.*;

/**
 * @author yh128
 * @className ModelHelp
 * @description 实体类帮助工具
 * @createTime 2019/6/11 15:27
 */
public class ModelHelp {
    public static Object copyToModelByMap(Object object, Map<String, String[]> map) {
        try {
            Field[] fields = object.getClass().getDeclaredFields();
            for (Field d : fields) {
                //设置可以访问私有参数
                d.setAccessible(true);
                //如果返回的数据是空的就继续下面字段的判断赋值
                Object typeObject = d.getType();
                if (map.get(d.getName()) == null) {
                    continue;
                }
                String[] valueName = map.get(d.getName());
                String className = ((Class) typeObject).getName();
                String valueNameString = valueName[0];
                if (className.contains("java.lang.String")) {
                    //除了String类型之外都去除空格
                    d.set(object, valueNameString);
                }
                //基本数据类型和封装数据类型
                else if (className.contains("java.lang.Long") || className.contains("long")) {
                    d.set(object, Long.valueOf(valueNameString));
                } else if (className.contains("java.lang.Integer") || className.contains("int")) {
                    d.set(object, Integer.valueOf(valueNameString));
                } else if (className.contains("java.lang.Boolean") || className.contains("boolean")) {
                    d.set(object, Boolean.valueOf(valueNameString));
                } else if (className.contains("java.lang.Short") || className.contains("short")) {
                    d.set(object, Short.valueOf(valueNameString));
                } else if (className.contains("java.lang.Double") || className.contains("double")) {
                    d.set(object, Double.valueOf(valueNameString));
                } else if (className.contains("java.lang.Float") || className.contains("float")) {
                    d.set(object, Float.valueOf(valueNameString));
                } else if (className.contains("java.lang.Character") || className.contains("char")) {
                    //字符类型获取第一个字符
                    char[] characters = valueNameString.trim().toCharArray();
                    if (characters.length > 0) {
                        d.set(object, characters[0]);
                    }
                } else if (className.contains("java.lang.Byte") || className.contains("byte")) {
                    //字节类型获取第一个字节
                    byte[] bytes = valueNameString.getBytes();
                    if (bytes.length > 0) {
                        d.set(object, bytes[0]);
                    }
                }
                //日期类型和常用集合
                else if (className.contains("java.util.Date")) {
                    d.set(object, Date.valueOf(valueNameString));
                } else if (className.contains("java.util.List")) {
                    Type type = d.getGenericType();
                    if (type instanceof ParameterizedType) {
                        ParameterizedType pt = (ParameterizedType) type;
                        //得到泛型里的class类型对象
                        Class<?> genericClazz = (Class<?>) pt.getActualTypeArguments()[0];

                    }
                    d.set(object, valueName);
                } else if (className.contains("java.util.Map")) {
                    d.set(object, valueName);
                } else if (className.contains("java.util.Set")) {
                    d.set(object, valueName);
                } else if (className.contains("java.util.Queue")) {
                    d.set(object, valueName);
                }
                //未知类型
                else {
                    d.set(object, valueNameString);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        System.out.println(a);
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            if ("2".equals(temp)) {
                it.remove();
            }
        }
        System.out.println(a);
    }

}

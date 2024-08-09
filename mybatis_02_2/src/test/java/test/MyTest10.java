package test;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//通过反射获取泛型
public class MyTest10 {
    public  int fun1(Map<String,String> map, List<String> list){
        System.out.println("输出fun1");
        return 1;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method =  MyTest10.class.getMethod("fun1", Map.class, List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType);
        }
        Type genericReturnType = method.getGenericReturnType();
        System.out.println(genericReturnType);
    }

}

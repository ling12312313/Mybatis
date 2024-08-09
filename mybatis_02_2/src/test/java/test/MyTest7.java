package test;

import com.sun.xml.internal.ws.api.model.MEP;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class class1 = Class.forName("com.ling.pojo.User");
        //获取类名
        System.out.println(class1.getName());
        System.out.println(class1.getSimpleName());
        //获取类的属性
        System.out.println("=============================");
        Field[] fields = class1.getFields();//所有公共属性
        Field[] declaredFields = class1.getDeclaredFields();//所有属性
        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }
        System.out.println("====================================");
        //获取所有方法
        Method[] methods = class1.getMethods();//包括父类的
        Method[] declaredMethods = class1.getDeclaredMethods();//不包括父类的
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
        Method method = class1.getDeclaredMethod("getId");
        System.out.println(method);
        System.out.println("================");
        //获取构造器
        Constructor[] constructors = class1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        constructors = class1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}

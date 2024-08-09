package test;

import com.ling.pojo.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyTest8 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取类对象
        Class class1 = Class.forName("com.ling.pojo.User");
        //通过类对象生成对象
        User o = (User) class1.getDeclaredConstructor(String.class,String.class,String.class).newInstance("sad","ad","da");
        System.out.println(o);
        //反射方法
        //反射获得类方法 ，类对象本身还是一个对象，通过对象而获得类的属性与方法叫做反射
        Method method = class1.getDeclaredMethod("setName", String.class);
        //回调
        method.invoke(o,"zhangSan");
        System.out.println(o);

        //反射属性
        Field field = class1.getDeclaredField("name");
        //私有属性无法直接通过set赋值，使用setAccessible取消权限检测，同样的若方法为private，也要使用setAccessible
        field.setAccessible(true);
        field.set(o,"lisi");
        System.out.println(o);
    }
}

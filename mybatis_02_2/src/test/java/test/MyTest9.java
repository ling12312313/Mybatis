package test;

import com.ling.pojo.User;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyTest9 {
    //普通方法，反射回调，关闭权限检测的反射回调，三者执行速度对比

    public void test1(){
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long  endTime  = System.currentTimeMillis();
        System.out.println("普通方法执行所用时间："+(endTime-startTime)+"ms");
    }
    public void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c = user.getClass();
        Method method = c.getDeclaredMethod("getName");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            method.invoke(user);
        }
        long  endTime  = System.currentTimeMillis();
        System.out.println("反射方法执行所用时间："+(endTime-startTime)+"ms");
    }
    public void test3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c = user.getClass();
        Method method = c.getDeclaredMethod("getName");
        method.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            method.invoke(user);
        }
        long  endTime  = System.currentTimeMillis();
        System.out.println("关闭权限检测反射方法执行所用时间："+(endTime-startTime)+"ms");
    }
    @Test
    public void test() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        test1();
        test2();
        test3();
    }

}

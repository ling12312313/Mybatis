package test;

import com.ling.pojo.User;

import java.nio.file.attribute.UserPrincipal;

public class MyTest3 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过class类的forName静态方法获取
      Class c =   Class.forName("com.ling.pojo.User");
        Class c2 =   Class.forName("com.ling.pojo.User");
        System.out.println(c.hashCode());
        System.out.println(c2.hashCode());
        //一个类在内存中只有一个Class对象
        User user = new User();
        //由对象的getClass获取
        Class cc = user.getClass();
        System.out.println(cc);
        //通过类的class属性获取
        Class cc2 = User.class;
        System.out.println(cc2);
        //获得当前类的父类
        Class cc3 = cc2.getSuperclass();
        System.out.println(cc3);
    }
}

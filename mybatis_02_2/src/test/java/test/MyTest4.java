package test;

import com.ling.pojo.User;

public class MyTest4 {
    public static void main(String[] args) {
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = Class.class;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        //一个类只有一个类对象
        User user1 = new User();
        User user2 = new User();
        System.out.println(user1.getClass().hashCode()+"_"+user2.getClass().hashCode());

    }
}

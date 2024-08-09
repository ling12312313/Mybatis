package test;

public class MyTest6 {
    public static void main(String[] args) throws ClassNotFoundException {
        //系统加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //拓展加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //根加载器 使用c++编写，无法获取
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        ClassLoader classLoader = Class.forName("com.ling.pojo.User").getClassLoader();
        System.out.println(classLoader);
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);
    }
}

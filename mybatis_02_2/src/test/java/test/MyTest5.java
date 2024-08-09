package test;

import java.util.Stack;

public class MyTest5 {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) {
        //Son son = new Son();
       // System.out.println(Son.M);
        Son[] sons = new Son[4];

    }
}
class Father{
    static int M;
    static {
        System.out.println("父类被加载");
        M = 1;
    }

}
class Son extends Father{
    static {
        System.out.println("子类被加载");
    }
}
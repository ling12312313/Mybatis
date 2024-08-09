package test;

import java.lang.annotation.*;

public class MyTest2 {
    @Annotation(name ="lisi")
    public void fun(){

    }
}
//targer：作用范围
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface Annotation{
  String name() default "zhangSan";
  int id() default 0;
  String gender() default "Male";
}
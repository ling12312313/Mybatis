package com.ling.test;

import com.ling.dao.StudentMapper;
import com.ling.pojo.Student;
import com.ling.utils.MybatisUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MyTest {
    @Test
    public void selectStudent() {
        SqlSession session = MybatisUtil.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> student = mapper.selectStudent();

       for(Student student1 : student ){
           System.out.println(student1.getName());
       }
        session.close();
    }
    @Test
    public void getStudent(){
        SqlSession session = MybatisUtil.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = studentMapper.getStudent(3);
        System.out.println(student);
        session.close();
    }
    @Test
    public void addStudent(){
        SqlSession session = MybatisUtil.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",24);
        map.put("name","zhaoLiu");
        map.put("gender","FeMale");
        System.out.println(studentMapper.addStudent(map));
        session.commit();
        session.close();
    }
    @Test
    public void updateStudent(){
        SqlSession session = MybatisUtil.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        System.out.println(studentMapper.updateStudent(new Student(22,"wangWu","Female")));
        //提交事务
         session.commit();
         session.close();
    }
    @Test
    public void deleteStudent(){
        SqlSession session = MybatisUtil.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        System.out.println(studentMapper.deleteStudent(24));
        session.commit();
        session.close();
    }
}

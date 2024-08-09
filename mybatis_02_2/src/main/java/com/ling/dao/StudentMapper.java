package com.ling.dao;

import com.ling.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
//    查询所有学生
    List<Student> selectStudent();
    //根据id查询学生
    Student getStudent(int id);
    //添加一个用户
    boolean addStudent(Map<String, Object> map);
    boolean updateStudent(Student student);
    boolean deleteStudent(int id);
    List<Student> getStudentByLimit(Map<String,Object> map);
}

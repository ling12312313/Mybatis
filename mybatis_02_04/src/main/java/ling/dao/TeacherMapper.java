package ling.dao;

import ling.pojo.Student;
import ling.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
  public Student[] getTeacher(int id);
//根据老师id查出老师信息和老师下的学生 一对多
  Teacher getTeacher2(@Param("tid") int id);
}

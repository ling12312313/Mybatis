package ling.dao;

import ling.pojo.Student;

import java.util.Map;

public interface StudentMapper {
     Student getStudentById(int id);
     boolean upDateStudent(Map map);
}

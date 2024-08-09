package test;

import com.ling.dao.StudentMapper;
import com.ling.pojo.Student;
import com.ling.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        logger.info("查询成功");
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
        System.out.println(studentMapper.deleteStudent(22));
        session.commit();
        session.close();
    }
    @Test
    public void getStudentByLimit(){
    SqlSession session = MybatisUtil.getSession();
    StudentMapper mapper = session.getMapper(StudentMapper.class);
    Map<String,Object> map = new HashMap<>();
    map.put("startIndex",5);
    map.put("pageSize",5);
        List<Student> list = mapper.getStudentByLimit(map);
        for(Student student:list){
        System.out.println(student);
    }

    session.close();
    }
static  Logger logger = Logger.getLogger(MyTest.class);
    @Test
    public void TestLog(){
       logger.info("info:into TestLog");
       logger.debug("debug:into TestLog");
       logger.error("error:into TestLog");
    }

}

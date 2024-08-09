package ling;

import ling.dao.StudentMapper;
import ling.dao.TeacherMapper;
import ling.pojo.Student;
import ling.pojo.Teacher;
import ling.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest1 {
    @Test
    public void getTeacher(){
        SqlSession session = MybatisUtil.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2);
        session.close();
    }

}

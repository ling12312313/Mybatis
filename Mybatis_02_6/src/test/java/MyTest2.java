import ling.dao.StudentMapper;
import ling.pojo.Student;
import ling.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest2 {
    @Test


    public void getStudentById(){
        SqlSession session = MybatisUtil.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        Student studentById = mapper.getStudentById(1);
        System.out.println(studentById);
        session.close();
//        一级缓存关闭后或提交后，开启二级缓存，并将sqlsession中的引用添加到二级缓存中
        SqlSession session1 = MybatisUtil.getSession();
        StudentMapper mapper1 = session1.getMapper(StudentMapper.class);
        Student studentById1 = mapper1.getStudentById(1);
        System.out.println(studentById1);

    }

}

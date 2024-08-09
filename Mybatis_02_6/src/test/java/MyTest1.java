import ling.dao.StudentMapper;
import ling.pojo.Student;
import ling.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MyTest1 {
    @Test
    public void getStudentById(){
        SqlSession session = MybatisUtil.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //查询
        Student studentById = mapper.getStudentById(1);
        System.out.println(studentById);
        //更新
        Map map = new HashMap();
        map.put("id",1);
        map.put("name","zhangsan");
        boolean b = mapper.upDateStudent(map);
        //再次查询
        Student studentById1 = mapper.getStudentById(1);
        System.out.println(studentById1);
        //结论 select会有缓存以便再次查询
        // 其他操作后均会刷新缓存
        //一级缓存作用域与生命周期与sqlsession相同 二级缓存 是与一个mapper相同
    }
}

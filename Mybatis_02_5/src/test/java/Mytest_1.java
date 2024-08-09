import ling.dao.BlogMapper;
import ling.pojo.Blog;
import ling.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import ling.utils.IDUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Mytest_1 {
    @Test
    public void addInitBlog(){
        SqlSession session = MybatisUtil.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtil.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);
        session.commit();
        session.close();
    }
    @Test
    public void selectBlogs(){
        SqlSession session = MybatisUtil.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map map  = new HashMap();
        map.put("title","Mybatis如此简单2");
        map.put("id","b02dbe6d375e4d66a77d86f662b8a37d");
        mapper.upDateBlog(map);
        session.close();
    }
    @Test
    public  void queryBlog(){
     SqlSession session = MybatisUtil.getSession();
     BlogMapper mapper = session.getMapper(BlogMapper.class);
     Map map = new HashMap();
     ArrayList<Integer> list = new ArrayList<>();
     list.add(1);
     list.add(2);
     map.put("ids",list);
        Blog[] blogs = mapper.queryBlog(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }
}

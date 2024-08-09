package ling.dao;

import ling.pojo.Blog;

import java.util.Map;

public interface BlogMapper {
    boolean addBlog(Blog blog);
    Blog[] selectBlogs(Map map);
    boolean upDateBlog(Map map);
    Blog[] queryBlog(Map map);
}

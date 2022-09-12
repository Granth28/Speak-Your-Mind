package com.dcodestar.Blogging.backend.services;

import com.dcodestar.Blogging.backend.models.Blog;

import java.util.List;

public interface BlogService {

    public String save(Blog blog);

    public String delete(Integer id);

    public String getSingleBlog(Integer id);

    public String update(Blog blog);

}

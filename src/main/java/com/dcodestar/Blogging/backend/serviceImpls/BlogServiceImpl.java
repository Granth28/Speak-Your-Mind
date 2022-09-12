package com.dcodestar.Blogging.backend.serviceImpls;

import com.dcodestar.Blogging.backend.models.Blog;
import com.dcodestar.Blogging.backend.repositories.BlogRepository;
import com.dcodestar.Blogging.backend.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public String save(Blog blog) {
        blogRepository.save(blog);
        return "success";
    }

    public String update(Blog blog) {
        Blog savedBlog = blogRepository.findById(blog.getId()).orElseThrow();

        if(blog.getBody() != null) {
            savedBlog.setBody(blog.getBody());
        }

        blogRepository.save(savedBlog);
        return "success";


    }

    @Override
    public String delete(Integer id) {
        blogRepository.deleteById(id);
        return "success";
    }

    @Override
    public  String getSingleBlog(Integer id) {
        Blog blog = blogRepository.findById(id).orElse(null);
        if(blog!=null){
            return blog.getBody();
        }
        else{
            return "";
        }

    }
}

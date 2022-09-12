package com.dcodestar.Blogging.backend.controllers;

import com.dcodestar.Blogging.backend.models.Blog;
import com.dcodestar.Blogging.backend.repositories.BlogRepository;
import com.dcodestar.Blogging.backend.services.BlogService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogController {

    @Autowired
    BlogService blogService;

    @PostMapping("/blog")
    public String saveBlog(@RequestBody Blog blogObject) {
        return blogService.save(blogObject);
    }

    @GetMapping("/blogid")
    public String getBlog(@RequestParam Integer blogid){
        return blogService.getSingleBlog(blogid);
    }

    @DeleteMapping("/blogid")
    public String deleteBlog(@RequestParam Integer blogid){
        return blogService.delete(blogid);
    }

    @PutMapping("blog")
    public  String updateBlog(@RequestBody Blog blogObject){
        return blogService.update(blogObject);
    }
}

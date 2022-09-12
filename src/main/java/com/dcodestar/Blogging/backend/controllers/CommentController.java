package com.dcodestar.Blogging.backend.controllers;


import com.dcodestar.Blogging.backend.models.Comment;
import com.dcodestar.Blogging.backend.models.CommentResponse;
import com.dcodestar.Blogging.backend.repositories.CommentRepository;
import com.dcodestar.Blogging.backend.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {



    @Autowired
    CommentService commentService;

    @PostMapping("/comment")
    public String saveComment(@RequestBody Comment commentObject){
       return commentService.save(commentObject);

    }

    @GetMapping("/comment/{id}")
    public CommentResponse getComment(@PathVariable("id") Integer commentId) {
        return commentService.getCommentResponse(commentId);
    }
    @GetMapping("/comment_id")
    public  String getSingleComment(@RequestParam Integer comment_id){
        return commentService.getSingleComment(comment_id);
    }

    @DeleteMapping("/comment_id")
    public String deleteComment(@RequestParam Integer comment_id){
        return commentService.delete(comment_id);
    }
}

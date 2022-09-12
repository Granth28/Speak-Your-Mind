package com.dcodestar.Blogging.backend.services;

import com.dcodestar.Blogging.backend.models.Comment;
import com.dcodestar.Blogging.backend.models.CommentResponse;

import java.util.List;

public interface CommentService {

    String save(Comment comment);
    String delete(Integer id);
    String  getSingleComment(Integer id);

    CommentResponse getCommentResponse(Integer comment);
}

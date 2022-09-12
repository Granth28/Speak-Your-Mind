package com.dcodestar.Blogging.backend.models;

import lombok.Data;

import java.util.List;

@Data
public class CommentResponse {
    Comment comment;
    List<Reply> replyList;
}

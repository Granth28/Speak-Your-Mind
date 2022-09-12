package com.dcodestar.Blogging.backend.serviceImpls;

import com.dcodestar.Blogging.backend.models.Blog;
import com.dcodestar.Blogging.backend.models.Comment;
import com.dcodestar.Blogging.backend.models.CommentResponse;
import com.dcodestar.Blogging.backend.repositories.CommentRepository;
import com.dcodestar.Blogging.backend.repositories.ReplyRepository;
import com.dcodestar.Blogging.backend.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommentServiceImpl  implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    ReplyRepository replyRepository;


    @Override
    public String save(Comment comment) {
        commentRepository.save(comment);
        return "success";
    }

    @Override
    public String delete(Integer id) {
        commentRepository.deleteById(id);
        return "success";
    }

    @Override
    public String getSingleComment(Integer id) {

        Comment comment = commentRepository.findById(id).orElse(null);
        if(comment!=null){
            return comment.getCom_body();
        }
        else{
            return "";
        }
    }

    @Override
    public CommentResponse getCommentResponse(Integer comment) {
        CommentResponse commentResponse = new CommentResponse();

        commentResponse.setComment(commentRepository.findById(comment).orElse(null));

        commentResponse.setReplyList(replyRepository.findAllByCommentId(comment));
        return commentResponse;
    }
}

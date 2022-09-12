package com.dcodestar.Blogging.backend.repositories;

import com.dcodestar.Blogging.backend.models.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply,Integer> {

    List<Reply> findAllByCommentId(Integer comment);

    @Query("SELECT * from Reply WHERE commentId = :comment")
    List<Reply> findRepliesByCommentId(Integer comment);
}

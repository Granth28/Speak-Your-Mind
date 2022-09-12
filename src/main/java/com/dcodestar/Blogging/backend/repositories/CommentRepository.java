package com.dcodestar.Blogging.backend.repositories;

import com.dcodestar.Blogging.backend.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comment,Integer> {

}

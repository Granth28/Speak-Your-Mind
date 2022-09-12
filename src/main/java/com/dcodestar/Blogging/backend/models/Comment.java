package com.dcodestar.Blogging.backend.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "comment")
@Data
public class Comment {
   @Id
   @GeneratedValue
   @Column(name = "comment_id")
    Integer comment_id;
   @Column(name="blog_id")
    Integer blog_id;
   @Column(name="com_body")
    String com_body;
   @Column(name="day")
    Date day;
   @Column(name = "user_id")
    Integer user_id;
}

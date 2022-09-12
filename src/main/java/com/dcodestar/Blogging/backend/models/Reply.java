package com.dcodestar.Blogging.backend.models;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="reply")
@Data
public class Reply {
    @Id
    @GeneratedValue
    @Column(name="reply_id")
    Integer replyId;
    @Column(name="comment_id")
    Integer commentId;
    @Column(name="reply_body")
    String replyBody;
    @Column(name="day")
    Date day;
    @Column(name="user_id")
    Integer userId;
}

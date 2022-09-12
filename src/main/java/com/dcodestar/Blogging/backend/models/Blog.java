package com.dcodestar.Blogging.backend.models;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "blog")
@Data
public class Blog{
    @Id
    @GeneratedValue
    @Column(name = "blog_id")
    Integer id;
    @Column(name = "user_id")
    Integer userId;
    @Column(name = "body")
    String body;
    @Column(name = "title")
    String title;
    @Column(name = "date")
    Date date;
}
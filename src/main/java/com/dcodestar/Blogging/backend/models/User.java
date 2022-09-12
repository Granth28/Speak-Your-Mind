package com.dcodestar.Blogging.backend.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="user")
@Data
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    Integer userId;
    @Column(name="email")
    String email;
    @Column(name="password")
    String password;
}

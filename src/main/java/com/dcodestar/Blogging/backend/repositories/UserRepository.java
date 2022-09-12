package com.dcodestar.Blogging.backend.repositories;

import com.dcodestar.Blogging.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}

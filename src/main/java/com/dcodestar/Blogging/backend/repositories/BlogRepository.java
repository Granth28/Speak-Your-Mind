package com.dcodestar.Blogging.backend.repositories;

import com.dcodestar.Blogging.backend.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}

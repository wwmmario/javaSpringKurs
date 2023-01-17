package com.kurss.hotell.repo;

import com.kurss.hotell.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}

package com.kurss.hotell.repo;


import com.kurss.hotell.models.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,String> {
}

package com.kurss.hotell.repo;

import com.kurss.hotell.models.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question,Long> {
}

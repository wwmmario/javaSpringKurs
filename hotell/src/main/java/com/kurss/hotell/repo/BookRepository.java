package com.kurss.hotell.repo;

import com.kurss.hotell.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}

package com.example.booklet.module.repository;

import com.example.booklet.module.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    AuthorRepository findByEmail (String email);

    AuthorRepository findByFirstname (String Name);

//    AuthorRepository deleteAuthor (long id);
}

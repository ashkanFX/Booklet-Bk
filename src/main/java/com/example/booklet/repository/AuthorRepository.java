package com.example.booklet.repository;

import com.example.booklet.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {




    AuthorRepository findByFirstname(String Name);

    boolean existsByEmail(String email);

    Optional<Author> findByEmail(String aLong);
}

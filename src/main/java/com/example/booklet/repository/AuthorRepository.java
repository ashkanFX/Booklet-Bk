package com.example.booklet.repository;

import com.example.booklet.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface AuthorRepository extends JpaRepository<Author, Long> {
    boolean existsByEmail(String email);
   List<Author> findFirst3ByOrderByUpdatedAtDesc();
   List<Author> findFirst3ByOrderByIdDesc();
    Optional<Author> findByEmail(String aLong);
}

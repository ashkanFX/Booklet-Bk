package com.example.booklet.service.impl;

import com.example.booklet.model.Author;
import com.example.booklet.repository.AuthorRepository;
import com.example.booklet.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public Optional<Author> findByEmail(String email) {
        return authorRepository.findByEmail(email);
    }

    public boolean exist(String email) {
        return authorRepository.existsByEmail(email);
    }

    public List<Author> findAllAuthor() {
        return this.authorRepository.findAll();
    }

    public Author registerAuthor(Author author) {
        return this.authorRepository.save(author);
    }

    public void deleteAuthor(long id) {
        this.authorRepository.deleteById(id);
    }

    public Optional<Author> findById(long id) {
        return this.authorRepository.findById(id);
    }
}

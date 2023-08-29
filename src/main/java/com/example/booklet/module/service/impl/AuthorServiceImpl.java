package com.example.booklet.module.service.impl;

import com.example.booklet.module.model.Author;
import com.example.booklet.module.repository.AuthorRepository;
import com.example.booklet.module.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;


    public List<Author> findAllAuthor() {
        return this.authorRepository.findAll();
    }

    public Author registerAuthor(Author author) {
        return this.authorRepository.save(author);
    }

    public void deleteAuthor(long id) {
        this.authorRepository.deleteById(id);
    }
}

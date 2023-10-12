package com.example.booklet.service.impl;

import com.example.booklet.model.Author;
import com.example.booklet.repository.AuthorRepository;
import com.example.booklet.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
     
    public Optional<Author> findByEmail(String email) {return authorRepository.findByEmail(email);}
    public boolean exist(String email){return authorRepository.existsByEmail(email);}
    public List<Author> findAllAuthor() {return this.authorRepository.findAll();}
    public Author registerAuthor(Author author) {
        return this.authorRepository.save(author);
    }

    public void deleteAuthor(long id) {

        this.authorRepository.deleteById(id);
    }

}

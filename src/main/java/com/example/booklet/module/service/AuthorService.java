package com.example.booklet.module.service;

import com.example.booklet.module.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public interface AuthorService {
    List<Author> findAllAuthor();
 }

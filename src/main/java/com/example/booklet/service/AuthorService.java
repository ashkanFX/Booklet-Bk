package com.example.booklet.service;

import com.example.booklet.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public interface AuthorService {
    List<Author> findAllAuthor();
 }

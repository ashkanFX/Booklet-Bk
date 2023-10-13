package com.example.booklet.service.impl;

import com.example.booklet.controller.dto.AuthorRegisterRequestDto;
import com.example.booklet.model.Author;
import com.example.booklet.repository.AuthorRepository;
import com.example.booklet.service.AuthorService;
import com.example.booklet.service.dto.AuthorDto;
import com.example.booklet.util.DtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final DtoMapper mapper;
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

    public AuthorDto registerAuthor(AuthorRegisterRequestDto request) {
        Author savedAuthor = this.authorRepository.save(mapper.author(request));
        return mapper.authorDto(savedAuthor);
    }

    public void deleteAuthor(long id) {
        this.authorRepository.deleteById(id);
    }

    public Optional<Author> findById(long id) {
        return this.authorRepository.findById(id);
    }
}

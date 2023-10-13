package com.example.booklet.util;

import com.example.booklet.controller.dto.AuthorRegisterRequestDto;
import com.example.booklet.model.Author;
import com.example.booklet.service.dto.AuthorDto;
import org.springframework.stereotype.Component;

@Component
public class DtoMapper {
    public Author author(AuthorRegisterRequestDto request) {
        Author author = new Author();
        author.setEmail(request.getEmail());
        author.setFirstname(request.getFirstname());
        author.setLastname(request.getLastname());
        author.setUniversity(request.getUniversity());
        author.setIsAlive(request.getIsAlive());
        return author;
    }

    public AuthorDto authorDto(Author author) {
        return AuthorDto.builder()
                .id(author.getId())
                .isAlive(author.getIsAlive())
                .email(author.getEmail())
                .createdAt(author.getCreatedAt())
                .updatedAt(author.getUpdatedAt())
                .university(author.getUniversity())
                .firstname(author.getFirstname())
                .lastname(author.getLastname())
                .build();
    }
}

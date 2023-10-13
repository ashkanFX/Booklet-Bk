package com.example.booklet.service.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class AuthorDto {

    private long id;
    private String email;
    private String firstname;
    private String university;
    private String lastname;
    private Boolean isAlive;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
}

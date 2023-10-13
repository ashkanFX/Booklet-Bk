package com.example.booklet.controller.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuthorUpdateRegisterDto {
    long id;
    private String email;
    private String firstname;
    private String university;
    private String lastname;
    private Boolean isAlive;

}

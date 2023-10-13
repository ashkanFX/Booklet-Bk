package com.example.booklet.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BookLetException {

    public NotFoundException() {
        super(HttpStatus.NOT_FOUND, 101);
    }
}

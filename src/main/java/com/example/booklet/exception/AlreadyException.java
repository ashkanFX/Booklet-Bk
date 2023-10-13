package com.example.booklet.exception;

import org.springframework.http.HttpStatus;

public class AlreadyException extends BookLetException {

    public AlreadyException() {
        super(HttpStatus.BAD_REQUEST, 101);
    }
}

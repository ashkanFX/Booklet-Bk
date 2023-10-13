package com.example.booklet.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class BookLetException extends RuntimeException {
    private final HttpStatus Status;
    private final Integer code;
}

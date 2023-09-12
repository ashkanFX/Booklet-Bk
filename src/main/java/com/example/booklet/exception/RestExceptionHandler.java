package com.example.booklet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(value = addException.class)
    public ResponseEntity<String> handelError() {
        return new ResponseEntity<String>("Email is exist", HttpStatus.BAD_REQUEST);
    }
}
package com.example.booklet.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(BookLetException.class)
    @ResponseBody
    public ResponseEntity<Integer> handelBookLetException(HttpServletRequest request , BookLetException e){
        return ResponseEntity.status(e.getStatus()).body(e.getCode());
    }
}

package com.example.booklet.controller;

import com.example.booklet.model.Author;
import com.example.booklet.exception.addException;
import com.example.booklet.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/author")
public class AuthorController {
    private AuthorServiceImpl authorService;

    @Autowired
    public AuthorController(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }

    @PostMapping(value = "/register")
    public Author registerAuthor(@RequestBody Author author) {
        if (authorService.exist(author.getEmail())) {
            throw new addException("the user is exist");
        } else {
            return authorService.registerAuthor(author);
        }
    }

    @GetMapping(value = "/getList")
    public List<Author> getAuthor() {
        return authorService.findAllAuthor();
    }

    @DeleteMapping(value = "/delete/{id}")
    public void getAuthor(@PathVariable long id) {
        authorService.deleteAuthor(id);
    }


}

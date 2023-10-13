package com.example.booklet.controller;

import com.example.booklet.controller.dto.AuthorRegisterRequestDto;
import com.example.booklet.exception.addException;
import com.example.booklet.model.Author;
import com.example.booklet.service.dto.AuthorDto;
import com.example.booklet.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/author")
public class AuthorController {
    private final AuthorServiceImpl authorService;

    @Autowired
    public AuthorController(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }

    @PostMapping(value = "/register")
    public AuthorDto registerAuthor(@RequestBody AuthorRegisterRequestDto author) {
        if (authorService.exist(author.getEmail())) {
            throw new addException("the user is exist");
        } else {
            return authorService.registerAuthor(author);
        }
    }

    @GetMapping(value = "/getList")
    public List<Author> getAuthors() {
        return authorService.findAllAuthor();
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteAuthor(@PathVariable long id) {
        authorService.deleteAuthor(id);
    }
    @GetMapping(value = "/get/{id}")
    public Optional<Author> getAuthor(@PathVariable long id){
       return authorService.findById(id);
    }


}

package com.example.booklet.controller;

import com.example.booklet.controller.dto.AuthorRegisterRequestDto;
import com.example.booklet.controller.dto.AuthorUpdateRegisterDto;
import com.example.booklet.exception.AlreadyException;
import com.example.booklet.model.Author;
import com.example.booklet.service.dto.AuthorDto;
import com.example.booklet.service.impl.AuthorServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/author")
@AllArgsConstructor
public class AuthorController {
    private final AuthorServiceImpl authorService;


    @PostMapping(value = "/register")
    public AuthorDto registerAuthor(@RequestBody AuthorRegisterRequestDto author) {
        return authorService.registerAuthor(author);
    }

    @GetMapping(value = "/getList")
    public ResponseEntity<List<Author>> getAuthors() {
        return ResponseEntity.ok(authorService.findAllAuthor());
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteAuthor(@PathVariable long id) {
        authorService.deleteAuthor(id);
    }

    @GetMapping(value = "/get/{id}")
    public Optional<Author> getAuthor(@PathVariable long id) {
        return authorService.findById(id);

    }

    @PutMapping(value = "/upadte")
    public ResponseEntity<String> update(@RequestBody AuthorUpdateRegisterDto registerDto) {
        this.authorService.updateAuthor(registerDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("updated");
    }

}

package com.example.booklet.module.controller;

import com.example.booklet.module.model.Author;
import com.example.booklet.module.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private AuthorServiceImpl authorService ;

    @Autowired
    public AuthorController(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }

    @PostMapping(value = "/register")
    public Author registerAuthor(@RequestBody Author author){
        return authorService.registerAuthor(author);
    }

    @GetMapping(value = "/getList")
    public List<Author> getAuthor(){
        return authorService.findAllAuthor();
    }
    @DeleteMapping(value = "/delete/{id}")
    public void getAuthor(@PathVariable long id ){
         authorService.deleteAuthor(id);
    }
//    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
//    public void registerAuthor(@RequestBody long id){
//         authorService.deleteAuthor(id);
//        System.out.println("pak raft");
//    }
}

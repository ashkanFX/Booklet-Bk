package com.example.booklet.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "document_tbl")
public class Document {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String des;

    @ManyToOne
    private Author author;

    private LocalDateTime CreatedAt;
    private LocalDateTime UpdatedAt;


    public Document() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}

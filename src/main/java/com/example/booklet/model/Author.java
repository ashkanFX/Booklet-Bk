package com.example.booklet.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "Author_tbl")
@Data
public class Author {
    public Author() {
    }

    public Author(String email, String firstname, String university, String lastname, boolean isAlive) {
        this.email = email;
        this.firstname = firstname;
        this.university = university;
        this.lastname = lastname;
        this.isAlive = isAlive;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String email;

    private String firstname;
    private String university;
    private String lastname;
    private Boolean isAlive;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;


}

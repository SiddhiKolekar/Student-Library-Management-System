package com.example.student_library_management_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "author")
@Builder
public class Author {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "age",nullable = false)
    private int age;
    @Column(name = "country",nullable = false)
    private String country;
    @Column(name = "rating",nullable = false)
    private double rating;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> booksOfAuthor = new ArrayList<>();
}

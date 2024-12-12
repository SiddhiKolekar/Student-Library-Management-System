package com.example.student_library_management_system.model;

import com.example.student_library_management_system.Enum.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="book")
@Builder
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "pages",nullable = false)
    private int pages;
    @Column(name = "genre", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Genre genre; //horror, comedy, mythology, fiction, nonfiction
    //cmd, myth,fic, nonfic
    @Column(name = "issued_to_student", nullable = false)
    private boolean issuedToStudent;

    @ManyToOne
    @JoinColumn //in foreign key table we add join column
    private Card card;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();

    @ManyToOne
    @JoinColumn
    private Author author;
}

package com.example.student_library_management_system.convertors;

import com.example.student_library_management_system.dto.BookRequestDto;
import com.example.student_library_management_system.model.Book;

public class BookConvertor {
    public static Book convertBookRequestDtoToBook(BookRequestDto bookRequestDto){
        Book book = Book.builder().name(bookRequestDto.getName()).pages(bookRequestDto.getPages()).
                genre(bookRequestDto.getGenre()).issuedToStudent(bookRequestDto.isIssuedToStudent()).build();
        return book;
    }
}

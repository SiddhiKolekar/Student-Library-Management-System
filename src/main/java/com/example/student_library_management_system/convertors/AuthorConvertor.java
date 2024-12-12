package com.example.student_library_management_system.convertors;

import com.example.student_library_management_system.dto.AuthorRequestDto;
import com.example.student_library_management_system.model.Author;

public class AuthorConvertor {
    public static Author covertAuthorRequestDtoToAuthor(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().name(authorRequestDto.getName()).age(authorRequestDto.getAge()).
                country(authorRequestDto.getCountry()).rating(authorRequestDto.getRating()).build();
        return author;
    }
}

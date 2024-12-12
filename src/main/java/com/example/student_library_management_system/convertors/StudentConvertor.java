package com.example.student_library_management_system.convertors;

import com.example.student_library_management_system.dto.StudentRequestDto;
import com.example.student_library_management_system.model.Student;

public class StudentConvertor {
    public static Student convertStudentRequestDtoToStudent(StudentRequestDto studentRequestDto){
        //convertors = convert the request dto  classes into model classes
        Student student = Student.builder().name(studentRequestDto.getName()).
                          email(studentRequestDto.getEmail()).
                          mobile(studentRequestDto.getMobile()).
                          age(studentRequestDto.getAge()).
                         grade(studentRequestDto.getGrade()).build();
        return student;
    }
}

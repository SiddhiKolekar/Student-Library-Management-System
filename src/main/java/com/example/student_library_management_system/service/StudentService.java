package com.example.student_library_management_system.service;

import com.example.student_library_management_system.Enum.CardStatus;
import com.example.student_library_management_system.dto.StudentRequestDto;
import com.example.student_library_management_system.model.Card;
import com.example.student_library_management_system.model.Student;
import com.example.student_library_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.student_library_management_system.convertors.StudentConvertor.convertStudentRequestDtoToStudent;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(StudentRequestDto studentRequestDto){
        //create model class object
        Student student = new Student();

        //take requestdto and set it inside student object
//        student.setName(studentRequestDto.getName());
//        student.setEmail(studentRequestDto.getEmail());
//        student.setAge(studentRequestDto.getAge());
//        student.setMobile(studentRequestDto.getMobile());
//        student.setGrade(studentRequestDto.getGrade());

      student =  convertStudentRequestDtoToStudent(studentRequestDto);

        //whenever a student is created a card for the student is also created
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudent(student);

        student.setCard(card);

        //save the student object
        studentRepository.save(student); //when saving student in student repository even card gets saved in card repository

        return "Student and Card added successfully";
    }

}

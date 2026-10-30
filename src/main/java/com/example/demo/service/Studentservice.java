package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.Studentrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class Studentservice {

    private final Studentrepository repository ;

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    public Student getStudentById(Long id){
        return repository.findById(id)
                .orElseThrow();
                    }

    public String deleteStudent(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Deleted: " + id;
        } else {
            return "Not have";
        }
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = getStudentById(id);

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAddress(updatedStudent.getAddress());

        return repository.save(existingStudent);
    }
}

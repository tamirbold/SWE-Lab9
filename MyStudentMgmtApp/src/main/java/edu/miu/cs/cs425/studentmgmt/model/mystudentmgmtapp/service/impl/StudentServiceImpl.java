package edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.service.impl;

import edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.model.Student;
import edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.repository.StudentRepository;
import edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student addNewStudent(Student student) {
        var newStudent = studentRepository.save(student);
        return newStudent;
    }

    @Override
    public List<Student> getAllStudents() {
        var students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student getStudentById(Long studentId) {
        var student = studentRepository.findById(studentId).orElse(null);
        return student;
    }

    @Override
    public Student updateStudent(Student updateStudent) {

        return studentRepository.save(updateStudent);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);

    }

}

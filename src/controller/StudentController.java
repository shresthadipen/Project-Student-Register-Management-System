package controller;

import dto.StudentDto;
import service.StudentService;
import service.StudentServiceImpl;

import java.util.List;

public class StudentController {
    StudentService studentService = new StudentServiceImpl();

    public void createStudent(StudentDto studentDto) {
        studentService.createStudent(studentDto);

    }

    public List<StudentDto> getAllStudent() {
        List<StudentDto> allStudent = studentService.getAllStudent();
        return allStudent;
    }


    public StudentDto getStudentById(Integer studentId) {
        return studentService.getStudentById(studentId);
    }

    public StudentDto updateStudent(Integer studentId, StudentDto studentDto) {
        return studentService.updateStudent(studentId, studentDto);
    }

    public void disableStudent(Integer studentId) {
        studentService.disableStudent(studentId);
    }

    public void enableStudent(Integer studentId) {
        studentService.enableStudent(studentId);
    }

    public void hardDeleteStudent(Integer studentId) {
        studentService.hardDeleteStudent(studentId);
    }

}

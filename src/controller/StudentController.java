package controller;

import dto.StudentDto;
import service.StudentService;
import service.StudentServiceImpl;

import java.util.List;

public class StudentController {
    StudentService studentService = new StudentServiceImpl();

    public void createStudent(StudentDto studentDto) {
        System.out.println(studentDto.getId());
        System.out.println(studentDto.getAddress());
        System.out.println(studentDto.getFullName());
        System.out.println(studentDto.getMotherName());
        System.out.println(studentDto.getNationality());
        System.out.println(studentDto.getStudentStatus());
        studentService.createStudent(studentDto);

    }

    public List<StudentDto> getAllStudent() {
        List<StudentDto> allStudent = studentService.getAllStudent();
        return allStudent;
    }


    public StudentDto getStudentById(Integer studentId){
        System.out.println("StudentController ID = " + studentId);
        return studentService.getStudentById(studentId);
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

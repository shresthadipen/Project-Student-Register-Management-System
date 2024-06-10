package service;

import appEnums.StudentStatus;
import dto.StudentDto;
import model.StudentModel;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentModel studentModel = new StudentModel();

    @Override
    public void createStudent(StudentDto studentDto) {
        studentDto.setStudentStatus(StudentStatus.ACTIVE);
        studentModel.addStudent(studentDto);
    }

    public List<StudentDto> getAllStudent() {
        return studentModel.getAllStudent();
    }

    @Override
    public void enableStudent(Integer studentId) {
        studentModel.enableStudent(studentId, StudentStatus.ACTIVE);
    }

    @Override
    public void disableStudent(Integer studentId) {
        studentModel.disableStudent(studentId, StudentStatus.DEACTIVATE);
    }

    @Override
    public void hardDeleteStudent(Integer studentId) {
        studentModel.hardDeleteStudent(studentId);

    }

    @Override
    public StudentDto getStudentById(Integer studentId) {
        System.out.println("StudentService ID =" + studentId);
        return studentModel.getStudentById(studentId);
    }

}

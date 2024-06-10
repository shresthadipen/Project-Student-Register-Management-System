package service;

import dto.StudentDto;

import java.util.List;

public interface StudentService {
    void createStudent (StudentDto studentDto);
    List<StudentDto> getAllStudent();

   void disableStudent(Integer studentId );
   void enableStudent(Integer studentId );
   void hardDeleteStudent (Integer studentId);
   StudentDto getStudentById(Integer studentId);
}

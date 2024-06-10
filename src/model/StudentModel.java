package model;

import appEnums.StudentStatus;
import dto.StudentDto;
import utils.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    DbConnection connection = new DbConnection();

    public void addStudent(StudentDto studentDto) {
        System.out.println("Student Create Process Started");
        try {
            String query = "Insert into student_info (full_name,phone_number,dob,gender,father_name,mother_name,nationality,address,email,department,semester,status) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.getConnection().prepareStatement(query);
            preparedStatement.setString(1, studentDto.getFullName());
            preparedStatement.setString(2, studentDto.getPhoneNumber());
            preparedStatement.setString(3, studentDto.getDob());
            preparedStatement.setString(4, studentDto.getGender());
            preparedStatement.setString(5, studentDto.getFatherName());
            preparedStatement.setString(6, studentDto.getMotherName());
            preparedStatement.setString(7, studentDto.getNationality());
            preparedStatement.setString(8, studentDto.getAddress());
            preparedStatement.setString(9, studentDto.getEmail());
            preparedStatement.setString(10, studentDto.getDepartment());
            preparedStatement.setString(11, studentDto.getSemester());
            preparedStatement.setString(12, studentDto.getStudentStatus().name());
            preparedStatement.execute();
            System.out.println("Data Inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public List<StudentDto> getAllStudent() {
        List<StudentDto> studentDtoList = new ArrayList<>();
        try {
            String query = "SELECT * from student_info";
            PreparedStatement preparedStatement = connection.getConnection().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StudentDto studentDto = new StudentDto();
                studentDto.setId(resultSet.getInt(1));
                studentDto.setFullName(resultSet.getString(2));
                studentDto.setPhoneNumber(resultSet.getString(3));
                studentDto.setDob(resultSet.getString(4));
                studentDto.setGender(resultSet.getString(5));
                studentDto.setFatherName(resultSet.getString(6));
                studentDto.setMotherName(resultSet.getString(7));
                studentDto.setNationality(resultSet.getString(8));
                studentDto.setAddress(resultSet.getString(9));
                studentDto.setEmail(resultSet.getString(10));
                studentDto.setDepartment(resultSet.getString(11));
                studentDto.setSemester(resultSet.getString(12));
                studentDto.setStudentStatus(StudentStatus.valueOf(resultSet.getString(13)));
                studentDtoList.add(studentDto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentDtoList;
    }

    public void disableStudent(Integer studentId, StudentStatus status) {
        try {
            String query = "UPDATE student_info set status = ? where id = ? ";
            PreparedStatement preparedStatement = connection.getConnection().prepareStatement(query);
            preparedStatement.setString(1, status.name());
            preparedStatement.setInt(2, studentId);
            preparedStatement.execute();
            System.out.println("Data updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enableStudent(Integer studentId, StudentStatus status) {
        try {
            String query = "UPDATE student_info set status = ? where id = ? ";
            PreparedStatement preparedStatement = connection.getConnection().prepareStatement(query);
            preparedStatement.setString(1, status.name());
            preparedStatement.setInt(2, studentId);
            preparedStatement.execute();
            System.out.println("Data updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void hardDeleteStudent(Integer studentId) {
        try {
            String query = "Delete student_info where id = ? ";
            PreparedStatement preparedStatement = connection.getConnection().prepareStatement(query);
            preparedStatement.execute();
            System.out.println("Data deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public StudentDto getStudentById(Integer studentId) {
        try {
            String query = "SELECT * from student_info where id = ?";
            PreparedStatement preparedStatement = connection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1,studentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int stdId = resultSet.getInt("Id");
                String name = resultSet.getString("full_name");
                String phoneNumber = resultSet.getString("phone_number");
                String dob = resultSet.getString("dob");
                String gender = resultSet.getString("gender");
                String fatherName = resultSet.getString("father_name");
                String motherName = resultSet.getString("mother_name");
                String nationality = resultSet.getString("nationality");
                String address = resultSet.getString("address");
                String email = resultSet.getString("email");
                String department = resultSet.getString("department");
                String semester = resultSet.getString("semester");

                System.out.println("ID: " + stdId);
                System.out.println("Full Name: " + name);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("DOB: " + dob);
                System.out.println("Gender: " + gender);
                System.out.println("Address: " + address);
                System.out.println("Data Displayed");

                StudentDto studentDto = new StudentDto();
                studentDto.setId(stdId);
                studentDto.setFullName(name);
                studentDto.setPhoneNumber(phoneNumber);
                studentDto.setDob(dob);
                studentDto.setGender(gender);
                studentDto.setFatherName(fatherName);
                studentDto.setMotherName(motherName);
                studentDto.setNationality(nationality);
                studentDto.setAddress(address);
                studentDto.setEmail(email);
                studentDto.setDepartment(department);
                studentDto.setSemester(semester);

                return studentDto;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        StudentModel studentModel = new StudentModel();
        studentModel.getStudentById(15);
    }
}

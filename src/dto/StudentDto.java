package dto;

import appEnums.StudentStatus;

public class StudentDto {
    private Integer id;
    private String fullName;
    private String phoneNumber;
    private String dob;
    private String gender;
    private String fatherName;
    private String motherName;
    private String nationality;
    private String address;
    private String email;
    private String department;
    private String semester;
    private StudentStatus studentStatus;

    public void setStudentStatus(StudentStatus studentStatus) {
        this.studentStatus = studentStatus;
    }


    public StudentStatus getStudentStatus() {
        return studentStatus;
    }


    public StudentDto() {

    }

    public StudentDto(String fullName, String phoneNumber, String dob, String gender) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.gender = gender;

    }

    public Integer getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {

        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return this.motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSemester() {
        return this.semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

}




package view;

import controller.StudentController;
import dto.StudentDto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentUpdate extends JFrame {
    StudentController studentController = new StudentController();
    JTextField nameTextField = new JTextField(20);
    JTextField phoneTextField = new JTextField(20);
    JTextField dobTextField = new JTextField(20);
    JTextField fatherNameTextField = new JTextField(20);
    JTextField motherNameTextField = new JTextField(20);
    JTextField nationalityTextField = new JTextField(20);
    JTextField addressTextField = new JTextField(20);
    JTextField emailTextField = new JTextField(20);
    JTextField departmentTextField = new JTextField(20);
    JTextField semesterTextField = new JTextField(20);
    JLabel studentIdAnswer = new JLabel();


    JRadioButton genderMaleRadioBtn = new JRadioButton("Male");
    JRadioButton genderFemaleRadioBtn = new JRadioButton("Female");
    JRadioButton genderOthersRadioBtn = new JRadioButton("Others");

    public void studentUpdate() {

        setTitle("Update Student");
        setSize(1370, 730);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JLabel updateStudent = new JLabel("Update Student");
        JLabel nameLabel = new JLabel("Full Name :");
        JLabel phoneLabel = new JLabel("Phone Number :");
        JLabel dobLabel = new JLabel("Dob :");
        JLabel genderLabel = new JLabel("Gender :");
        JLabel fatherNameLabel = new JLabel("Father Name :");
        JLabel motherNameLabel = new JLabel("Mother Name :");
        JLabel nationalityLabel = new JLabel("Nationality :");
        JLabel addressLabel = new JLabel("Address :");
        JLabel emailLabel = new JLabel("Email :");
        JLabel departmentLabel = new JLabel("Department :");
        JLabel semesterLabel = new JLabel("Semester :");
        JLabel studentId = new JLabel("Student Id : ");


        JButton updateStudentBtn = new JButton("Update");
        updateStudentBtn.setForeground(Color.WHITE);
        updateStudentBtn.setBackground(Color.DARK_GRAY);
        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setForeground(Color.WHITE);
        cancelBtn.setBackground(Color.DARK_GRAY);


        Font font = new Font("Arial", Font.PLAIN, 13);
        Font fontBold = new Font("Arial", Font.BOLD, 13);
        nameLabel.setFont(font);
        phoneLabel.setFont(font);
        dobLabel.setFont(font);
        genderLabel.setFont(font);
        fatherNameLabel.setFont(font);
        motherNameLabel.setFont(font);
        nationalityLabel.setFont(font);
        addressLabel.setFont(font);
        emailLabel.setFont(font);
        departmentLabel.setFont(font);
        semesterLabel.setFont(font);
        studentId.setFont(font);
        studentIdAnswer.setFont(fontBold);
        updateStudentBtn.setFont(fontBold);
        genderFemaleRadioBtn.setFont(font);
        genderMaleRadioBtn.setFont(font);
        genderOthersRadioBtn.setFont(font);

        nameTextField.setToolTipText("Enter Full Name");
        phoneTextField.setToolTipText("Enter Number");
        dobTextField.setToolTipText("YYYY-MM-DD");
        fatherNameTextField.setToolTipText("Enter Father Name");
        motherNameTextField.setToolTipText("Enter Mother Name");
        nationalityTextField.setToolTipText("Enter Nationality");
        addressTextField.setToolTipText("Enter Address");
        emailTextField.setToolTipText("Enter Email");
        departmentTextField.setToolTipText("Enter Department");
        semesterTextField.setToolTipText("Enter Semester");

        ButtonGroup group = new ButtonGroup();
        group.add(genderMaleRadioBtn);
        group.add(genderFemaleRadioBtn);
        group.add(genderOthersRadioBtn);

        updateStudent.setFont(new Font("Arial", Font.BOLD, 25));
        updateStudent.setBounds(130, 100, 300, 40);

        nameLabel.setBounds(130, 150, 130, 30);
        nameTextField.setBounds(270, 150, 150, 30);

        phoneLabel.setBounds(130, 185, 130, 30);
        phoneTextField.setBounds(270, 185, 150, 30);

        dobLabel.setBounds(130, 220, 130, 30);
        dobTextField.setBounds(270, 220, 150, 30);

        genderLabel.setBounds(130, 255, 130, 30);
        genderMaleRadioBtn.setBounds(270, 255, 60, 30);
        genderFemaleRadioBtn.setBounds(330, 255, 70, 30);
        genderOthersRadioBtn.setBounds(400, 255, 70, 30);

        fatherNameLabel.setBounds(130, 290, 130, 30);
        fatherNameTextField.setBounds(270, 290, 150, 30);

        motherNameLabel.setBounds(130, 325, 130, 30);
        motherNameTextField.setBounds(270, 325, 150, 30);

        nationalityLabel.setBounds(130, 360, 130, 30);
        nationalityTextField.setBounds(270, 360, 150, 30);

        addressLabel.setBounds(130, 395, 130, 30);
        addressTextField.setBounds(270, 395, 150, 30);

        emailLabel.setBounds(850, 150, 130, 30);
        emailTextField.setBounds(990, 150, 150, 30);

        departmentLabel.setBounds(850, 185, 130, 30);
        departmentTextField.setBounds(990, 185, 150, 30);

        semesterLabel.setBounds(850, 220, 130, 30);
        semesterTextField.setBounds(990, 220, 150, 30);

        studentId.setBounds(850, 255, 130, 30);
        studentIdAnswer.setBounds(990, 255, 150, 30);

        updateStudentBtn.setBounds(850, 395, 290, 30);

        cancelBtn.setBounds(1060, 500, 80, 30);

        add(updateStudent);
        add(nameLabel);
        add(nameTextField);
        add(phoneLabel);
        add(phoneTextField);
        add(dobLabel);
        add(dobTextField);
        add(genderLabel);
        add(genderMaleRadioBtn);
        add(genderFemaleRadioBtn);
        add(genderOthersRadioBtn);
        add(fatherNameLabel);
        add(fatherNameTextField);
        add(motherNameLabel);
        add(motherNameTextField);
        add(nationalityLabel);
        add(nationalityTextField);
        add(addressLabel);
        add(addressTextField);
        add(emailLabel);
        add(emailTextField);
        add(departmentLabel);
        add(departmentTextField);
        add(semesterLabel);
        add(semesterTextField);
        add(studentId);
        add(studentIdAnswer);
        add(updateStudentBtn);
        add(cancelBtn);
        setLayout(null);
        setVisible(true);


        updateStudentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fullName = nameTextField.getText();
                String phoneNumber = phoneTextField.getText();
                String dob = dobTextField.getText();
                String gender = genderMaleRadioBtn.isSelected() ? "Male" :
                        genderFemaleRadioBtn.isSelected() ? "Female" : "Others";
                String fatherName = fatherNameTextField.getText();
                String motherName = motherNameTextField.getText();
                String nationality = nationalityTextField.getText();
                String address = addressTextField.getText();
                String email = emailTextField.getText();
                String department = departmentTextField.getText();
                String semester = semesterTextField.getText();
                Integer studentId = Integer.valueOf(studentIdAnswer.getText());

                StudentDto studentDto = new StudentDto();
                studentDto.setFullName(fullName);
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

                studentController.updateStudent(studentId, studentDto);
                studentDto = studentController.getStudentById(Integer.valueOf(studentId));
                ProfileInfo profileInfo = new ProfileInfo();
                profileInfo.updateProfileInfo(studentDto);
                profileInfo.profileInfo();
                dispose();
            }
        });

        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String studentId = studentIdAnswer.getText();
                StudentDto studentDto = studentController.getStudentById(Integer.valueOf(studentId));
                ProfileInfo profileInfo = new ProfileInfo();
                profileInfo.updateProfileInfo(studentDto);
                profileInfo.profileInfo();
                dispose();
            }

        });
    }


    public void updateStudent(StudentDto studentDto) {
        nameTextField.setText(studentDto.getFullName());
        phoneTextField.setText(studentDto.getPhoneNumber());
        dobTextField.setText(studentDto.getDob());
        fatherNameTextField.setText(studentDto.getFatherName());
        motherNameTextField.setText(studentDto.getMotherName());
        nationalityTextField.setText(studentDto.getNationality());
        addressTextField.setText(studentDto.getAddress());
        studentIdAnswer.setText(String.valueOf(studentDto.getId()));
        departmentTextField.setText(studentDto.getDepartment());
        semesterTextField.setText(studentDto.getSemester());
        emailTextField.setText(studentDto.getEmail());
    }
}

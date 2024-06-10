package view;

import controller.StudentController;
import dto.StudentDto;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentAdd extends JFrame {
    StudentController studentController = new StudentController();
    public void studentAdd() {

        setTitle("Add Student");
        setSize(1370, 730);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JLabel addStudent = new JLabel("Add Student");
        JLabel nameLabel = new JLabel("Full Name :");
        JLabel useerName = new JLabel("Username :");
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
        JLabel addPhotoLabel = new JLabel("Add Photo :");


        JButton addPhotoBrowseBtn = new JButton("Browse");
        addPhotoBrowseBtn.setForeground(Color.WHITE);
        addPhotoBrowseBtn.setBackground(Color.DARK_GRAY);
        JButton addStudentBtn = new JButton("Add");
        addStudentBtn.setForeground(Color.WHITE);
        addStudentBtn.setBackground(Color.DARK_GRAY);
        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setForeground(Color.WHITE);
        cancelBtn.setBackground(Color.DARK_GRAY);

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


        JRadioButton genderMaleRadioBtn = new JRadioButton("Male");
        JRadioButton genderFemaleRadioBtn = new JRadioButton("Female");
        JRadioButton genderOthersRadioBtn = new JRadioButton("Others");

        ButtonGroup group = new ButtonGroup();
        group.add(genderMaleRadioBtn);
        group.add(genderFemaleRadioBtn);
        group.add(genderOthersRadioBtn);

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
        addPhotoLabel.setFont(font);
        addPhotoBrowseBtn.setFont(fontBold);
        addStudentBtn.setFont(fontBold);
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

        addStudent.setFont(new Font("Arial", Font.BOLD, 25));
        addStudent.setBounds(130, 100, 300, 40);

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

        addPhotoLabel.setBounds(850, 308, 130, 30);
        addPhotoBrowseBtn.setBounds(990, 265, 150, 115);

        addStudentBtn.setBounds(850, 395, 290, 30);

        cancelBtn.setBounds(1060, 500, 80, 30);

        add(addStudent);
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
        add(addPhotoLabel);
        add(addPhotoBrowseBtn);
        add(addStudentBtn);
        add(cancelBtn);
//        add(panel);

        setLayout(null);
        setVisible(true);


        addStudentBtn.addActionListener(new ActionListener() {
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
                String department = dobTextField.getText();
                String semester = semesterTextField.getText();

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

                System.out.println("Error");
                studentController.createStudent(studentDto);
//                List<StudentDto> allStudent = studentController.getAllStudent();
//                String name = allStudent.get(0).getFullName();
//                System.out.println("2nd error");
//                JOptionPane.showMessageDialog(null,name);
//                setVisible(false);

            }
        });

        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StudentDetails studentDetails = new StudentDetails();
                studentDetails.studentDetail();
            }

        });
    }

    public static void main(String[] args) {
        StudentAdd student = new StudentAdd();
        student.studentAdd();
    }
}

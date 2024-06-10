
package view;

import controller.StudentController;
import dto.StudentDto;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Collections;
import java.util.List;

public class ProfileInfo extends JFrame {
    StudentController studentController = new StudentController();

    public void profileInfo() {
        setTitle("Profile");
        setSize(1370, 730);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton editBtn = new JButton("Edit Details");
        editBtn.setBounds(630, 290, 120, 30);
        editBtn.setForeground(Color.WHITE);
        editBtn.setBackground(Color.DARK_GRAY);

        JButton backBtn = new JButton("Back");
        backBtn.setForeground(Color.WHITE);
        backBtn.setBackground(Color.DARK_GRAY);

        JLabel personalDetail = new JLabel("Personal Details");
        JLabel academicDetail = new JLabel("Academic Details");
        JLabel profileNameLabel = new JLabel("Full Name :");
        JLabel profilePhoneLabel = new JLabel("Phone Number :");
        JLabel profileDobLabel = new JLabel("Dob :");
        JLabel profileGenderLabel = new JLabel("Gender :");
        JLabel profileFatherNameLabel = new JLabel("Father Name :");
        JLabel profileMotherNameLabel = new JLabel("Mother Name :");
        JLabel profileNationalityLabel = new JLabel("Nationality :");
        JLabel profileAddressLabel = new JLabel("Address :");
        JLabel profileStudentIDLabel = new JLabel("Student ID : ");
        JLabel profileDepartmentLabel = new JLabel("Department :");
        JLabel profileSemesterLabel = new JLabel("Semester :");
        JLabel profileEmailLabel = new JLabel("Email :");
        JLabel profileAttendanceLabel = new JLabel("Attendance percentage :");


        JLabel profileNameLabelAnswer = new JLabel();
        JLabel profilePhoneLabelAnswer = new JLabel();
        JLabel profileDobLabelAnswer = new JLabel();
        JLabel profileGenderLabelAnswer = new JLabel();
        JLabel profileFatherNameLabelAnswer = new JLabel();
        JLabel profileMotherNameLabelAnswer = new JLabel();
        JLabel profileNationalityLabelAnswer = new JLabel();
        JLabel profileAddressLabelAnswer = new JLabel();
        JLabel profileStudentIDLabelAnswer = new JLabel();
        JLabel profileDepartmentLabelAnswer = new JLabel();
        JLabel profileSemesterLabelAnswer = new JLabel();
        JLabel profileEmailLabelAnswer = new JLabel();
        JLabel profileAttendanceLabelAnswer = new JLabel("99%");

        JPanel profilePicturePanel = new JPanel();
        profilePicturePanel.setBounds(620, 150, 140, 130);
        profilePicturePanel.setBackground(Color.BLACK);

        JPanel infoBoxPanel = new JPanel();
        infoBoxPanel.setBounds(150, 350, 1050, 280);

        backBtn.setBounds(1130, 640, 70, 30);

        LineBorder line = new LineBorder(Color.DARK_GRAY, 2, true);
        infoBoxPanel.setBorder(line);
        editBtn.setBorder(line);

        Font font = new Font("Arial", Font.PLAIN, 13);
        Font fontBold = new Font("Arial", Font.BOLD, 13);
        Font fontTitle = new Font("Arial", Font.BOLD, 14);
        personalDetail.setFont(fontTitle);
        academicDetail.setFont(fontTitle);
        editBtn.setFont(fontBold);

        profileNameLabel.setFont(fontBold);
        profilePhoneLabel.setFont(fontBold);
        profileDobLabel.setFont(fontBold);
        profileGenderLabel.setFont(fontBold);
        profileFatherNameLabel.setFont(fontBold);
        profileMotherNameLabel.setFont(fontBold);
        profileStudentIDLabel.setFont(fontBold);
        profileDepartmentLabel.setFont(fontBold);
        profileEmailLabel.setFont(fontBold);
        profileAddressLabel.setFont(fontBold);
        profileAttendanceLabel.setFont(fontBold);
        profileNationalityLabel.setFont(fontBold);
        profileSemesterLabel.setFont(fontBold);


        profileNameLabelAnswer.setFont(font);
        profilePhoneLabelAnswer.setFont(font);
        profileDobLabelAnswer.setFont(font);
        profileGenderLabelAnswer.setFont(font);
        profileFatherNameLabelAnswer.setFont(font);
        profileMotherNameLabelAnswer.setFont(font);
        profileStudentIDLabelAnswer.setFont(font);
        profileDepartmentLabelAnswer.setFont(font);
        profileEmailLabelAnswer.setFont(font);
        profileAddressLabelAnswer.setFont(font);
        profileAttendanceLabelAnswer.setFont(font);
        profileNationalityLabelAnswer.setFont(font);
        profileSemesterLabelAnswer.setFont(font);


        personalDetail.setBounds(50, 25, 200, 30);
        academicDetail.setBounds(550, 25, 200, 30);

        profileNameLabel.setBounds(50, 60, 100, 30);
        profileNameLabelAnswer.setBounds(220, 60, 100, 30);

        profilePhoneLabel.setBounds(50, 80, 120, 30);
        profilePhoneLabelAnswer.setBounds(220, 80, 100, 30);

        profileDobLabel.setBounds(50, 100, 100, 30);
        profileDobLabelAnswer.setBounds(220, 100, 100, 30);

        profileGenderLabel.setBounds(50, 120, 100, 30);
        profileGenderLabelAnswer.setBounds(220, 120, 100, 30);

        profileFatherNameLabel.setBounds(50, 140, 100, 30);
        profileFatherNameLabelAnswer.setBounds(220, 140, 100, 30);

        profileMotherNameLabel.setBounds(50, 160, 100, 30);
        profileMotherNameLabelAnswer.setBounds(220, 160, 100, 30);

        profileNationalityLabel.setBounds(50, 180, 100, 30);
        profileNationalityLabelAnswer.setBounds(220, 180, 100, 30);

        profileAddressLabel.setBounds(50, 200, 100, 30);
        profileAddressLabelAnswer.setBounds(220, 200, 100, 30);

        profileStudentIDLabel.setBounds(550, 60, 100, 30);
        profileStudentIDLabelAnswer.setBounds(760, 60, 100, 30);

        profileDepartmentLabel.setBounds(550, 80, 100, 30);
        profileDepartmentLabelAnswer.setBounds(760, 80, 100, 30);
//
        profileSemesterLabel.setBounds(550, 100, 100, 30);
        profileSemesterLabelAnswer.setBounds(760, 100, 100, 30);
//
        profileEmailLabel.setBounds(550, 120, 100, 30);
        profileEmailLabelAnswer.setBounds(760, 120, 200, 30);
//
        profileAttendanceLabel.setBounds(550, 140, 200, 30);
        profileAttendanceLabelAnswer.setBounds(760, 140, 100, 30);


        infoBoxPanel.add(personalDetail);
        infoBoxPanel.add(academicDetail);
        infoBoxPanel.add(profileNameLabel);
        infoBoxPanel.add(profileNameLabelAnswer);
        infoBoxPanel.add(profilePhoneLabel);
        infoBoxPanel.add(profilePhoneLabelAnswer);
        infoBoxPanel.add(profileDobLabel);
        infoBoxPanel.add(profileDobLabelAnswer);
        infoBoxPanel.add(profileGenderLabel);
        infoBoxPanel.add(profileGenderLabelAnswer);
        infoBoxPanel.add(profileFatherNameLabel);
        infoBoxPanel.add(profileFatherNameLabelAnswer);
        infoBoxPanel.add(profileMotherNameLabel);
        infoBoxPanel.add(profileMotherNameLabelAnswer);
        infoBoxPanel.add(profileNationalityLabel);
        infoBoxPanel.add(profileNationalityLabelAnswer);
        infoBoxPanel.add(profileAddressLabel);
        infoBoxPanel.add(profileAddressLabelAnswer);
        infoBoxPanel.add(profileStudentIDLabel);
        infoBoxPanel.add(profileStudentIDLabelAnswer);
        infoBoxPanel.add(profileDepartmentLabel);
        infoBoxPanel.add(profileDepartmentLabelAnswer);
        infoBoxPanel.add(profileSemesterLabel);
        infoBoxPanel.add(profileSemesterLabelAnswer);
        infoBoxPanel.add(profileEmailLabel);
        infoBoxPanel.add(profileEmailLabelAnswer);
        infoBoxPanel.add(profileAttendanceLabel);
        infoBoxPanel.add(profileAttendanceLabelAnswer);
        add(profilePicturePanel);
        add(backBtn);

        infoBoxPanel.setLayout(null);
        add(infoBoxPanel);
        add(editBtn);
        setLayout(null);
        setVisible(true);
    }

}

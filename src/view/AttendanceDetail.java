package view;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class AttendanceDetail extends JFrame {
    public void attendanceDetail(){
        setTitle("Attendance Details");
        setSize(1370, 730);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel attendanceDetail = new JLabel("Attendance Table");
        JLabel departmentLabel = new JLabel("Department :");
        JLabel semesterLabel = new JLabel("Semester :");


        String[] department = {"BCA", "BBS", "BSW", "BSM", "BBA"};
        String[] semester = {"1", "2", "3", "4", "5"};
        JComboBox departmentComboBox = new JComboBox(department);
        JComboBox semesterComboBox = new JComboBox(semester);


        JTextField searchBar = new JTextField(20);

        JButton searchBtn = new JButton("Search");
        searchBtn.setForeground(Color.WHITE);
        searchBtn.setBackground(Color.darkGray);
//        JButton addStudentBtn = new JButton("Add");
//        addStudentBtn.setForeground(Color.WHITE);
//        addStudentBtn.setBackground(Color.darkGray);
        JButton backBtn = new JButton("Back");
        backBtn.setForeground(Color.WHITE);
        backBtn.setBackground(Color.DARK_GRAY);

        String[] column = {"Student ID", "Name", "Department", "Reason", "Status"};
        String[][] data = {{"10001", "Dipen Shrestha", "BCA", "None", "Present"},
                {"10001", "Dipen Shrestha", "BCA", "Fever", "Absent"}};


        searchBar.setBounds(975, 15, 220, 30);

        searchBtn.setFont(new Font("Arial", Font.BOLD, 13));
        searchBtn.setBounds(1200, 15, 80, 30);

//        addStudentBtn.setBounds(1210, 15, 70, 30);

        attendanceDetail.setFont(new Font("Arial", Font.BOLD, 25));
        attendanceDetail.setBounds(70, 120, 300, 40);

        departmentLabel.setBounds(350, 130, 120, 25);
        departmentComboBox.setBounds(435, 130, 70, 20);

        semesterLabel.setBounds(530, 130, 120, 25);
        semesterComboBox.setBounds(605, 130, 70, 20);

        backBtn.setBounds(1210, 590, 70, 30);


        JTable table = new JTable(data, column);
        JScrollPane tableScrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new BorderLayout());
        tablePanel.setBounds(70, 170, 1210, 400);
        tablePanel.add(tableScrollPane, BorderLayout.CENTER);

        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.DARK_GRAY);
        header.setForeground(Color.WHITE);

        add(searchBar);
        add(searchBtn);
//        add(addStudentBtn);
        add(attendanceDetail);
        add(departmentLabel);
        add(departmentComboBox);
        add(semesterLabel);
        add(semesterComboBox);
        add(tablePanel);
        add(backBtn);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        AttendanceDetail ad = new AttendanceDetail();
        ad.attendanceDetail();
    }
}

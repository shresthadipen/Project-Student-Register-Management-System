package view;

import controller.StudentController;
import dto.StudentDto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class StudentDetails extends JFrame {
    StudentController studentController = new StudentController();

    public void studentDetail() {
        setTitle("Student Details");
        setSize(1370, 730);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel studentDetail = new JLabel("Student Details");
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
        JButton addStudentBtn = new JButton("Add");
        addStudentBtn.setForeground(Color.WHITE);
        addStudentBtn.setBackground(Color.darkGray);


        searchBar.setBounds(900, 15, 220, 30);

        searchBtn.setFont(new Font("Arial", Font.BOLD, 13));
        searchBtn.setBounds(1125, 15, 80, 30);

        addStudentBtn.setBounds(1210, 15, 70, 30);

        studentDetail.setFont(new Font("Arial", Font.BOLD, 25));
        studentDetail.setBounds(70, 120, 300, 40);

        departmentLabel.setBounds(350, 130, 120, 25);
        departmentComboBox.setBounds(435, 130, 70, 20);

        semesterLabel.setBounds(530, 130, 120, 25);
        semesterComboBox.setBounds(605, 130, 70, 20);

        List<StudentDto> student = studentController.getAllStudent();
        DefaultTableModel tableModel = getStudentTableModel(student);

        JTable table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("Arial", Font.PLAIN, 13));

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new BorderLayout());
        tablePanel.setBounds(70, 170, 1210, 400);
        tablePanel.add(tableScrollPane, BorderLayout.CENTER);

        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.DARK_GRAY);
        header.setForeground(Color.WHITE);

        table.getColumnModel().getColumn(0).setPreferredWidth(10);

        add(searchBar);
        add(searchBtn);
        add(addStudentBtn);
        add(studentDetail);
        add(departmentLabel);
        add(departmentComboBox);
        add(semesterLabel);
        add(semesterComboBox);
        add(tablePanel);
        setLayout(null);
        setVisible(true);

        addStudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentAdd sa = new StudentAdd();
                sa.studentAdd();
                dispose();
            }
        });

        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = searchBar.getText();
                DefaultTableModel tableModel1 = (DefaultTableModel) table.getModel();
                TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<>(tableModel1);
                table.setRowSorter(tableRowSorter);
                tableRowSorter.setRowFilter(RowFilter.regexFilter(str));
            }
        });

        ProfileInfo profileInfo = new ProfileInfo();

        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                int column = table.getSelectedColumn();
                if (row != -1 && column == 6) {
                    String studentId = table.getModel().getValueAt(row, 1).toString();
                    StudentDto studentDto = studentController.getStudentById(Integer.valueOf(studentId));
                    profileInfo.updateProfileInfo(studentDto);
                    profileInfo.profileInfo();
                    dispose();
                }
                if (row != -1 && column == 7) {
                    String studentId = table.getModel().getValueAt(row, 1).toString();
                    String studentName = table.getModel().getValueAt(row, 2).toString();  // Get the student's name

                    int response = JOptionPane.showConfirmDialog(
                            null,  "Do you want to delete " + studentName + " details ?", "Confirm",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                    );

                    if (response == JOptionPane.YES_OPTION) {
                        studentController.hardDeleteStudent(Integer.valueOf(studentId));
                        StudentDetails studentDetails = new StudentDetails();
                        studentDetails.studentDetail();
                        dispose();


                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }


    public static DefaultTableModel getStudentTableModel(List<StudentDto> allStudent) {
        String[] column = {"S.N", "Student ID", "Name", "Department", "Semester", "Status", "Action", "Delete"};
        Object[][] data = new Object[allStudent.size()][8];

        for (int i = 0; i < allStudent.size(); i++) {
            StudentDto studentDto = allStudent.get(i);
            data[i][0] = i + 1;
            data[i][1] = studentDto.getId();
            data[i][2] = studentDto.getFullName();
            data[i][3] = studentDto.getDepartment();
            data[i][4] = studentDto.getSemester();
            data[i][5] = studentDto.getStudentStatus();
            data[i][6] = "View Detail";
            data[i][7] = "Delete";

        }
        return new DefaultTableModel(data, column);
    }


}
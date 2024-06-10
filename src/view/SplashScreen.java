package view;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JFrame {
    public void splash() {

        setSize(600, 400);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel welcome = new JLabel("Welcome To Student Register Management System !!", SwingConstants.CENTER);
        welcome.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(welcome, BorderLayout.CENTER);

        JLabel by = new JLabel("By Dipen Shrestha");
        by.setFont(new Font("Times New Roman", Font.ITALIC, 12));
        by.setBounds(500, 370, 150, 30);

        add(by);
        add(panel);
        setVisible(true);
        try {
            Thread.sleep(3000);
            setVisible(false);
            StudentDetails sd = new StudentDetails();
            sd.studentDetail();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        SplashScreen ss = new SplashScreen();
        ss.splash();

    }
}
    



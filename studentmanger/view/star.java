package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class star extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */

    public void run() {
        try {
            star frame = new star();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    };


    /**
     * Create the frame.
     */
    public star() {

        setTitle("吉首大学");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 448, 301);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("学生信息管理系统");
        lblNewLabel.setFont(new Font("华文行楷", Font.PLAIN, 30));
        lblNewLabel.setBounds(74, 40, 259, 51);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("登录");
        btnNewButton.setFont(new Font("华文行楷", Font.PLAIN, 25));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dl dl=new dl();
                dl.setVisible(true);
            }
        });
        btnNewButton.setBounds(63, 140, 113, 27);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("注册");
        btnNewButton_1.setFont(new Font("华文行楷", Font.PLAIN, 25));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zc dl=new zc();
                dl.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(244, 140, 113, 27);
        contentPane.add(btnNewButton_1);
    }

}

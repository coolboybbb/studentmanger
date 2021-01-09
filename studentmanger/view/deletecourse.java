package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.courseDao;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deletecourse extends JFrame {

    private JPanel contentPane;
    private JTextField textField;



    /**
     * Create the frame.
     */
    public deletecourse() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 480, 252);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("请输入课程号：");
        lblNewLabel.setBounds(32, 67, 117, 18);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("取消");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        btnNewButton.setBounds(58, 123, 113, 34);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("确定");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id=textField.getText().toString();
                courseDao c=new courseDao();
                c.delect(id);
            }
        });
        btnNewButton_1.setBounds(207, 127, 113, 27);
        contentPane.add(btnNewButton_1);

        textField = new JTextField();
        textField.setBounds(154, 64, 145, 24);
        contentPane.add(textField);
        textField.setColumns(10);
    }

}

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.StudentDao;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class deletestudent extends JFrame {

    private JPanel contentPane;
    private JTextField textField;



    /**
     * Create the frame.
     */
    public deletestudent() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 441, 258);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("请输入学生学号：");
        lblNewLabel.setBounds(33, 85, 143, 18);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("取消");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        btnNewButton.setBounds(62, 171, 113, 27);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("确定");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String  sno=textField.getText().toString();
                StudentDao a=new StudentDao();
                a.delect(sno);
            }
        });
        btnNewButton_1.setBounds(217, 171, 113, 27);
        contentPane.add(btnNewButton_1);

        textField = new JTextField();
        textField.setBounds(185, 82, 145, 24);
        contentPane.add(textField);
        textField.setColumns(10);
    }

}

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.addContact;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

/*public class delect extends JFrame {

    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    delect frame = new delect();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    /*public delect() {

        setTitle("吉首大学");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("请输入账号：");
        lblNewLabel.setFont(new Font("华文行楷", Font.PLAIN, 20));
        lblNewLabel.setBounds(94, 106, 130, 18);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(238, 103, 145, 24);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("取消");
        btnNewButton.setFont(new Font("华文行楷", Font.PLAIN, 15));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        btnNewButton.setBounds(94, 177, 113, 27);
        contentPane.add(btnNewButton);



        JButton btnNewButton_1 = new JButton("确定");
        btnNewButton_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String uersname= textField.getText().toString();
                addContact ac=new addContact();
                ac.delete(uersname);
            }
        });
        btnNewButton_1.setBounds(240, 177, 113, 27);
        contentPane.add(btnNewButton_1);



    }}*/


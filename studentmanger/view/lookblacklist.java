package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.addContact;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lookblacklist extends JFrame {

    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    lookblacklist frame = new lookblacklist();
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
    public lookblacklist() {
        setTitle("吉首大学");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 434, 218);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("请输入学生的账号：");
        lblNewLabel.setFont(new Font("华文行楷", Font.PLAIN, 15));
        lblNewLabel.setBounds(40, 75, 135, 26);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(189, 75, 161, 24);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("取消");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        btnNewButton.setBounds(84, 130, 113, 27);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("确定");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String newName=textField.getText().toString();
                addContact a=new addContact();
                a.lookblacklist(newName);

            }
        });
        btnNewButton_1.setBounds(247, 131, 113, 27);
        contentPane.add(btnNewButton_1);
    }
}

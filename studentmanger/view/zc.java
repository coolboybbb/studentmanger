package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.adminzcDao;
import DAO.studentzcDao;
import model.Admin;
import model.Student;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class zc extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    zc frame = new zc();
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
    public zc() {
        setTitle("注册");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setBounds(179, 117, 129, 24);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(179, 154, 129, 24);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(179, 85, 129, 24);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(179, 56, 129, 24);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("管理员");
        rdbtnNewRadioButton.setBounds(338, 84, 81, 27);
        contentPane.add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("学生");
        rdbtnNewRadioButton_1.setBounds(341, 139, 81, 27);
        contentPane.add(rdbtnNewRadioButton_1);
        ButtonGroup btnGroup = new ButtonGroup();

        // 添加单选按钮到按钮组
        btnGroup.add(rdbtnNewRadioButton);
        btnGroup.add(rdbtnNewRadioButton_1);


        JButton btnNewButton_2 = new JButton("重置");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restValue(e);
            }

            private void restValue(ActionEvent e) {
                // TODO Auto-generated method stub
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
            }
        });
        btnNewButton_2.setBounds(89, 213, 113, 27);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton = new JButton("确定");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zc(e);
            }

            private void zc(ActionEvent e) {

                // TODO Auto-generated method stub
                String uersname=textField.getText().toString();
                String password=new String(textField_1.getText().toString());
                String name=textField_2.getText().toString();
                String id=textField_3.getText();
                if(rdbtnNewRadioButton.isSelected())
                {
                    Admin a=new Admin();
                    a.setUsername(uersname);
                    a.setPassword(password);
                    a.setName(name);
                    a.setId(id);
                    adminzcDao b=new adminzcDao();
                    b.inset(a);
                    boolean c=b.inset(a);
                    if(c==true)
                    {
                        JOptionPane.showMessageDialog(null, "添加成功");
                        dispose();
                    }else {
                        JOptionPane.showMessageDialog(null, "添加成功");
                        dispose();
                    }
                }
                if(rdbtnNewRadioButton_1.isSelected())
                {
                    Student a=new Student();
                    a.setUsername(uersname);
                    a.setPassword(password);
                    a.setName(name);
                    a.setSno(id);
                    studentzcDao b=new studentzcDao();
                    b.inset(a);
                    boolean c=b.inset(a);
                    if(c==true)
                    {
                        JOptionPane.showMessageDialog(null, "添加成功。");
                        dispose();
                    }else {
                        JOptionPane.showMessageDialog(null, "添加成功。");
                        dispose();
                    }
                }
            }
        });
        btnNewButton.setBounds(258, 213, 113, 27);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel = new JLabel("账号(四位）：");
        lblNewLabel.setBounds(112, 120, 72, 18);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("密码：");
        lblNewLabel_1.setBounds(112, 157, 72, 18);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("姓名：");
        lblNewLabel_2.setBounds(109, 88, 45, 18);
        contentPane.add(lblNewLabel_2);

        JLabel lblId = new JLabel("Id:");
        lblId.setBounds(112, 59, 42, 18);
        contentPane.add(lblId);




    }
}

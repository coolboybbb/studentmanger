package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.AdminDao;
import DAO.StudentDao;
import DAO.addContact;
import model.Admin;
import model.Student;
import util.Stringutil;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class dl extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    dl frame = new dl();
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
    public dl() {

        setTitle("登录");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 566, 398);

       // ImageIcon imgs=new ImageIcon("sc/image/1.jpg");

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("管理员");
        rdbtnNewRadioButton.setFont(new Font("华文行楷", Font.PLAIN, 20));
        rdbtnNewRadioButton.setBounds(113, 82, 157, 27);
        contentPane.add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("学生");
        rdbtnNewRadioButton_1.setFont(new Font("华文行楷", Font.PLAIN, 20));
        rdbtnNewRadioButton_1.setBounds(296, 82, 157, 27);
        contentPane.add(rdbtnNewRadioButton_1);
        ButtonGroup btnGroup = new ButtonGroup();

        // 添加单选按钮到按钮组
        btnGroup.add(rdbtnNewRadioButton);
        btnGroup.add(rdbtnNewRadioButton_1);

        passwordField = new JPasswordField();
        passwordField.setBounds(229, 220, 163, 24);
        contentPane.add(passwordField);

        JButton btnNewButton = new JButton("重置");
        btnNewButton.setFont(new Font("华文行楷", Font.PLAIN, 20));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restValue(e);
            }

            private void restValue(ActionEvent e) {
                // TODO Auto-generated method stub
                textField.setText("");
                passwordField.setText("");
            }
        });
        btnNewButton.setBounds(102, 274, 113, 27);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("登录");
        btnNewButton_1.setFont(new Font("华文行楷", Font.PLAIN, 20));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginAct(e);
            }

            private void loginAct(ActionEvent e) {
                // TODO Auto-generated method stub
                String uersname=textField.getText().toString();
                String password=new String(passwordField.getText().toString());


                if(Stringutil.isEmpty(uersname) )
                {
                    JOptionPane.showMessageDialog(null, "用户名不能为空");
                    return ;

                }
                if(Stringutil.isEmpty(password) )
                {
                    JOptionPane.showMessageDialog(null,"密码不能为空");
                    return;

                }
                Admin admin=null;
                if (rdbtnNewRadioButton.isSelected()) {
                    AdminDao adminDao=new AdminDao();
                    Admin adminTmp=new Admin();
                    adminTmp.setUsername(uersname);
                    adminTmp.setPassword(password);
                    admin=adminDao.login(adminTmp);

                    if (admin== null)
                    {
                        JOptionPane.showMessageDialog(null, "用户名或密码错误");
                        return;
                    }
                    JOptionPane.showMessageDialog(null, "登录成功");
                    dispose();
                    adminG a=new adminG(admin);
                    a.setVisible(true);

                }
                if(rdbtnNewRadioButton_1.isSelected())
                {
                    StudentDao stuDao=new StudentDao();

                    Student studentTmp=new Student();
                    studentTmp.setUsername(uersname);
                    studentTmp.setPassword(password);
                    Student stu=stuDao.login(studentTmp);
                    addContact b=new addContact();
                    boolean c=b.panduanblacklist(uersname);
                    if(c==true)
                    {
                        JOptionPane.showMessageDialog(null, "你已经被加入黑名单");
                    }
                    if (stu==null)
                    {
                        JOptionPane.showMessageDialog(null, "用户名或密码错误");
                        return;
                    }

                    JOptionPane.showMessageDialog(null, "登录成功");
                    dispose();
                    studentG a=new studentG(stu);
                    a.setVisible(true);

                }
            }
        });

        btnNewButton_1.setBounds(296, 274, 113, 27);
        contentPane.add(btnNewButton_1);

        JLabel lblNewLabel = new JLabel("账号：");
        lblNewLabel.setFont(new Font("华文行楷", Font.PLAIN, 25));
        lblNewLabel.setBounds(135, 147, 80, 38);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("密码：");
        lblNewLabel_1.setFont(new Font("华文行楷", Font.PLAIN, 25));
        lblNewLabel_1.setBounds(135, 217, 80, 28);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(229, 155, 163, 24);
        contentPane.add(textField);
        textField.setColumns(10);


    }
}


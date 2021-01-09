package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Student;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class lookFrame extends JFrame {

    private JPanel contentPane;
    private JTextField nametextField;
    private JTextField sextextField_1;
    private JTextField departmenttextField_2;
    private JTextField homeTowntextField_3;
    private JTextField marktextField_4;
    private JTextField usernametextField_5;
    private JTextField snotextField_6;
    private JTextField passwordtextField_7;

    private Object uersobject;
    /**
     * Launch the application.
     */
    //public static void main(String[] args) {
    //EventQueue.invokeLater(new Runnable() {
    //public void run() {
    //try {
    //lookFrame frame = new lookFrame();
    //	frame.setVisible(true);
    //} catch (Exception e) {
    //	e.printStackTrace();
    //}
    //}
    //});
    //}

    /**
     * Create the frame.
     */
    public lookFrame(Student uersobject) {
        setTitle("吉首大学");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 478, 378);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("姓名：");
        lblNewLabel.setBounds(28, 44, 72, 18);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("性别：");
        lblNewLabel_1.setBounds(28, 75, 72, 18);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("院系：");
        lblNewLabel_2.setBounds(28, 106, 72, 18);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("籍贯：");
        lblNewLabel_3.setBounds(28, 137, 72, 18);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("学分：");
        lblNewLabel_4.setBounds(28, 168, 72, 18);
        contentPane.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("账号：");
        lblNewLabel_5.setBounds(28, 202, 72, 18);
        contentPane.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("学号：");
        lblNewLabel_6.setBounds(28, 230, 72, 18);
        contentPane.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("密码：");
        lblNewLabel_7.setBounds(28, 261, 72, 18);
        contentPane.add(lblNewLabel_7);

        nametextField = new JTextField(uersobject.getName());
        nametextField.setBounds(119, 41, 126, 24);
        contentPane.add(nametextField);
        nametextField.setColumns(10);

        sextextField_1 = new JTextField(uersobject.getSex());
        sextextField_1.setBounds(119, 72, 126, 24);
        contentPane.add(sextextField_1);
        sextextField_1.setColumns(10);

        departmenttextField_2 = new JTextField(uersobject.getDepartment());
        departmenttextField_2.setBounds(119, 103, 126, 24);
        contentPane.add(departmenttextField_2);
        departmenttextField_2.setColumns(10);

        homeTowntextField_3 = new JTextField(uersobject.getHomeTown());
        homeTowntextField_3.setBounds(119, 134, 126, 24);
        contentPane.add(homeTowntextField_3);
        homeTowntextField_3.setColumns(10);

        marktextField_4 = new JTextField(uersobject.getMark());
        marktextField_4.setBounds(119, 165, 126, 24);
        contentPane.add(marktextField_4);
        marktextField_4.setColumns(10);

        usernametextField_5 = new JTextField(uersobject.getUsername());
        usernametextField_5.setBounds(119, 196, 126, 24);
        contentPane.add(usernametextField_5);
        usernametextField_5.setColumns(10);

        snotextField_6 = new JTextField(uersobject.getSno());
        snotextField_6.setBounds(119, 227, 126, 24);
        contentPane.add(snotextField_6);
        snotextField_6.setColumns(10);

        passwordtextField_7 = new JTextField(uersobject.getPassword());
        passwordtextField_7.setBounds(119, 258, 126, 24);
        contentPane.add(passwordtextField_7);
        passwordtextField_7.setColumns(10);




    }

}

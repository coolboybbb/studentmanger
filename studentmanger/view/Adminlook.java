package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Admin;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

public class Adminlook extends JFrame {
    private Object uersobject;
    private JPanel contentPane;
    private JTextField idtextField;
    private JTextField textField_1;
    private JTextField uersnametextField_2;
    private JTextField passwordtextField_3;

    /**
     * Launch the application.
     */
    //public static void main(String[] args) {
    //EventQueue.invokeLater(new Runnable() {
    //public void run() {
    //	try {
    //	Adminlook frame = new Adminlook();
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
    public Adminlook(Admin admin) {

        setTitle("吉首大学");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("id:");
        lblNewLabel.setFont(new Font("华文行楷", Font.PLAIN, 20));
        lblNewLabel.setBounds(113, 49, 43, 18);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("名字：");
        lblNewLabel_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(105, 107, 51, 18);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("账号：");
        lblNewLabel_2.setFont(new Font("华文行楷", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(105, 157, 51, 18);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("密码：");
        lblNewLabel_3.setFont(new Font("华文行楷", Font.PLAIN, 15));
        lblNewLabel_3.setBounds(105, 222, 45, 18);
        contentPane.add(lblNewLabel_3);

        idtextField = new JTextField(admin.getId());
        idtextField.setBounds(176, 46, 86, 24);
        contentPane.add(idtextField);
        idtextField.setColumns(10);

        textField_1 = new JTextField(admin.getName());
        textField_1.setBounds(176, 104, 86, 24);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        uersnametextField_2 = new JTextField(admin.getUsername());
        uersnametextField_2.setBounds(176, 154, 86, 24);
        contentPane.add(uersnametextField_2);
        uersnametextField_2.setColumns(10);

        passwordtextField_3 = new JTextField(admin.getPassword());
        passwordtextField_3.setBounds(176, 219, 86, 24);
        contentPane.add(passwordtextField_3);
        passwordtextField_3.setColumns(10);
    }

}

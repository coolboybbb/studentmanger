package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.AdminDao;
import DAO.StudentDao;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class adminEditpassword extends JFrame {

    private JPanel contentPane;
    private JTextField idtextField;
    private JTextField oldpasswordtextField_1;
    private JTextField newpasswordtextField_2;
    private JButton btnNewButton_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    adminEditpassword frame = new adminEditpassword();
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
    public adminEditpassword() {

        setTitle("修改密码");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblId = new JLabel("id：");
        lblId.setFont(new Font("华文行楷", Font.PLAIN, 20));
        lblId.setBounds(89, 70, 40, 18);
        contentPane.add(lblId);

        JLabel lblNewLabel = new JLabel("旧密码：");
        lblNewLabel.setFont(new Font("华文行楷", Font.PLAIN, 15));
        lblNewLabel.setBounds(69, 114, 60, 18);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("新密码：");
        lblNewLabel_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(69, 167, 72, 18);
        contentPane.add(lblNewLabel_1);

        idtextField = new JTextField();
        idtextField.setBounds(134, 67, 161, 24);
        contentPane.add(idtextField);
        idtextField.setColumns(10);

        oldpasswordtextField_1 = new JTextField();
        oldpasswordtextField_1.setBounds(134, 111, 161, 24);
        contentPane.add(oldpasswordtextField_1);
        oldpasswordtextField_1.setColumns(10);

        newpasswordtextField_2 = new JTextField();
        newpasswordtextField_2.setBounds(134, 164, 161, 24);
        contentPane.add(newpasswordtextField_2);
        newpasswordtextField_2.setColumns(10);

        JButton btnNewButton = new JButton("取消");
        btnNewButton.setFont(new Font("华文行楷", Font.PLAIN, 15));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                idtextField.setText("");
                oldpasswordtextField_1.setText("");
                newpasswordtextField_2.setText("");
            }
        });
        btnNewButton.setBounds(69, 213, 113, 27);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("确定");
        btnNewButton_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id=idtextField.getText().toString();
                String oldpassword=oldpasswordtextField_1.getText().toString();
                String newpassword=newpasswordtextField_2.getText().toString();

                if(oldpassword.equals(newpassword))
                {
                    JOptionPane.showMessageDialog(null, "旧密码和新密码不能相同");
                    return ;
                }
                else {
                    AdminDao a=new AdminDao();
                    a.adminupdate(id, newpassword, oldpassword);
                }

            }
        });
        btnNewButton_1.setBounds(214, 213, 113, 27);
        contentPane.add(btnNewButton_1);
    }

}
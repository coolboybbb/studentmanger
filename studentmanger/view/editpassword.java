package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.StudentDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editpassword extends JFrame {

    private JPanel contentPane;
    private JTextField oldpsswordtextField;
    private JTextField newpasswordtextField_1;
    private JTextField snotextField;

    /**
     * Launch the application.
     */
    //public static void main(String[] args) {
    //EventQueue.invokeLater(new Runnable() {
    //	public void run() {
    //	try {
    //	editpassword frame = new editpassword();
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
    public editpassword(){
        setTitle("吉首大学");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("旧密码：");
        lblNewLabel.setBounds(75, 115, 72, 18);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("新密码：");
        lblNewLabel_1.setBounds(75, 157, 72, 18);
        contentPane.add(lblNewLabel_1);

        oldpsswordtextField = new JTextField();
        oldpsswordtextField.setBounds(156, 112, 115, 24);
        contentPane.add(oldpsswordtextField);
        oldpsswordtextField.setColumns(10);

        newpasswordtextField_1 = new JTextField();
        newpasswordtextField_1.setBounds(156, 154, 115, 24);
        contentPane.add(newpasswordtextField_1);
        newpasswordtextField_1.setColumns(10);

        snotextField = new JTextField();
        snotextField.setBounds(156, 75, 115, 24);
        contentPane.add(snotextField);
        snotextField.setColumns(10);

        JButton button = new JButton("确定修改");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updatepassword(e);
            }

            private void updatepassword(ActionEvent e) {
                // TODO Auto-generated method stub
                String sno=snotextField.getText().toString();
                String oldpassword=oldpsswordtextField.getText().toString();
                String newpassword=newpasswordtextField_1.getText().toString();
                if(oldpassword.equals(newpassword))
                {
                    JOptionPane.showMessageDialog(null, "旧密码和新密码不能相同");
                    return ;
                }
                else {
                    StudentDao a=new StudentDao();
                    a.update(sno, newpassword, oldpassword);
                }
            }
        });
        button.setBounds(65, 198, 113, 27);
        contentPane.add(button);

        JButton button_1 = new JButton("重置");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                oldpsswordtextField.setText("");
                newpasswordtextField_1.setText("");
                snotextField.setText("");
            }
        });
        button_1.setBounds(203, 198, 113, 27);
        contentPane.add(button_1);

        JLabel lblNewLabel_2 = new JLabel("学号：");
        lblNewLabel_2.setBounds(75, 78, 72, 18);
        contentPane.add(lblNewLabel_2);


    }
}


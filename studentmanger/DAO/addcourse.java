package DAO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.course;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addcourse extends JFrame {

    private JPanel contentPane;
    private JTextField cnametextField;
    private JTextField idtextField_1;
    private JTextField marktextField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    addcourse frame = new addcourse();
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
    public addcourse() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("课程名：");
        lblNewLabel.setBounds(110, 62, 60, 18);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("课程号：");
        lblNewLabel_1.setBounds(110, 121, 60, 18);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("学分：");
        lblNewLabel_2.setBounds(110, 170, 50, 18);
        contentPane.add(lblNewLabel_2);

        JLabel label = new JLabel("请输入添加课程信息");
        label.setBounds(123, 13, 208, 18);
        contentPane.add(label);

        cnametextField = new JTextField();
        cnametextField.setBounds(173, 59, 116, 24);
        contentPane.add(cnametextField);
        cnametextField.setColumns(10);

        idtextField_1 = new JTextField();
        idtextField_1.setBounds(173, 118, 116, 24);
        contentPane.add(idtextField_1);
        idtextField_1.setColumns(10);

        marktextField_2 = new JTextField();
        marktextField_2.setBounds(173, 167, 116, 24);
        contentPane.add(marktextField_2);
        marktextField_2.setColumns(10);

        JButton btnNewButton = new JButton("重置");
        btnNewButton.setBounds(57, 213, 113, 27);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("确定");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String id=idtextField_1.getText().toString();
                String cname=cnametextField.getText().toString();
                String cmark=marktextField_2.getText().toString();
                course a=new course();
                a.setCmark(cmark);
                a.setCname(cname);
                a.setId(id);
                courseDao c=new courseDao();
                boolean b=false;
                b=c.inset(a);
                if(b==true)
                {
                    JOptionPane.showMessageDialog(null, "添加成功");
                }
                if(b==false)
                {
                    JOptionPane.showMessageDialog(null, "添加失败");
                }
            }
        });
        btnNewButton_1.setBounds(242, 213, 113, 27);
        contentPane.add(btnNewButton_1);
    }

}

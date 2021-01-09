
package view;

        import java.awt.BorderLayout;
        import java.awt.EventQueue;

        import javax.swing.JFrame;
        import javax.swing.JPanel;
        import javax.swing.border.EmptyBorder;

        import DAO.StudentDao;
        import model.Student;

        import javax.swing.JLabel;
        import javax.swing.JTextField;
        import javax.swing.JButton;
        import java.awt.event.ActionListener;
        import java.awt.event.ActionEvent;
        import java.awt.Font;
        import java.awt.Toolkit;

public class query extends JFrame {

    private JPanel contentPane;
    private JTextField textField;


    public query() {

        setTitle("查询");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 420, 214);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("请输入学生姓名：");
        lblNewLabel.setFont(new Font("华文行楷", Font.PLAIN, 20));
        lblNewLabel.setBounds(50, 73, 166, 18);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(232, 70, 126, 24);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton button = new JButton("确定");
        button.setFont(new Font("华文行楷", Font.PLAIN, 15));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String uersname = textField.getText().toString();
                Student stu = new Student();
                StudentDao a = new StudentDao();

                stu = a.chazhao(uersname);
                lookFrame b = new lookFrame(stu);
                b.setVisible(true);
            }
        });
        button.setBounds(245, 127, 113, 27);
        contentPane.add(button);

        JButton button_1 = new JButton("重置");
        button_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        button_1.setBounds(71, 127, 113, 27);
        contentPane.add(button_1);
    }
}



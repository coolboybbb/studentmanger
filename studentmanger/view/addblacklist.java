package view;


        import java.awt.BorderLayout;
        import java.awt.EventQueue;

        import javax.swing.JFrame;
        import javax.swing.JPanel;
        import javax.swing.border.EmptyBorder;

        import DAO.addContact;

        import javax.swing.JLabel;
        import javax.swing.JOptionPane;
        import javax.swing.JTextField;
        import javax.swing.JButton;
        import java.awt.event.ActionListener;
        import java.awt.event.ActionEvent;
        import javax.swing.ImageIcon;
        import java.awt.Font;
        import java.awt.Toolkit;
        import java.awt.Color;

public class addblacklist extends JFrame {

    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    addblacklist frame = new addblacklist();
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
    public addblacklist() {
        setFont(new Font("华文行楷", Font.PLAIN, 12));
        setForeground(new Color(204, 204, 255));
        setTitle("吉首大学");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 443, 241);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("添加学生黑名单");
        label.setFont(new Font("华文行楷", Font.PLAIN, 20));
        label.setBounds(119, 31, 169, 35);
        contentPane.add(label);

        textField = new JTextField();
        textField.setBounds(208, 110, 137, 24);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel label_1 = new JLabel("输入加入黑名学生的username：");
        label_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
        label_1.setBounds(14, 113, 184, 18);
        contentPane.add(label_1);

        JButton button = new JButton("取消");
        button.setFont(new Font("华文行楷", Font.PLAIN, 15));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        button.setBounds(87, 158, 113, 27);
        contentPane.add(button);

        JButton button_1 = new JButton("确定");
        button_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String newName=textField.getText().toString();
                if("".equals(newName))
                {
                    JOptionPane.showMessageDialog(null, "请输入学号");

                }else {
                    addContact a=new addContact();
                    a.addblacklist(newName);

                }
            }
        });
        button_1.setBounds(246, 158, 113, 27);
        contentPane.add(button_1);
    }
}


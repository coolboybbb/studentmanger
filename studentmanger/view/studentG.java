package view;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Student;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;

public class studentG extends JFrame {

    private JPanel contentPane;
    private Object uersobject;
    /**
     * Launch the application.
     */
    //public static void main(String[] args) {
    //EventQueue.invokeLater(new Runnable() {
    //public void run() {
    //try {
    //		studentG frame = new studentG();
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
    public studentG(Student uersobject) {
        this.uersobject=uersobject;
        setTitle("学生界面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 603, 468);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("");
        menuBar.add(menu);

        JMenu menu_1 = new JMenu("系统设置");
        menuBar.add(menu_1);

        JMenuItem menuItem = new JMenuItem("修改密码");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editpassword a=new editpassword();
                a.setVisible(true);
            }
        });
        menu_1.add(menuItem);

        JMenu mnNewMenu = new JMenu("查询");
        menuBar.add(mnNewMenu);

        JMenuItem menuItem_1 = new JMenuItem("浏览个人信息");
        menuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lookFrame a=new lookFrame(uersobject);
                a.setVisible(true);
            }
        });
        mnNewMenu.add(menuItem_1);

        JMenu menu_2 = new JMenu("帮助");
        menuBar.add(menu_2);

        JMenuItem mntmNewMenuItem = new JMenuItem("关于我们");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                help(e);

            }

            private void help(ActionEvent e) {
                // TODO Auto-generated method stub
                String info="吉首大学出品/n";
                info+="网址：https://jwc.jsu.edu.cn/";
                String[] buttons= {"迫不及待，想去看看"};

                int ret=JOptionPane.showOptionDialog(null, info, "关于我们", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, null, buttons, null);
                if(ret==0)
                {
                    try {
                        URI uri=new URI("https://jwc.jsu.edu.cn/");
                        Desktop.getDesktop().browse(uri);

                    }catch(Exception e1)
                    {
                        e1.printStackTrace();
                    }

                }else {
                    JOptionPane.showMessageDialog(null, "你真狠心");
                }
            }

        });
        menu_2.add(mntmNewMenuItem);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }

}

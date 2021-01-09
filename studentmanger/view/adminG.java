package view;

import java.awt.BorderLayout;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.addcourse;
import model.Admin;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class adminG extends JFrame {

    private JPanel contentPane;
    private Admin admin;

    public adminG(Admin admin) {

        setTitle("管理界面");
        this.admin=admin;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 535, 371);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("系统设置");
        menu.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuBar.add(menu);

        JMenuItem menuItem = new JMenuItem("修改密码");
        menuItem.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adminEditpassword ae =new adminEditpassword();
                ae.setVisible(true);

            }
        });
        menu.add(menuItem);

        JMenu menu_1 = new JMenu("添加功能");
        menu_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuBar.add(menu_1);

        JMenuItem menuItem_1 = new JMenuItem("添加学生黑名单");//添加学生黑名单
        menuItem_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                addblacklist c=new addblacklist();
                c.setVisible(true);

            }
        });
        menu_1.add(menuItem_1);

        /*JMenuItem menuItem_2 = new JMenuItem("\u6DFB\u52A0\u5B66\u751F\u4FE1\u606F");//添加学生信息
        menuItem_2.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menu_1.add(menuItem_2);*/

        JMenuItem menuItem_6 = new JMenuItem("添加课程信息");
        menuItem_6.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuItem_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addcourse a=new addcourse();
                a.setVisible(true);
            }
        });
        menu_1.add(menuItem_6);

        /*JMenuItem mntmYichu = new JMenuItem("移出黑名单");
        mntmYichu.setFont(new Font("华文行楷", Font.PLAIN, 15));
        mntmYichu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                delect del=new delect();
                del.setVisible(true);
            }
        });
        menu_1.add(mntmYichu);*/

        JMenuItem menuItem_7 = new JMenuItem("查询学生是否在黑名单中");
        menuItem_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lookblacklist l=new lookblacklist();
                l.setVisible(true);
            }
        });
        menuItem_7.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menu_1.add(menuItem_7);

        JMenu menu_2 = new JMenu("帮助");
        menu_2.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuBar.add(menu_2);

        JMenuItem menuItem_3 = new JMenuItem("关于我们");
        menuItem_3.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuItem_3.addActionListener(new ActionListener() {
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
        menu_2.add(menuItem_3);

        JMenu menu_3 = new JMenu("浏览");
        menu_3.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuBar.add(menu_3);

        JMenuItem menuItem_4 = new JMenuItem("浏览个人信息");
        menuItem_4.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuItem_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Adminlook  al=new Adminlook(admin);
                al.setVisible(true);
            }
        });
        menu_3.add(menuItem_4);

        JMenu menu_4 = new JMenu("查询");
        menu_4.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuBar.add(menu_4);

        JMenuItem menuItem_5 = new JMenuItem("按学生username查询");
        menuItem_5.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuItem_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                query cx=new query();
                cx.setVisible(true);

            }
        });
        menu_4.add(menuItem_5);

        JMenu menu_5 = new JMenu("删除功能");
        menu_5.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menuBar.add(menu_5);

        JMenuItem mntmNewMenuItem = new JMenuItem("删除课程");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletecourse d=new deletecourse();
                d.setVisible(true);
            }
        });
        mntmNewMenuItem.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menu_5.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("删除学生信息");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletestudent dl=new deletestudent();
                dl.setVisible(true);
            }
        });
        mntmNewMenuItem_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
        menu_5.add(mntmNewMenuItem_1);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }

}
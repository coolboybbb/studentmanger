package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Admin;
import model.Student;
/**
 *
 * @author longshuangcai
 *
 */
public class StudentDao extends BaseDao{
    /**
     * 学生登录
     * @param student
     * @return  返回一个Student类
     * @see  java.sql.PreparedStatement
     * @exception  SQLException
     */
    public Student login(Student student)
    {
        String sql="select * from student where username=? and password=?";
        Student studentRst=null;
        try {
            PreparedStatement prst=con.prepareStatement(sql);
            prst.setString(1, student.getUsername());
            prst.setString(2, student.getPassword());
            ResultSet rs=prst.executeQuery();
            if(rs.next()) {
                studentRst=new Student();
                studentRst.setDepartment(rs.getString("department"));
                studentRst.setName(rs.getString("name"));
                studentRst.setPassword(rs.getString("password"));
                studentRst.setHomeTown(rs.getString("homeTown"));
                studentRst.setMark(rs.getString("mark"));
                studentRst.setSex(rs.getString("sex"));
                studentRst.setSno(rs.getString("sno"));
                studentRst.setUsername(rs.getString("username"));
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        try {
            con.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

        return studentRst;

    }
    /**
     * 浏览学生信息
     *@exception
     * @return SQLException
     */
    public Student look()
    {
        String sql="select * from student ";
        Student studentRst=null;
        try {
            PreparedStatement prst=con.prepareStatement(sql);


            ResultSet rs=prst.executeQuery();
            if(rs.next()) {
                studentRst=new Student();

                studentRst.setName(rs.getString("name"));
                studentRst.setPassword(rs.getString("password"));
                studentRst.setDepartment(rs.getString("department"));
                studentRst.setHomeTown(rs.getString("homeTown"));
                studentRst.setMark(rs.getString("mark"));
                studentRst.setSex(rs.getString("sex"));
                studentRst.setSno(rs.getString("sno"));
                studentRst.setUsername(rs.getString("username"));
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        try {
            con.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

        return studentRst;

    }


    public void update(String sno,String newpassword,String oldpassword)
    {
        String sqlString="update student set password=? where sno=? and password=?";

        try {
            PreparedStatement prst=con.prepareStatement(sqlString);
            prst.setString(1, newpassword);
            prst.setString(2, sno);
            prst.setString(3,oldpassword);
            int res=prst.executeUpdate();

            if(res>0) {
                JOptionPane.showMessageDialog(null, "密码修改成功");
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }


    }
    /**
     * 按照名称查找学生信息
     * @param username
     * @return
     */
    public Student chazhao(String username)
    {
        String sql="select * from student where username=?";
        Student studentRst=null;
        try {
            PreparedStatement prst=con.prepareStatement(sql);
            prst.setString(1, username);

            ResultSet rs=prst.executeQuery();
            if(rs.next()) {
                studentRst=new Student();
                studentRst.setDepartment(rs.getString("department"));
                studentRst.setName(rs.getString("name"));
                studentRst.setPassword(rs.getString("password"));
                studentRst.setHomeTown(rs.getString("homeTown"));
                studentRst.setMark(rs.getString("mark"));
                studentRst.setSex(rs.getString("sex"));
                studentRst.setSno(rs.getString("sno"));
                studentRst.setUsername(rs.getString("username"));
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        try {
            con.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

        return studentRst;

    }
    /**
     * 删除学生信息
     * @param sno
     */
    public void delect(String sno)
    {
        String sql="delete from student where sno=?";
        PreparedStatement prst;
        try {
            prst = con.prepareStatement(sql);
            prst.setString(1, sno);
            int affectedRows=prst.executeUpdate();
            if(affectedRows>0)
            {
                JOptionPane.showMessageDialog(null ,"该学生信息已删除");
            }else {
                JOptionPane.showMessageDialog(null,"信息有误请重新输入");
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

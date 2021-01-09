package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.course;



public class courseDao extends BaseDao{
    /**
     * 添加课程
     * @param course
     * @return  返回一个true或者false
     * @see java.sql.PreparedStatement
     */
    public boolean inset(course course) {
        String sql="insert into course values(?,?,?)";
        try {

            PreparedStatement prst=con.prepareStatement(sql);
            prst.setString(2, course.getId());
            prst.setString(1,course.getCname());
            prst.setString(3, course.getCmark());


            if (prst.executeUpdate()>0)
                return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 删除课程信息
     *
     * @param id 传入课程号
     *
     */
    public void delect(String id)
    {
        String sql="delete from course where id=?";
        PreparedStatement prst;
        try {
            prst = con.prepareStatement(sql);
            prst.setString(1, id);
            int affectedRows=prst.executeUpdate();
            if(affectedRows>0)
            {
                JOptionPane.showMessageDialog(null ,"该课程信息已删除");
            }else {
                JOptionPane.showMessageDialog(null,"信息有误请重新输入");
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

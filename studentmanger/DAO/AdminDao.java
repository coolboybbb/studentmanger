package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Admin;
import util.Dbutil;

public class AdminDao extends BaseDao{


    public Admin login(Admin admin)
    {
        String sql="select * from admin where uersname=? and password=?";
        Admin adminRst=null;
        try {
            PreparedStatement prst=con.prepareStatement(sql);
            prst.setString(1, admin.getUsername());
            prst.setString(2, admin.getPassword());
            ResultSet rs=prst.executeQuery();
            if(rs.next()) {
                adminRst=new Admin();
                adminRst.setUsername(rs.getString("uersname"));
                adminRst.setId(rs.getString("id"));
                adminRst.setName(rs.getString("name"));
                adminRst.setPassword(rs.getString("password"));

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

        return adminRst;

    }
    /**
     * 修改管理员密码
     * @param id
     * @param newpassword
     * @param oldpassword
     * @exception SQLException
     */
    public void adminupdate(String id,String newpassword,String oldpassword)
    {
        String sqlString="update admin set password=? where id=? and password=?";

        try {
            PreparedStatement prst=con.prepareStatement(sqlString);//替换变量
            prst.setString(1, newpassword);
            prst.setString(2, id);
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

}

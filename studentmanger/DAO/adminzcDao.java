package DAO;

import model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
/**
 *
 * @author longshuangcai
 * @version  2020.0705
 *
 */
public class adminzcDao extends BaseDao {
    /**
     *
     * @param admin
     * @return 返回一个admin类型
     *
     */
    public boolean inset(Admin admin) {
        String sql="insert into admin values(?,?, ?, ?)";
        try {

            PreparedStatement prst=con.prepareStatement(sql);
            prst.setString(1, admin.getId());
            prst.setString(2,admin.getName());
            prst.setString(3, admin.getUsername());
            prst.setString(4, admin.getPassword());

            if (prst.executeUpdate()>0)
                return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

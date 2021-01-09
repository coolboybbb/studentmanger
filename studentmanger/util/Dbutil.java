package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 * ????????????? (???????????)
 *
 * @author ??????
 *
 */
public class Dbutil {
    private static final String USER = "root";
    private static final String PWD = "123456";
    private static final String URL = "jdbc:mysql://localhost:3306/xt";

    Connection con=null;
    public Connection getCon(){
        try {

            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }try {

            con = DriverManager.getConnection(URL, USER, PWD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    public void closeCon(Connection con)throws Exception{
        if(con!=null)
        {
            con.close();
        }
    }
}



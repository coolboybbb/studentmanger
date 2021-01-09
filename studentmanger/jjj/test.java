package viewxjxt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //dataName是你需要连接的数据库名称
        String url="jdbc:sqlserver://localhost:1433;databaseName=School";
        String user = "sa";      //用户名
        String password = "123456";  //之前设置的密码
        try {
            //加载驱动
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                //建立连接
                Connection conn = DriverManager.getConnection(url, user, 	password);
                //输出conn
                System.out.println(conn);

                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
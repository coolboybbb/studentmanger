package DAO;

import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import javax.swing.JOptionPane;
/**
 * 注册学生账号和信息
 * @author Administrator
 *
 */
public class studentzcDao extends BaseDao {
    /**
     *
     * @param stu
     * @return 返回一个true或者一个false
     * @exception Exception
     *
     */
    public boolean inset(Student stu) {
        String sql="insert into student values(?,?,null,null,null,null,?, ?)";
        try {

            PreparedStatement prst=con.prepareStatement(sql);
            prst.setString(1, stu.getSno());
            prst.setString(2,stu.getName());
            prst.setString(3, stu.getUsername());
            prst.setString(4, stu.getPassword());

            if (prst.executeUpdate()>0)
                return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /*public void add_Info(String sno,String name,String sex,String department,String homeTown,int mark,String username,int password){
        String sql="insert into student values(?,?,?,?,?,?,?, ?)";
        try{
            PreparedStatement prst=con.prepareStatement(sql);
            prst.setString(1, sno);
            prst.setString(2,name);
            prst.setString(3, sex);
            prst.setString(4, department);
            prst.setString(5, homeTown);
            prst.setInt(6,mark);
            prst.setString(7, username);
            prst.setInt(8, password);
            prst.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    //length用户要求产生字符串的长度
    public String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(52);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public String getRandomSex(int length){
        String str="男女";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(2);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static void main(String[] args){
       studentzcDao sD=new studentzcDao();
       int i=10000;
       while(i>7000) {
           String sno = String.valueOf(i);
           String name = sD.getRandomString(4);
           String sex = sD.getRandomSex(1);
           String department = sD.getRandomString(10);
           String homeTown = sD.getRandomString(4);
           int mark = (int) (Math.random() * 9 + 1) * 10;
           String username = sD.getRandomString(4);
           int password = (int) (Math.random() * 9 + 1) * 1000;
           sD.add_Info(sno,name,sex,department,homeTown,mark,username,password);
           i--;
       }
    }*/
}
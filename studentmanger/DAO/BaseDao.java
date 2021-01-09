package DAO;

import java.sql.Connection;

import util.Dbutil;
/**
 * 链接数据库的工具类
 * @author longshuancai
 * @see  java.sql.Connection
 *
 */
public class BaseDao {
    public Connection con=new Dbutil().getCon();
}

package cn.com.nb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcTools {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private String url = "jdbc:mysql://140.143.78.200:3306/commerce?useUnicode=true&amp;characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true";
    private String username = "root";
    private String password = "xmxc1234";

    /**
     * 加载数据库驱动ß
     */
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("加载驱动失败...");
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库链接
     * @return
     */
    private Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url , username , password ) ;
        } catch (Exception e) {
            System.out.println("建立链接失败...");
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 执行指定sql
     * @param sql
     * @return
     */
    public boolean executeSql(String sql) throws Exception {
        try {
            connection = this.getConnection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            statement.execute(sql);
            connection.commit();
            return true;
        } catch (Exception e) {
            System.out.println("执行sql失败..." + sql);
            e.printStackTrace();
            connection.rollback();
            return false;
        } finally {
            this.close();
        }
    }

    /**
     * 关闭资源
     */
    private void close() {
        try {
            if (preparedStatement != null) preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (statement != null) statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (connection != null) connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package day01;

import java.sql.DriverManager;
import java.sql.SQLException;

public class 连接测试 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String username="root"; //用户名
        String pwd="123456"; //密码
        String driverClass="com.mysql.jdbc.Driver"; //驱动类名
        String url="jdbc:mysql://localhost:3306/db?characterEncoding=utf-8"; //连接地址

        Class.forName(driverClass); //1.加载驱动
        //连接地址，用户名，密码
        DriverManager.getConnection(url,username,pwd);//2.获得数据库连接



    }


}

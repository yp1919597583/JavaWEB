package com.zhibo.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

public class JdbcUtils {
    private static DruidDataSource dataSource;
   // private static Connection con=null;

    static {
        try {
            Properties properties = new Properties();
            //读取druid.properties配置文件
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            //从流中加载数据
            properties.load(inputStream);
            //创建连接池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        //获取数据库连接池中的链接
        Connection con =null;
        try {
            con = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void close(Connection connection) {
        //关闭数据库连接，放回数据库连接池
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}

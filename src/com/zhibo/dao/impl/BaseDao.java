package com.zhibo.dao.impl;

import com.zhibo.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {
    //抽象类一般为了复用代码

    /*使用dbutils操作数据库*/
    private QueryRunner queryRunner=new QueryRunner();

    public int update(String sql,Object ... args){
        //获取连接池中的连接
        Connection connection= JdbcUtils.getConnection();

        try {

        return  queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return -1;//执行失败
    }

    /**
     * 返回一个JavaBean对象的sql语句
     * @param type 返回的对象类型
     * @param sql sql语句
     * @param args sql语句的参数值
     * @param <T> 返回的类型的泛型
     * @return
     */
    public <T> T queryForOne(Class<T> type,String sql,Object ... args){
        Connection connection=JdbcUtils.getConnection();

        try {
            return    queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return null;
    }

    /**
     * 返回多个JavaBean对象的sql语句
     * @param type 返回的对象类型
     * @param sql sql语句
     * @param args sql语句的参数值
     * @param <T> 返回的类型的泛型
     * @return
     */

    //查询返回多个对象
    public  <T>List<T> queryForList(Class<T> type, String sql, Object ... args){
        Connection connection=JdbcUtils.getConnection();

        try {
            return  queryRunner.query(connection,sql,new BeanListHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return null;
    }


    /**
     * 返回某个列/行数据
     * @param sql sql语句
     * @param args sql语句的参数值
     * @return
     */

    //查询返回某个列/行数据
    public  Object queryForSingleValue(String sql, Object ... args){

        Connection connection=JdbcUtils.getConnection();
        try {
            return queryRunner.query(connection,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }

        return null;
    }





}

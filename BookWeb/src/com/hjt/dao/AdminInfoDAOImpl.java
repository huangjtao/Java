package com.hjt.dao;

import com.hjt.pojo.AdminInfo;
import com.hjt.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//实现AdminInfoDAO中所有的方法操作
public class AdminInfoDAOImpl implements AdminInfoDAO {
    @Override
    public int save(AdminInfo a) {
        int row = 0; //返回执行结果
        try {
            Connection conn = DBUtil.getConn(); //获取连接
            String sql = " insert into admininfo(id,username,password,picurl) values(?,?,?,?) "; //定义sql语句
            PreparedStatement pstm = conn.prepareStatement(sql); //预编译sql语句
            pstm.setInt(1, a.getId()); //绑定第一个参数
            pstm.setString(2, a.getUsername());//绑定第二个参数
            pstm.setString(3, a.getPassword());//绑定第三个参数
            pstm.setString(4, a.getPicurl());//绑定第四个参数
            row = pstm.executeUpdate(); //获得执行结果
            //关闭资源
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }



    @Override
    public int update(AdminInfo a) {
        int row = 0; //定义返回值
        try {
            Connection conn = DBUtil.getConn();
            //定义修改sql语句
            String sql = "update admininfo set username=? ,password=?,picurl=? where id=? ";
            //预编译sql语句 处理?
            PreparedStatement pstm = conn.prepareStatement(sql);
            //根据问号?位置绑定参数
            pstm.setString(1, a.getUsername());
            pstm.setString(2, a.getPassword());
            pstm.setString(3, a.getPicurl());
            pstm.setInt(4, a.getId());
            row = pstm.executeUpdate(); //执行操作 并获取执行结果
            //关闭资源
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public int delete(int id) {
        int row = 0; //定义返回值
        try {
            Connection conn = DBUtil.getConn();
            //定义修改sql语句
            String sql = "delete from admininfo  where id=? ";
            //预编译sql语句 处理?
            PreparedStatement pstm = conn.prepareStatement(sql);
            //根据问号?位置绑定参数
            pstm.setInt(1, id);
            row = pstm.executeUpdate(); //执行操作 并获取执行结果
            //关闭资源
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public List<AdminInfo> getAll() {
        //定义返回值的集合
        List<AdminInfo> admininfoList = new ArrayList<AdminInfo>();
        try {
            Connection conn = DBUtil.getConn();
            String sql = "select * from admininfo "; //查詢sql语句
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                AdminInfo a = new AdminInfo();
                a.setId(rs.getInt("id")); //获取adminid字段的值赋值给对象
                a.setUsername(rs.getString("username"));//获取username字段的值赋值给对象
                a.setPassword(rs.getString("password"));//获取password字段的值赋值给对象
                a.setPicurl(rs.getString("picurl"));//获取picurl字段的值赋值给对象
                admininfoList.add(a); //添加到集合
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admininfoList;
    }

    @Override
    public AdminInfo get(int id) {
        AdminInfo a = null;
        try {
            Connection conn = DBUtil.getConn();
            String sql = "select * from admininfo where id=? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery(); //执行查询 获取返回结果集
            while (rs.next()) {  //移动游标
                a = new AdminInfo();
                a.setId(rs.getInt("id")); //获取adminid字段的值赋值给对象
                a.setUsername(rs.getString("username"));//获取username字段的值赋值给对象
                a.setPassword(rs.getString("password"));//获取password字段的值赋值给对象
                a.setPicurl(rs.getString("picurl"));//获取picurl字段的值赋值给对象
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public List<AdminInfo> getPage(int pageNum, int pageSize) {
        return null;
    }
}

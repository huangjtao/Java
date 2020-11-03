package com.hjt.web;

import com.hjt.dao.AdminInfoDAO;
import com.hjt.dao.AdminInfoDAOImpl;
import com.hjt.pojo.AdminInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//管理员注册（添加）操作
@WebServlet("/admininfosave")
public class AdminSaveServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收中文时不乱码
        req.setCharacterEncoding("utf-8");
        //接收参数
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String picurl=req.getParameter("picurl");
        //将值放入admininfo对象中 封装
        AdminInfo a=new AdminInfo();
        a.setUsername(username);
        a.setPassword(password);
        a.setPicurl(picurl);
         //操作数据库
        AdminInfoDAO dao = new AdminInfoDAOImpl();
        dao.save(a);

        //页面跳转  重定向
        resp.sendRedirect("admininfolist");


    }
}

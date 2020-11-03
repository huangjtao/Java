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

//执行修改操作
@WebServlet("/admininfoupdate")
public class AdminInfoUpdateServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //接受中文不乱码
        req.setCharacterEncoding("utf-8");
        //接受参数
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String picurl = req.getParameter("picurl");
        String password = req.getParameter("password");
        //将值放入admininfo对象中  封装
        AdminInfo a = new AdminInfo();
        a.setId(Integer.parseInt(id));
        a.setUsername(username);
        a.setPassword(password);
        a.setPicurl(picurl);
        //操作数据库
        AdminInfoDAO dao = new AdminInfoDAOImpl();
        dao.update(a);//提交修改到数据库

        //页面跳转  重定向
        resp.sendRedirect("admininfolist");


    }
}

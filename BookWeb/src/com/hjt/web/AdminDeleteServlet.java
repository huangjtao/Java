package com.hjt.web;

import com.hjt.dao.AdminInfoDAO;
import com.hjt.dao.AdminInfoDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//删除管理员
@WebServlet("/adminDelete")
public class AdminDeleteServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        AdminInfoDAO dao=new AdminInfoDAOImpl();
        dao.delete(Integer.parseInt(id)); //删除
        //页面跳转
        resp.sendRedirect("admininfolist");
    }
}
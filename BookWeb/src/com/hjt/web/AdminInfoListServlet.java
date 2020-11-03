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
import java.util.List;

@WebServlet("/admininfolist")
public class AdminInfoListServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用数据库查询所有信息
        AdminInfoDAO dao=new AdminInfoDAOImpl();
        List<AdminInfo> allist = dao.getAll();
         //携带参数到页面 （参数名 ，参数值）
        req.setAttribute("adminList",allist);
        //页面跳转
        req.getRequestDispatcher("adminList.jsp").forward(req,resp);

    }
}

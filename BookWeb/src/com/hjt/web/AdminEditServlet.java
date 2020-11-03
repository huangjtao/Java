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

@WebServlet("/adminEdit")
public class AdminEditServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        AdminInfoDAO dao=new AdminInfoDAOImpl();
        int bid=Integer.parseInt(id);

        AdminInfo a=dao.get(bid);

        req.setAttribute("admin",a);

        req.getRequestDispatcher("adminEdit.jsp").forward(req,resp);



    }
}

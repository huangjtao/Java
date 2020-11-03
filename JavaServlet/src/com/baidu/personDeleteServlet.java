package com.baidu;

import util.PersonDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/personDelete")
public class personDeleteServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String idStr=request.getParameter("id");
        int id= Integer.parseInt(idStr); //字符串转整数

        PersonDAO dao = new PersonDAO();
        dao.delete(id);//删除
        //页面跳转 跳转到data.jsp页面
        request.getRequestDispatcher("data.jsp").forward(request,response);

    }
}

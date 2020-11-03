package com.baidu;

import util.Person;
import util.PersonDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/personSave")
public class PersonSaveServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String id=request.getParameter("id");
        String username=request.getParameter("username");
        String sex=request.getParameter("sex");

        Person p = new Person();
        p.setId(Integer.parseInt(id));
        p.setName(username);
        p.setSex(sex);

        PersonDAO dao = new PersonDAO();
        dao.save(p); //保存到数据库

        request.getRequestDispatcher("data.jsp").forward(request,response);

    }
}

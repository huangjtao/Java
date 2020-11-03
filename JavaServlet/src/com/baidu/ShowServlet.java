package com.baidu;


import util.Person;
import util.PersonDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/show.do")
public class ShowServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置接受参数的编码
        req.setCharacterEncoding("utf-8");
        //设置网页响应格式和编码
        resp.setContentType("text/html;charset=UTF-8");

        PersonDAO dao=new PersonDAO();//创建数据库操作对象
        List<Person> personList=dao.getAll();

        PrintWriter out=resp.getWriter();//获取输出
        out.println("<table border='1' bgcolor=\"#00FFFF\">");
        out.println("<tr>");
        out.println("<td>id</td>");
        out.println("<td>name</td>");
        out.println("<td>sex</td>");
        out.println("</tr>");
        //循环将集合中的内容输出
        for (Person person:personList){
            out.println("<tr>");
            out.println("<td>"+person.getId()+"</td>");
            out.println("<td>"+person.getName()+"</td>");
            out.println("<td>"+person.getSex()+"</td>");
            out.println("</tr>");

        }
        out.println("</table>");
        out.close();



    }
}

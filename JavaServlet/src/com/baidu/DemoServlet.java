package com.baidu;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long time=System.currentTimeMillis(); //时间毫秒数
        System.out.println("time = " + time);



        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter(); //获得输出
        out.println("<h1>恭喜你~~~~~</h1>");//输出内容
        out.println("<h3>访问成功</h3>");//输出内容
        out.println("<table border=\"2\">\n" +
                "      <tr>\n" +
                "        <td>学号</td>\n" +
                "        <td>姓名</td>\n" +
                "        <td>性别</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td>123456</td>\n" +
                "        <td>隔壁</td>\n" +
                "        <td>男</td>\n" +
                "      </tr>\n" +
                "    </table>");
        //out.println("<table border=\"2\"><tr><td>学号</td><td>姓名</td><td>性别</td></tr><tr><td>123456</td><td>隔壁</td><td>男</td></tr></table>");
        out.close();//关闭输出
    }

}

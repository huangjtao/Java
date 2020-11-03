package com.baidu;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//请求路径注解 配置该类的访问路径
//localhost:8888/hello
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
        //必须继承 才能处理网络请求


    /**
     *
     * @param req    处理请求 （接收参数）
     * @param resp   处理响应 （输出内容）
     * @throws ServletException
     * @throws IOException
     */

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long time=System.currentTimeMillis(); //时间毫秒数
        System.out.println("time = " + time);

        //接收网页传过来的参数 rep.getParameter("参数名")
        String id=req.getParameter("id");
        System.out.println("id = " + id);

        //设置接收参数的编码
        req.setCharacterEncoding("utf-8");


        String name=req.getParameter("name");
        System.out.println("name = " + name);
        String sex=req.getParameter("sex");
        System.out.println("sex = " + sex);

        //输出内容到网页
        //设置网页响应格式和编码
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter(); //获得输出
        out.println("<h1>恭喜你~~~~~</h1>");//输出内容
        out.println("<h1>访问成功</h1>");//输出内容
        out.println("<h1>it is true</h1>");
        out.close();//关闭输出


    }

}

package com.runoob.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloForm
 */
@WebServlet("/Up")
public class Up extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     *
     */
    public Up() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String name;
    private String password;

    public Up(String name,String password)
    {
        this.name=name;
        this.password=password;
    }
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String title = "message";
        // 处理中文
        name =new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
         password =new String(request.getParameter("pass").getBytes("ISO8859-1"),"UTF-8");
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>姓名</b>："
                + name + "\n" +
                "  <li><b>密码</b>："
                + password+ "\n" +
                "</ul>\n" +
                "</body></html>");


    }

    // 处理 POST 方法请求的方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public void display()
    {
        System.out.println(name);
        System.out.println(password);
    }
    public void search_in_DB()
    {

    }
}
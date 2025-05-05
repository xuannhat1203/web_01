package com.example.session01;import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BT03", value = "/BT03")
public class BT03 extends HttpServlet {
    private String name = "Nguyen Xuan Nhat";
    private int age = 20;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.getRequestDispatcher("/bt03.jsp").forward(request,response);
    }
}
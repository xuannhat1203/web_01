package com.example.session01;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "StudentTicketServlet", value = "/StudentTicketServlet")
public class StudentTicketServlet extends HttpServlet {
    public static students[] students = new students[] {
            new StudentImp("Nguyen Xuan Nhat", "10A1", "Xe dap", "123-ABC"),
            new StudentImp("Lai Hoang Nam", "11B2", "Xe may", "456-DEF"),
            new StudentImp("Nguyen Dinh Duong", "12C3", "Xe dap", "789-GHI"),
            new StudentImp("Pham Trung Hieu", "10A4", "Xe may", "012-JKL"),
            new StudentImp("Hoang Van E", "11B5", "Xe dap", "345-MNO")
    };
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("studentList", students);
        request.getRequestDispatcher("/bt07.jsp").forward(request, response);
    }
}

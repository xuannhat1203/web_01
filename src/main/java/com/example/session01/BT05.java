package com.example.session01;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BT05", value = "/BT05")
public class BT05 extends HttpServlet {
    private String message = "Lỗi chia cho 0";
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int result = 10/0;
            response.getWriter().print("Kết quả: "+ result);
        } catch (Exception e) {
            request.setAttribute("errorMessage", message);
            request.getRequestDispatcher("bt05.jsp").forward(request,response);
        }
    }
}
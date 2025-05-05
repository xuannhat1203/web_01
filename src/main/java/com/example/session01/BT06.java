package com.example.session01;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BT06", value = "/BT06")
public class BT06 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String studentName = request.getParameter("name");
        String className = request.getParameter("class");
        String vehicleType = request.getParameter("type");
        String numberPlate = request.getParameter("plate");
        if (studentName.isEmpty() || className.isEmpty() || vehicleType.isEmpty() || numberPlate.isEmpty()) {
            request.setAttribute("message", "Đăng kí thất bại vui lòng điền đầy đủ thông tin!!!");
        } else {
            request.setAttribute("message", "Đăng kí thành công!!");
        }
        request.getRequestDispatcher("/bt06.jsp").forward(request, response);
    }
}

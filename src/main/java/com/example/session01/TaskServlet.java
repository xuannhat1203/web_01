package com.example.session01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "TaskServlet", value = "/TaskServlet")
public class TaskServlet extends HttpServlet {
    private List<Task> taskList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("tasks", taskList);
        request.getRequestDispatcher("/bt08.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            String taskName = request.getParameter("taskName");
            if (taskName != null && !taskName.trim().isEmpty()) {
                taskList.add(new Task(taskName));
            }
        } else if ("complete".equals(action)) {
            int index = Integer.parseInt(request.getParameter("index"));
            if (index >= 0 && index < taskList.size()) {
                taskList.get(index).setCompleted(true);
            }
        }

        request.setAttribute("tasks", taskList);
        request.getRequestDispatcher("/bt08.jsp").forward(request, response);
    }
}

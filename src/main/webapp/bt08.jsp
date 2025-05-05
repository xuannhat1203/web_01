<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.session01.Task" %>

<%
  List<Task> tasks = (List<Task>) request.getAttribute("tasks");
%>
<!DOCTYPE html>
<html>
<head>
  <title>To-Do List</title>
  <style>
    body { font-family: Arial; padding: 20px; }
    table { width: 60%; border-collapse: collapse; margin-top: 20px; }
    th, td { border: 1px solid #333; padding: 10px; text-align: left; }
    .completed { text-decoration: line-through; color: gray; }
  </style>
</head>
<body>
<h1>To-Do List</h1>

<form action="TaskServlet" method="post">
  <input type="text" name="taskName" placeholder="Enter new task" required>
  <input type="hidden" name="action" value="add">
  <button type="submit">Add Task</button>
</form>

<% if (tasks != null && !tasks.isEmpty()) { %>
<table>
  <tr><th>#</th><th>Task</th><th>Status</th><th>Action</th></tr>
  <% for (int i = 0; i < tasks.size(); i++) {
    Task task = tasks.get(i);
  %>
  <tr>
    <td><%= i + 1 %></td>
    <td class="<%= task.isCompleted() ? "completed" : "" %>"><%= task.getName() %></td>
    <td><%= task.isCompleted() ? "Completed" : "Pending" %></td>
    <td>
      <% if (!task.isCompleted()) { %>
      <form action="TaskServlet" method="post" style="display:inline;">
        <input type="hidden" name="action" value="complete">
        <input type="hidden" name="index" value="<%= i %>">
        <button type="submit">Mark Done</button>
      </form>
      <% } %>
    </td>
  </tr>
  <% } %>
</table>
<% } %>

</body>
</html>

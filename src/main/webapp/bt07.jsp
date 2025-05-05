<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.session01.students" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h1>Student List</h1>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Class</th>
        <th>Vehicle Type</th>
        <th>Number Plate</th>
    </tr>
    <%
        students[] studentList = (students[]) request.getAttribute("studentList");
        if (studentList != null) {
            for (students student : studentList) {
    %>
    <tr>
        <td><%= student.getName() %></td>
        <td><%= student.getClassname() %></td>
        <td><%= student.getVehicleType() %></td>
        <td><%= student.getNumberPlate() %></td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>

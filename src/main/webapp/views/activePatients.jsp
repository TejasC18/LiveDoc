<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
    <%@page import="com.LiveDoc.dto.DoctorsDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctors</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body style="background-color: rgb(205, 216, 230);">
<nav id="navbar-example2" class="navbar navbar-light bg-light"></nav>
<div class="container">
<table class="table">
  <thead class="bg-primary">
    <tr>
      <th scope="col">Doctor ID</th>
      <th scope="col">Name</th>
      <th scope="col">Speciality</th>
      <th scope="col">Qualification</th>
      <th scope="col">Fees</th>
    </tr>
  </thead>
  <tbody>
  <%
List<DoctorsDTO> list = (List<DoctorsDTO>)request.getAttribute("doctorList");
for(DoctorsDTO objDoctor : list)
{
%>
    <tr>
      <th scope="row" style="background-color: white;"><%= objDoctor.getDoctorId()%></th>
      <td style="background-color: white;"><%= objDoctor.getFirstName() %> <%= objDoctor.getLastName() %></td>
      <td style="background-color: white;"><%= objDoctor.getDoctorType() %></td>
      <td style="background-color: white;"><%= objDoctor.getQualification() %></td>
      <td style="background-color: white;"><%= objDoctor.getEntryCharge() %></td>
    </tr>
<%
}
%>
  </tbody>
</table>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
    <%@page import="com.LiveDoc.dto.DoctorsDTO" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
      crossorigin="anonymous"
    />
    <style>
      html {
        font-size: 14px;
      }

      @media (min-width: 768px) {
        html {
          font-size: 16px;
        }
      }

      html {
        position: relative;
        min-height: 100%;
      }

      body {
        margin-bottom: 60px;
        background-image: url(https://images.unsplash.com/photo-1549793959-284bccc3331b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80);
        background-position: top center;
        background-size: cover;
      }
    </style>
    <link
      rel="stylesheet"
      href="https://kit.fontawesome.com/ecd45ca2c4.css"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" type="text/css" href="../css/index.css">
  </head>
  <body>
    <header>
      <nav
        class="navbar navbar-expand-lg navbar-light fixed-top py-3 d-block"
        data-navbar-on-scroll="data-navbar-on-scroll"
        style="background-color: white;"
      >
        <div class="container">
          <a class="navbar-brand" href="index.html"
            ><img src="../img/gallery/logo.png" width="118" alt="logo"
          /></a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"> </span>
          </button>
          <div
            class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0"
            style="margin-left: 1000px"
            id="navbarSupportedContent"
          >
            <a
              class="btn btn-sm btn-outline-primary rounded-pill order-1 order-lg-0 ms-lg-4"
              style=""
              href="/"
              >Home</a
            >
          </div>
        </div>
      </nav>
    </header>
    <div><br /><br /><br /><br /><br /></div>
    <div class="container" style="background-color: white">
      <main role="main" class="pb-3">
        <form class="d-flex col-4 p-2" action="/filter">
          <input
            class="form-control me-3"
            type="text"
            placeholder="Search"
            id="search"
            name="search"
          />
          <button class="btn btn-primary" type="submit">Search</button>
        </form>

        <div class="container pt-3">
          <div class="row">
            <div class="col-6">
              <h1 class="text-primary">Doctors</h1>
            </div>
            <div class="col-6 text-end">
              <a href="/login" class="btn btn-primary btn-sm">Book Appointment</a>
            </div>
          </div>

          <table class="table table-bordered table-striped" style="width: 100%">
            <thead>
            <tr>
            <th>Doctor ID</th>
            <th>Name</th>
            <th>Qualification</th>
            <th>Speciality</th>
            <th>Fees</th>
            </tr>
            </thead>
            <tbody>
            <%
            List<DoctorsDTO> list = (List<DoctorsDTO>)request.getAttribute("doctorList");
            for(DoctorsDTO objDoctor : list)
            {
            %>
              <tr>
                <td ><%= objDoctor.getDoctorId()%></td>
                <td ><%= objDoctor.getFirstName() %> <%= objDoctor.getLastName() %></td>
                <td ><%= objDoctor.getQualification()%></td>
                <td ><%= objDoctor.getDoctorType()%></td>
                <td ><%= objDoctor.getEntryCharge()%></td>
              </tr>
              <% } %>
            </tbody>
          </table>
        </div>
      </main>
    </div>

    <footer class="border-top footer text-dark">
      <div class="container">
        <p class="fs--1 my-2 fw-bold text-200">
                  All rights Reserved &copy; Your Company, 2023
                </p>
      </div>
    </footer>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
      crossorigin="anonymous"
    ></script>

    <script
      src="https://kit.fontawesome.com/ecd45ca2c4.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

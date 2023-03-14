<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.LiveDoc.dto.DoctorsDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
 <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
      crossorigin="anonymous"
    />
<style type="text/css">
body {
    margin: 0;
    padding-top: 40px;
    color: #2e323c;
    background: #f5f6fa;
    position: relative;
    height: 100%;
    background-image: url(https://images.unsplash.com/photo-1549793959-284bccc3331b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80);
        background-position: top center;
        background-size: cover;
}
.account-settings .user-profile {
    margin: 0 0 1rem 0;
    padding-bottom: 1rem;
    text-align: center;
}
.account-settings .user-profile .user-avatar {
    margin: 0 0 1rem 0;
}
.account-settings .user-profile .user-avatar img {
    width: 90px;
    height: 90px;
    -webkit-border-radius: 100px;
    -moz-border-radius: 100px;
    border-radius: 100px;
}
.account-settings .user-profile h5.user-name {
    margin: 0 0 0.5rem 0;
}
.account-settings .user-profile h6.user-email {
    margin: 0;
    font-size: 0.8rem;
    font-weight: 400;
    color: #9fa8b9;
}
.account-settings .about {
    margin: 2rem 0 0 0;
    text-align: center;
}
.account-settings .about h5 {
    margin: 0 0 15px 0;
    color: #007ae1;
}
.account-settings .about p {
    font-size: 0.825rem;
}
.form-control {
    border: 1px solid #cfd1d8;
    -webkit-border-radius: 2px;
    -moz-border-radius: 2px;
    border-radius: 2px;
    font-size: .825rem;
    background: #ffffff;
    color: #2e323c;
}

.card {
    background: #ffffff;
    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    border-radius: 5px;
    border: 0;
    margin-bottom: 1rem;
}

</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link
      rel="stylesheet"
      href="https://kit.fontawesome.com/ecd45ca2c4.css"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" type="text/css" href="/css/index.css">
</head>
<body>
<% DoctorsDTO objDoctors = (DoctorsDTO)request.getAttribute("showProfile");  %>
<% int userId = (int)request.getAttribute("userId"); %>
<header>
      <nav
        class="navbar navbar-expand-lg navbar-light fixed-top py-3 d-block"
        data-navbar-on-scroll="data-navbar-on-scroll"
        style="background-color: white;"
      >
        <div class="container">
          <a class="navbar-brand" href="index.html"
            ><img src="/img/gallery/logo.png" width="118" alt="logo"
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
            style="margin-left: 900px"
            id="navbarSupportedContent"
          >
            <a
              class="btn btn-sm btn-outline-primary rounded-pill order-1 order-lg-0 ms-lg-4"
              href="/doctor/<%=userId %>"
              >Home</a
            >
          </div>
        </div>
      </nav>
    </header>
    <div><br /><br /><br /><br /><br /></div>
<div class="container">
<div class="row gutters">
<div class="col-xl-3 col-lg-3 col-md-12 col-sm-12 col-12">
<div class="card h-100">
	<div class="card-body">
		<div class="account-settings">
			<div class="user-profile">
			<div><br> <br></div>
				<div class="user-avatar">
					<img src="https://bootdey.com/img/Content/avatar/avatar7.png" >
				</div>
				<h2 class="user-name"><%= objDoctors.getFirstName()%> <%= objDoctors.getLastName() %></h2>
				<h3 class="user-email"><%= objDoctors.getEmailId()%></h3>
			</div>
		</div>
	</div>
</div>
</div>
<div class="col-xl-9 col-lg-9 col-md-12 col-sm-12 col-12">
<div class="card h-100">
<div class="card-body">
		<div class="row gutters">
		<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
			<div class="form-group">
				<label for="phone">Doctor ID</label>
				<input type="text" class="form-control" placeholder="<%= objDoctors.getDoctorId() %>">
			</div>
		</div>
		<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
			<div class="form-group">
				<label for="phone">Fees</label>
				<input type="text" class="form-control" placeholder="<%= objDoctors.getEntryCharge() %>">
			</div>
		</div>
			<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
				<div class="form-group">
					<label for="fullName">First Name</label>
					<input type="text" class="form-control" placeholder="<%= objDoctors.getFirstName()%>">
				</div>
			</div>
			<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
				<div class="form-group">
					<label for="fullName">Last Name</label>
					<input type="text" class="form-control" placeholder="<%= objDoctors.getLastName() %>">
				</div>
			</div>
			<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
				<div class="form-group">
					<label for="eMail">Email ID</label>
					<input type="email" class="form-control" placeholder="<%= objDoctors.getEmailId()%>">
				</div>
			</div>
			<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
				<div class="form-group">
					<label for="phone">Phone Number</label>
					<input type="text" class="form-control" placeholder="<%= objDoctors.getContactNumber() %>">
				</div>
			</div>
			<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
				<div class="form-group">
					<label for="phone">Aadhar Card Number</label>
					<input type="text" class="form-control" placeholder="<%= objDoctors.getAadharCardNumber() %>">
				</div>
			</div>
			<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
				<div class="form-group">
					<label for="phone">Qualification</label>
					<input type="text" class="form-control" placeholder="<%= objDoctors.getQualification()%>">
				</div>
			</div>
			<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
				<div class="form-group">
					<label for="phone">Age</label>
					<input type="text" class="form-control" placeholder="<%= objDoctors.getAge() %>">
				</div>
			</div>
			<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
				<div class="form-group">
					<label for="phone">Speciality</label>
					<input type="text" class="form-control" placeholder="<%= objDoctors.getDoctorType() %>">
				</div>
			</div>
		</div>
</div>
</div>
</div>
</div>
</div>

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
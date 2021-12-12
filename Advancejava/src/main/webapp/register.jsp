<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration </title>
<%@include file="all_component/allcss.jsp" %>
</head>
<body>
<%@include file="all_component/navbar1.jsp" %>
<section class="h-100 bg-dark">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card card-registration my-4">
          <div class="row g-0">
            <div class="col-xl-6 d-none d-xl-block">
              <img
                src="https://mdbootstrap.com/img/Photos/new-templates/bootstrap-registration/img4.jpg"
                alt="Sample photo"
                class="img-fluid"
                style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;"
              />
            </div>
            <div class="col-xl-6">
              <div class="card-body p-md-5 text-black"> <form action="UserServlet" method="post">
                <h3 class="mb-5 text-uppercase"><i class="fa fa-user-plus" aria-hidden="true"></i>Registration form</h3>

                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" id="validationDefault01" class="form-control form-control-lg"  name="firstName"/>
                      <label class="form-label" for="validationDefault01">First name</label>
                    </div>
                  </div>
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" id="form3Example1n" class="form-control form-control-lg" name="lastName"/>
                      <label class="form-label" for="form3Example1n">Last name</label>
                    </div>
                  </div>
                </div>

                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" id="form3Example1m1" class="form-control form-control-lg" name="userId" />
                      <label class="form-label" for="form3Example1m1">UseId</label>
                    </div>
                  </div>
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="password" id="form3Example1n1" class="form-control form-control-lg" name="password" />
                      <label class="form-label" for="form3Example1n1">Password</label>
                    </div>
                  </div>
                </div>

                <div class="form-outline mb-4">
                  <input type="text" id="form3Example8" class="form-control form-control-lg" name="address"/>
                  <label class="form-label" for="form3Example8">Address</label>
                </div>


                <div class="row">
                                  <div class="col-md-6 mb-4">
                                    <div class="form-outline">
                                      <input type="text" id="form3Example1m1" class="form-control form-control-lg" name="state" />
                                      <label class="form-label" for="form3Example1m1">State</label>
                                    </div>
                                  </div>
                                  <div class="col-md-6 mb-4">
                                    <div class="form-outline">
                                      <input type="text" id="form3Example1n1" class="form-control form-control-lg" name="city" />
                                      <label class="form-label" for="form3Example1n1">City</label>
                                    </div>
                                  </div>
                                </div>

                <div class="form-outline mb-4">
                  <input type="text" id="form3Example9" class="form-control form-control-lg" name="country"/>
                  <label class="form-label" for="form3Example9">Country</label>
                </div>

                <div class="form-outline mb-4">
                  <input type="text" id="form3Example90" class="form-control form-control-lg" name="zip"/>
                  <label class="form-label" for="form3Example90">Zip</label>
                </div>

                <div class="form-outline mb-4">
                  <input type="text" id="form3Example99" class="form-control form-control-lg" name="phone"/>
                  <label class="form-label" for="form3Example99">Phone</label>
                </div>


                <div class="d-flex justify-content-end pt-3">

                  <button type="submit" class="btn btn-primary">Sign Up</button>
                  <a href="login.jsp" class="btn btn-light my-2 my-sm-0 mr-2" type="submit"><i class="fa fa-user" aria-hidden="true"></i>Login</a>

                </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>
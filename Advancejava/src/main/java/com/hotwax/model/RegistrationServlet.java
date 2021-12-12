package com.hotwax.model;

import com.hotwax.bean.StudentRegistration;
import com.hotwax.bean.StudentLogin;
import com.hotwax.dao.StudentUpdateDao;
import com.hotwax.dao.StudentRegistrationDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UserServlet")
public class RegistrationServlet extends HttpServlet {


    private StudentRegistration RegisterInfo = null;
    private StudentLogin LoginInfo = null;



    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        //int partyId=Integer.parseInt(request.getParameter("partyId"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String state = request.getParameter("state");
        String city = request.getParameter("city");
        String zip = request.getParameter("zip");
        String country = request.getParameter("country");

        String phone = request.getParameter("phone");

        if (firstName.isEmpty()) {
            out.println("First Name is required!");
            return;
        }

        if (lastName.isEmpty()) {
            out.println("Last Name is required!");
            return;
        }

        if (address.isEmpty()) {
            out.println("Address  is required!");
            return;
        }
        if (state.isEmpty()) {
            out.println("State is required!");
            return;
        }

        if (city.isEmpty()) {
            out.println("City is required!");
            return;
        }

        if (zip.isEmpty()) {
            out.println("Zip is required!");
            return;
        }

        if (country.isEmpty()) {
            out.println("Country is required!");
            return;
        }

        if (phone.isEmpty()) {
            out.println("Phone is required!");
            return;
        }


        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        //  int partyId=Integer.parseInt(request.getParameter("partyId"));
        if (StudentUpdateDao.findUser(userId)) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.jsp");
            HttpSession httpSession = request.getSession(false);
            httpSession.setAttribute("message", "User Login Id already exists! Please try again!");
            requestDispatcher.forward(request, response);
            return;
        }
        RegisterInfo = new StudentRegistration(firstName, lastName, address, state, city, zip, country, phone);
        LoginInfo = new StudentLogin(userId, password);
        StudentRegistrationDao.addUser(RegisterInfo, LoginInfo);
        out.print("Successfully Registered!!");
        HttpSession httpSession = request.getSession(true);
        httpSession.setAttribute("message", "Registration Successful!!");
        response.sendRedirect("login.jsp");
        return;

    }


}


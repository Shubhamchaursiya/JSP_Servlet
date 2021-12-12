package com.hotwax.model;

import com.hotwax.bean.StudentLogin;
import com.hotwax.dao.StudentLoginDao;
import com.hotwax.helper.DataBaseConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        StudentLogin studentLogin = new StudentLogin(userId, password);
        StudentLoginDao studentLoginDao = new StudentLoginDao(DataBaseConnection.getConnection());


        boolean result=studentLoginDao.userLogin(studentLogin);

        if (result) {

            RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
            dispatcher.forward(request, response);
//            response.sendRedirect("home.jsp");
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("login failed", "Invalid user name and password");
            response.sendRedirect("login.jsp");
        }




    }

}

package com.hotwax.model;


import com.hotwax.helper.DataBaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Update")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try {
            Connection connection = DataBaseConnection.getConnection();

            String partyId = (String) session.getAttribute("partyId");

            String updateQuery = "UPDATE party SET firstName = ?, lastName = ?, address=?, state = ?, city = ?, zip = ?, " +
                    "country = ?, phone = ? WHERE partyId =" + partyId;

            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, request.getParameter("firstName"));
            preparedStatement.setString(2, request.getParameter("lastName"));
            preparedStatement.setString(3, request.getParameter("address"));
            preparedStatement.setString(4, request.getParameter("state"));
            preparedStatement.setString(5, request.getParameter("city"));
            preparedStatement.setString(6, request.getParameter("zip"));
            preparedStatement.setString(7, request.getParameter("country"));
            preparedStatement.setString(8, request.getParameter("phone"));
            preparedStatement.executeUpdate();

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
            requestDispatcher.include(request, response);
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

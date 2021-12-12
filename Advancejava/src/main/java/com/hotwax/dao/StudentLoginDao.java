package com.hotwax.dao;


import com.hotwax.bean.StudentLogin;

import java.sql.*;

public class StudentLoginDao {
    private Connection connection;

    public StudentLoginDao(Connection connection) {
        this.connection = connection;
    }

    public boolean userLogin(StudentLogin studentLogin) {

        boolean user = false;

        try {
            String query = "select * from userLogin where userId=? and password=? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, studentLogin.getUserId());
            preparedStatement.setString(2, studentLogin.getPassword());

            ResultSet resultSet=preparedStatement.executeQuery();

            if (resultSet.next()) {

               return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
}


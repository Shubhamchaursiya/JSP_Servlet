package com.hotwax.dao;

import com.hotwax.helper.DataBaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentUpdateDao {
    public static boolean findUser(String userId) {
        boolean result = false;
        String query = "select userId from userLogin where userId='" + userId + "'";

        Connection con = DataBaseConnection.getConnection();
        try (Statement stmt = con.createStatement()) {
            ResultSet resultSet = stmt.executeQuery(query);
            if (resultSet.next())
                return true;
            else
                return false;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception in Finding");
        }
        return result;
    }


}

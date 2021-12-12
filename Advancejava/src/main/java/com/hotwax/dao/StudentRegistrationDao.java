package com.hotwax.dao;

import com.hotwax.bean.StudentRegistration;
import com.hotwax.bean.StudentLogin;
import com.hotwax.helper.DataBaseConnection;

import java.sql.*;

public class StudentRegistrationDao {
    public StudentRegistrationDao()
    {

    }

    public static boolean addUser(StudentRegistration sf, StudentLogin login)
    {
        Connection connection = DataBaseConnection.getConnection();
        int max = 0;
        String query2 = "select max(partyId) from party";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(query2);
            if (rs.next()) {
                max = rs.getInt(1) + 1;
                System.out.println("Max Id " + max);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean f=false;
        try
        {
            String query="INSERT INTO `servlet`.`party` (`partyId`, `firstName`, `lastName`, `address`, " +
                    "`state`, `city`, `zip`, `country`, `phone`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement=connection.prepareStatement(query);

            preparedStatement.setInt(1,max);
            preparedStatement.setString(2,sf.getFirstName());
            preparedStatement.setString(3, sf.getLastName());
            preparedStatement.setString(4, sf.getAddress());
            preparedStatement.setString(5, sf.getState());
            preparedStatement.setString(6, sf.getCity());
            preparedStatement.setString(7,sf.getZip());
            preparedStatement.setString(8,sf.getCountry());
            preparedStatement.setString(9, sf.getPhone());
            preparedStatement.executeUpdate();
            preparedStatement.close();

            String query1 = "INSERT INTO `servlet`.`userLogin` (`userId`, `password`, `partyId`) VALUES (?, ?, ?)";
            String loginId = login.getUserId();
            String password = login.getPassword();

            PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
            preparedStatement1.setString(1, loginId);
            preparedStatement1.setString(2, password);
            preparedStatement1.setInt(3, max);

            preparedStatement1.executeUpdate();
            preparedStatement1.close();

            int i=preparedStatement1.executeUpdate();

            if(i==1)
            {
                f=true;
            }
            preparedStatement1.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }

        return f;

    }
}

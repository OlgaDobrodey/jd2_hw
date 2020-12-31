package it.academy;

import java.sql.*;

public class task5 {
    public static void main(String[] args) {

        String tempplate = "select * from home_work.expenses where cost>?";
        String display = "select * from  home_work.expenses;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/home_work",
                        "root", "root");
                PreparedStatement pStatement = connection.prepareStatement(tempplate);
                pStatement.setFloat(1,13000);
                ResultSet resultSet = pStatement.executeQuery();
                while (resultSet.next()) {
                    int num = resultSet.getInt(1);
                    Date payDate = resultSet.getDate(2);
                    int receiver = resultSet.getInt(3);
                    double cost = resultSet.getDouble(4);
                    System.out.println("number = " + num
                            + " payDate = " + payDate
                            + " receiver = " + receiver
                            + " cost=" + cost);

                }

                resultSet.close();

                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


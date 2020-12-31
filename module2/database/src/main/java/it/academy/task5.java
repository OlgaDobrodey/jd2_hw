package it.academy;

import java.sql.*;

public class task5 {
    public static void main(String[] args) {
    //    String zaprosOnInto = " insert into home_work.expenses (num,paydate,receiver,cost) values (" + args[0] + ");";
        String tempplate = "select * from home_work.expenses where cost>?";
        String display = "select * from  home_work.expenses;";
       // System.out.println(args[0]);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/home_work",
                        "root", "root");
                PreparedStatement pStatement = connection.prepareStatement(tempplate);
                pStatement.setFloat(1,3000);
               // final Statement statement = connection.createStatement();
                //int resultSet1 = statement.executeUpdate(zaprosOnInto);
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
              //  statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


package it.academy;

import java.sql.*;

public class task4 {

    final static String DISPLAY = "select * from  home_work.expenses;";
    final static String REQUEST = " insert into home_work.expenses (num,paydate,receiver,cost) values (";
    final static String URL = "jdbc:mysql://localhost:3306/home_work";
    final static String USER = "root";
    final static String PASSWORD = "root";
    final static String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        //"8,'2011-5-10',3, 24200"
        if (args.length == 1) {
            String expenses = CheckLine.linProcessing(args[0]); // check args on format our database
            if (!(expenses == null)) {
                String requestOnInto = REQUEST + expenses + ");";
                try {
                    Class.forName(DRIVER);
                    try {
                        final Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                        final Statement statement = connection.createStatement();
                        int resultSet1 = statement.executeUpdate(requestOnInto);    //in on our database
                        ResultSet resultSet = statement.executeQuery(DISPLAY);      // select database on display
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
                        statement.close();
                        connection.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }else{ System.out.println("Enter ONE the expenses in the format:\n"
                + "\"num_expenses,'YYYY-MM-DD',number receiver,cost \"");}
    }
}

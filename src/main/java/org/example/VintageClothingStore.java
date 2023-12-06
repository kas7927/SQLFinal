package org.example;
import java.sql.*;

public class VintageClothingStore {

    //defining your url, username, and password.
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/VintageClothingStore";
        String username = "root";
        String password = "salem123#";

        //Connecting to the MYSQL database
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("Connected to the database!");

                Statement stmt = connection.createStatement();

                // Insert data into the customers table changes because need different primary key
                //String insertInfo = "INSERT INTO customers VALUES (5, 'Jerry Cook', 'JCook123@psu.edu')";
                //System.out.println("Your data has been inserted: " + insertInfo);
                //int inserted = stmt.executeUpdate(insertInfo);

                //Deleting data from the database
                String deleteInfo = "DELETE FROM customers WHERE custId = 4";
                System.out.println("Your data has been deleted: " + deleteInfo);
                int deleted = stmt.executeUpdate(deleteInfo);

            }
            //Exception handling
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
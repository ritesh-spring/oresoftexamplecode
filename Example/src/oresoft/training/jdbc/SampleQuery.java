/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oresoft.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class SampleQuery
{
    public static void main(String[] args) throws Exception
    {
        Connection connection = null;
        try
        {
            // Here we load the MySQL database Driver class
            Class.forName("com.mysql.jdbc.Driver");

            // Define properties for connecting to database such as
            // database jdbc url, username and password
            String url = "jdbc:mysql://localhost/test";
            String username = "root";
            String password = "baramunda1";

            // Get a connection to database.
            connection = DriverManager.getConnection(url, username, password);
            // Create a statment object.
            Statement statement = connection.createStatement();
            // Executes a query command to select isbn and the book title
            // from books table. The execute query returns a ResultSet object
            // which is the result of our query execution.
            ResultSet rset = statement.executeQuery("SELECT test_id,test_name FROM test");

            // To get the value returned by the statement.executeQuery we need
            // to iterate the books object until the last items.
            while (rset.next())
            {
                // To get the value from the ResultSet object we can call
                // a method that correspond to the data type of the column in
                // database table. In the example below we call
                // books.getString("isbn") to get the book's ISBN information.
                System.out.println(rset.getString("test_id") + "; "
                        + rset.getString("test_name") + "; " );
            }
        } finally {
            if (connection != null && !connection.isClosed())
            {
                // We've done the business with the connection object, so
                // let's close it.
                connection.close();
            }
        }
    }
}

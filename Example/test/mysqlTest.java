/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bnayak
 */

import java.sql.DriverManager;
import java.sql.Connection;

public class mysqlTest {

     // Below is the format of jdbc url for MySql database.
    public static final String URL =
        "jdbc:mysql://192.168.1.6:3306/joomla";

    // The username for connecting to the database
    public static final String USERNAME = "root";

    // The password for connecting to the database
    public static final String PASSWORD = "baramunda1";

    public static void main(String[] args) throws Exception
    {
        Connection connection = null;
        try
        {
        
            Class.forName("com.mysql.jdbc.Driver");

           
            connection = DriverManager.getConnection(URL,
                USERNAME, PASSWORD);

        } finally
        {
            if (connection != null)
            {
                connection.close();
            }
        }
    }


}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oresoft.training.jdbc;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaData {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "baramunda1";

    public static void main(String[] args) throws Exception {
        Connection connection = null;
	try {
	    Class.forName(DRIVER);
	    connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

	    DatabaseMetaData metadata = connection.getMetaData();
	    ResultSet resultSet = metadata.getColumns(null, null, "test", null);
	    while (resultSet.next()) {
		String name = resultSet.getString("COLUMN_NAME");
		String type = resultSet.getString("TYPE_NAME");
		int size = resultSet.getInt("COLUMN_SIZE");

		System.out.println("Column name: [" + name + "]; type: [" + type
		    + "]; size: [" + size + "]");
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    connection.close();
	}
    }
}

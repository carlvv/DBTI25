package fhwedel.JDBC;

import java.sql.*;

public class Hello {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://192.168.64.2:3306/firma",
                "user", "user"
        );


    }
}

package fhwedel.JDBC;

import java.sql.*;
import static fhwedel.JDBC.SimpleOperations.*;

public class Main {

    static Connection createConnection() throws SQLException {
        //Aufgabe 1
        return DriverManager.getConnection(
                //"jdbc:mariadb://192.168.64.2:3306/firma",
                "jdbc:mariadb://192.168.56.102:3306/firma",
                "user", "user"
        );
    }

    public static void main(String[] args) throws SQLException {
        try (Connection vmConnection = createConnection()) {
            aufgabe3(vmConnection);
        }
    }
}

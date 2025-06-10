package fhwedel.JDBC;

import java.sql.*;
import static fhwedel.JDBC.SimpleOperations.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection vmConnection = createConnection()) {
            aufgabe3(vmConnection);
        }
    }
}

package fhwedel.JDBC;

import java.sql.*;

public class SchemaMigration {

    static void migrate(Connection connection) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(
                "create table personal_neu ()")){
            ResultSet resultSet = statement.executeQuery();
        }
    }

}

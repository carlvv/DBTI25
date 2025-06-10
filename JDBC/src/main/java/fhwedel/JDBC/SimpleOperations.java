package fhwedel.JDBC;

import java.sql.*;

public class SimpleOperations {

    static Connection createConnection() throws SQLException {
        //Aufgabe 1
        return DriverManager.getConnection(
                "jdbc:mariadb://192.168.64.2:3306/firma",
                "user", "user"
        );
    }

    static void aufgabe2(Connection connection) throws SQLException {
        //Aufgabe 2
        try (PreparedStatement statement = connection.prepareStatement(
                "insert into personal(pnr, name, vorname, geh_stufe, abt_nr, krankenkasse)\n" +
                        "values (417, 'Krause', 'Henrik', 'it1', 'd13', 'tkk');")){
            ResultSet resultSet = statement.executeQuery();
        }
    }

    static void aufgabe3(Connection connection) throws SQLException {
        //Aufgabe 3
        try (PreparedStatement statement = connection.prepareStatement(
                "select * from personal")){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("pnr") + " ");
                System.out.print(resultSet.getString("name") + " ");
                System.out.print(resultSet.getString("vorname") + " ");
                System.out.print(resultSet.getString("geh_stufe") + " ");
                System.out.print(resultSet.getString("abt_nr") + " ");
                System.out.print(resultSet.getString("krankenkasse") + " \n");
            }
        }
    }

    static void aufgabe4(Connection connection) throws SQLException {
        //Aufgabe 4
        try (PreparedStatement statement = connection.prepareStatement(
                "update gehalt set betrag = betrag  * 1.1 where geh_stufe = 'it1';")){
            ResultSet resultSet = statement.executeQuery();
        }
    }

    static void aufgabe5(Connection connection) throws SQLException {
        //Aufgabe 5
        try (PreparedStatement statement = connection.prepareStatement(
                "delete FROM personal where  name = 'Tietze' and vorname = 'Lutz';")){
            ResultSet resultSet = statement.executeQuery();
        }
    }

    static void aufgabe6(Connection connection) throws SQLException {
        //Aufgabe 6
        try (PreparedStatement statement = connection.prepareStatement(
                "select personal.name, personal.vorname from personal " +
                        "join abteilung where abteilung.name = 'verkauf';")){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getString("name") + " ");
                System.out.print(resultSet.getString("vorname") + "\n");
            }
        }
    }

}

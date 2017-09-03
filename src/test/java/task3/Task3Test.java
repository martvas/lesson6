package task3;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.*;

public class Task3Test {
    private static Connection connection;
    private static Statement statement;
    private static Savepoint saveBeforeEdit;

    @BeforeClass
    public static void start() throws Exception {
        connect();
        statement = connection.createStatement();
        saveBeforeEdit = connection.setSavepoint();
    }

    @Test
    public void addNewStudent() throws SQLException {
        int result = statement.executeUpdate("INSERT INTO Students (Surname, Score) VALUES ('Naton', 8)");
        Assert.assertEquals(1, result);
    }

    @Test
    public void updateStudent() throws SQLException {
        int result = statement.executeUpdate("UPDATE Students SET Score = 100 WHERE Surname = 'Saveljev'");
        Assert.assertEquals(1, result);
    }

    @Test
    public void selectStudent() throws SQLException {
        boolean result = statement.execute("SELECT Score FROM Students WHERE Surname = 'Lisov'");
        System.out.println(result);
        Assert.assertTrue("true", result);
    }

    @AfterClass
    public static void disconnectFromDb() throws SQLException {
        connection.rollback(saveBeforeEdit);
        disconnect();
    }

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Students.db");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

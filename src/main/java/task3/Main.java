package task3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
Создать небольшую БД (таблица: студенты; поля: id, фамилия, балл). Написать тесты для
проверки того, что при работе с базой корректно добавляются, обновляются и читаются
записи. Следует учесть что в базе есть заранее добавленные записи, и после проведения
тестов эти записи не должны быть удалены/изменены/добавлены.
 */

public class Main {
    private static Connection connection;

    public static void main(String[] args) {
        //sozdatj bazu i td
        connect();
        disconnect();
    }


    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:DBForProducts.db");
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


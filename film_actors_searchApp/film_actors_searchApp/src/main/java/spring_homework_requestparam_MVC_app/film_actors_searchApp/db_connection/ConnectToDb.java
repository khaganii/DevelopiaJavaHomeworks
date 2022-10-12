package spring_homework_requestparam_MVC_app.film_actors_searchApp.db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDb {
    private static final String url = "jdbc:mysql://localhost:3306/sakila";
    private static final String user = "root";
    private static final String pass = "Cavidan1Tunar2";
    private static Connection con;

    public static Connection getConnection() throws SQLException {
         con = DriverManager.getConnection(url, user, pass);
         return con;
    }
}

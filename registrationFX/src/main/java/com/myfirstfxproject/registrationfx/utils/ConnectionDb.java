package com.myfirstfxproject.registrationfx.utils;

import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Data
public class ConnectionDb {
    private String dbUser = "root";
    private String password = "Cavidan1Tunar2";


    private final String connectionString = "jdbc:mysql://localhost:3306/registrationfx?useSSL=false";

    public Connection getConnection() {
        Connection connection;
        try{
            connection = DriverManager.getConnection(connectionString, dbUser, password);
            return connection;
        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}

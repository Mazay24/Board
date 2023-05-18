package com.example.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQL {
    private static final String URL = "jdbc:postgresql://localhost:5432/Board";
    private static final String USERMAME = "postgres";
    private static final String PASSWORD = "1402200Ii.";
    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(URL, USERMAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private PostgreSQL(){}// патерн Singleton
    public static Connection getConnection() throws SQLException {
        if (connection == null){
            connection = DriverManager.getConnection(URL, USERMAME, PASSWORD);
        }
        return connection;
    }
}

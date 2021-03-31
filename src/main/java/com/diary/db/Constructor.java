package com.diary.db;

import com.diary.db.Connector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Constructor {

    Connector connector = new Connector();
    Statement statement = null;
    Connection connection;
    String SQL;
    String paramName;

    public void dataInsert(String SQL, String paramName) throws SQLException {
        try {
            this.SQL = SQL;
            this.paramName = paramName;
            connection = connector.connect();
            statement = connection.createStatement();
            statement.executeUpdate(SQL);
            System.out.println(paramName + " successfully created...");
        } finally {
            if (connection != null) {
                connection.close();
                System.out.println("Connections closed.");
            }
        }
    }
}


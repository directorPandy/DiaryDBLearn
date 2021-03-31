package com.diary.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Incrementator {

    Connector connector = new Connector();
    Statement statement = null;
    Connection connection;

    public void teachersInserter() throws SQLException {
        try{
            connection = connector.connect();
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO teachers " +
                    "VALUES (1001, 'Alexandra', 'PHYSICS')");
            System.out.println("Record TEACHER successfully inserted!");
        }finally {
            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        }
    }

    public void studentInserter() throws SQLException {
        try{
            connection = connector.connect();
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO students " +
                    "VALUES (2002, 'mr. smith', '2A')");
            System.out.println("Record student successfully inserted!");
        }finally {
            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        }
    }

    public void classInserter() throws SQLException {
        try{
            connection = connector.connect();
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO students " +
                    "VALUES (3003, '2A')");
            System.out.println("Record class successfully inserted!");
        }finally {
            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        }
    }
}

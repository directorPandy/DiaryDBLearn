package com.diary.db;

import com.diary.db.Connector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Constructor {

    Connector connector = new Connector();
    Statement statement = null;
    Connection connection;

    public void tableTeachersCreate() throws SQLException {
    try{
        connection = connector.connect();
        statement = connection.createStatement();
        String SQL = "CREATE TABLE teachers " +
                "(id INTEGER not NULL, " +
                "name VARCHAR (50), " +
                "spesialitet VARCHAR (50), " +
                "PRIMARY KEY(id))";
        statement.executeUpdate(SQL);
        System.out.println("Table TEACHERS successfully created...");
    }finally {
        if(statement!=null){
            statement.close();
        }
        if(connection!=null){
            connection.close();
        }
    }
}

    public void tableStudentsCreate() throws SQLException {
        try{
            connection = connector.connect();
            statement = connection.createStatement();
            String SQL = "CREATE TABLE students " +
                    "(id INTEGER not NULL, " +
                    "name VARCHAR (50), " +
                    "class VARCHAR (50), " +
                    "PRIMARY KEY(id))";
            statement.executeUpdate(SQL);
            System.out.println("Table STUDENT successfully created...");
        }finally {
            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        }
    }

    public void tableClassCreate() throws SQLException {
        try{
            connection = connector.connect();
            statement = connection.createStatement();
            String SQL = "CREATE TABLE class " +
                    "(id INTEGER not NULL, " +
                    "number INTEGER, " +
                    "PRIMARY KEY(id))";
            statement.executeUpdate(SQL);
            System.out.println("Table CLASS successfully created...");
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
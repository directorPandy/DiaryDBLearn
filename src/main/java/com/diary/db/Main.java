package com.diary.db;

import com.diary.db.Constructor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        Constructor constructor = new Constructor();
        constructor.dataInsert("CREATE TABLE teachers " +
                "(id INTEGER not NULL, " +
                "name VARCHAR (50), " +
                "specificity VARCHAR (50), " +
                "PRIMARY KEY(id))", "Table teachers");

        constructor.dataInsert("CREATE TABLE students " +
                "(id INTEGER not NULL, " +
                "name VARCHAR (50), " +
                "class VARCHAR (50), " +
                "PRIMARY KEY(id))", "Table students");

        constructor.dataInsert("CREATE TABLE class " +
                "(id INTEGER not NULL, " +
                "number VARCHAR (50), " +
                "PRIMARY KEY(id))", "Table class");

        constructor.dataInsert("INSERT INTO teachers " +
                "VALUES (3003, 'Alexandra', 'physics')", "Record student");

        constructor.dataInsert("INSERT INTO students " +
                "VALUES (3003, 'Alexandr' , '2A')", "Record student");

        constructor.dataInsert("INSERT INTO class " +
                "VALUES (3003, '2A')", "Record class");

        Harvester harvester = new Harvester();
        harvester.teachersHarvest();
        harvester.classHarvest();
        harvester.studentHarvest();

    }
}
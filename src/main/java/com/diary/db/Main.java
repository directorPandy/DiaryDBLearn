package com.diary.db;

import com.diary.db.Constructor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        PreparedStatement preparedStatement = null;
        Constructor constructor = new Constructor();
        constructor.tableClassCreate();
        constructor.tableStudentsCreate();
        constructor.tableTeachersCreate();
        Incrementator incrementator = new Incrementator();
        incrementator.classInserter();
        incrementator.studentInserter();
        incrementator.teachersInserter();
        Harvester harvester = new Harvester();
        harvester.classHarvest();
        harvester.studentHarvest();
        harvester.teachersHarvest();
    }
}

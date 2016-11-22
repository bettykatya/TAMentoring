package com.epam.tamentoring.preselection.Database;

import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.*;

public class RunnerDatabase {
    private static String dbURL = "jdbc:derby://localhost:8948/myDB;create=true;user=me;password=mine";
    public static void main(String[] args) {
        createDB();
    }

    public static void createDB(){
        try {
            DriverManager.registerDriver(new EmbeddedDriver());
            Connection connection = DriverManager.getConnection(dbURL,"","");
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE vegetables ( ID int GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), NAME varchr(255), CALORIES double, FAT double, CARBS double)");
            statement.addBatch("INSERT INTO vegetables (NAME, CALORIES, FAT, CARBS) VALUES ('pepper', 2.2, 3.3, 4.4)");

            statement.executeBatch();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM vegetables");
            ResultSetMetaData metaData = resultSet.getMetaData();
            while(resultSet.next()){
                System.out.println("===================");
                for (int i = 0, columnCount = metaData.getColumnCount(); i <= columnCount ; i++) {
                    System.out.println(String.format("'%s' : '%s'",metaData.getColumnName(i), resultSet.getString(i)));
                }
                System.out.println("===================");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

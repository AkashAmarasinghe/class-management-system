/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author YOGYA
 */
public class mySql {
    
    private static Connection connection;
    
    public static void createConnection() throws Exception{
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = System.getenv().getOrDefault("CLASS_DB_URL", "jdbc:mysql://localhost:3306/learn");
    String user = System.getenv().getOrDefault("CLASS_DB_USER", "root");
    String password = System.getenv("CLASS_DB_PASSWORD");
    if (password == null) {
        throw new IllegalStateException("Set CLASS_DB_PASSWORD environment variable before starting the application.");
    }
    connection = DriverManager.getConnection(url, user, password);
    
    }
    
    public static ResultSet executeSearch(String query) throws Exception{
    
        createConnection();
        return connection.createStatement().executeQuery(query);
    }
    
    public static Integer executeIUD(String query)throws Exception{
    
        createConnection();
        return connection.createStatement().executeUpdate(query);
    }

   
    
}

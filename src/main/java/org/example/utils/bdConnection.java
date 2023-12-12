package org.example.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class bdConnection {
    private Connection connection;
    public Connection getConnection(){
        try {
            Properties props = new Properties();
            InputStream inputStream = bdConnection.class.getClassLoader().getResourceAsStream("application.properties");
            props.load(inputStream);
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.username");
            String password = props.getProperty("db.password");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa");
            return connection;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}

package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private static Connection myConfig;
    public static Connection configDB() throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/db_kasir";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            myConfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e){
            System.err.print("Koneksi Gagal "+e.getMessage());
        }
        return myConfig;
    }
}
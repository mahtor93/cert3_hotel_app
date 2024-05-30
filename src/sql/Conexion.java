/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;
import java.sql.*;
/**
 *
 * @author Metatron
 */
public class Conexion {
    public static Connection getConexion(){
        Connection connection = null;
        try{
            String bbdd_mysql = "bd_hoteles";
            String user_mysql = "root";
            String pass_mysql = "";
            String driverClassName = "com.mysql.jdbc.Driver";
            String driverUrl="jdbc:mysql://localhost/" + bbdd_mysql;
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(driverUrl, user_mysql,pass_mysql);
            System.out.println("Conexión exitosa"); 
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}

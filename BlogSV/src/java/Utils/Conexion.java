/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LC
 */
public class Conexion {
    private Connection conn;
    private String user="root";
    private String pwd="";    
    private String url ="jdbc:mysql://localhost:3306/blogsv";    
    private String driver = "com.mysql.cj.jdbc.Driver";
        
    public Conexion(){
        conectar();
    }
    
    
    private void conectar(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pwd);
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
}

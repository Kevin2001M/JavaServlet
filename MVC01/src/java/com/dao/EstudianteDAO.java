/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import com.models.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author LC
 */
public class EstudianteDAO {
    //CRUD=> conexion
     private Connection conn;
        
     public Connection getConnection(){
         if(conn == null){
             conn = new Conexion().getConnection();
         }
         return conn;
     }
     
     public void setConnection(Connection conn){
         this.conn = conn;
     }
     
     public void closeConnection(){         
         try {
             getConnection().close();
             conn = null;
         } catch (SQLException e) {
             e.printStackTrace();
         }         
     }
     
     //CRUD
     //Listar productos
     public List<Estudiante> getAll(){
         List<Estudiante> result = new LinkedList<Estudiante>();
         
         try {
             Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Estudiantes");
             
             while(rs.next()){
                 Estudiante entity = new Estudiante();
                 entity.setEstudianteId(rs.getInt("estudianteid"));
                 entity.setNombre(rs.getString("nombre"));                 entity.setNombre(rs.getString("nombre"));
                 entity.setApellido(rs.getString("apellido"));
                 entity.setTelefono(rs.getString("telefono"));
                 entity.setDui(rs.getString("dui"));
                 entity.setMunicipio(rs.getString("municipio"));                
                 result.add(entity);
             }
             stmt.close();
         } catch (SQLException e) {
              e.printStackTrace();
         }finally{
             closeConnection();
         }
         
         return result;
     }
     
     
     public boolean create(Estudiante entity){
         boolean result = false;
         
         try {
             PreparedStatement ps = null;
             String query = "INSERT INTO estudiantes(nombre,apellido,telefono,dui,municipio)\n" +
            "VALUES(?,?,?,?,?);";
             ps = getConnection().prepareStatement(query);
             ps.setString(1, entity.getNombre());
             ps.setString(2, entity.getApellido());
             ps.setString(3, entity.getTelefono());
             ps.setString(4, entity.getDui());
             ps.setString(5, entity.getMunicipio());
             result = ps.executeUpdate() > 0;
             ps.close();                          
         } catch (SQLException e) {
              e.printStackTrace();
         }finally{
             closeConnection();
         }
         
         return result;
     }
     
     
     
     
     
     
     
}

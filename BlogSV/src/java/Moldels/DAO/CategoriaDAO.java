/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moldels.DAO;

import Models.Entities.Categoria;
import Models.Entities.Usuario;
import Utils.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author LC
 */
public class CategoriaDAO {
    
    private Connection conn;
    
    //patron singlenton
    public Connection getConnection(){
        if(conn == null){
            conn = new Conexion().getConnection();
        }
        return conn;
    }
    
    public void closeConnection(){
        try {
            getConnection().close();
            conn = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Categoria> getAll(){
         List<Categoria> result = new LinkedList<Categoria>();
         
         try {
             Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM categorias");
             
             while(rs.next()){
                 Categoria entity = new Categoria();
                 entity.setCategoriaId(rs.getInt("categoriaId"));
                 entity.setNombre(rs.getString("nombre"));                 
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
    
    public Categoria getById(int id){
         Categoria result = null;
         
         try {
             Statement stmt = getConnection().createStatement();
             String query ="SELECT * FROM categorias where categoriaId=?";
             
             PreparedStatement ps = getConnection().prepareStatement(query);
                             
             ps.setInt(1, id);  
             
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){
                 result = new Categoria();
                 result.setCategoriaId(rs.getInt("categoriaId"));
                 result.setNombre(rs.getString("nombre"));                                  
             }
             stmt.close();
         } catch (SQLException e) {
              e.printStackTrace();
         }finally{
             closeConnection();
         }
         
         return result;
     }
    
    public boolean edit(Categoria entity){
        boolean result = false;
        
        try {
             String query = "UPDATE categorias SET nombre=?" +
                "WHERE categoriaId=?";
        
            PreparedStatement ps = getConnection().prepareStatement(query);
            ps.setString(1, entity.getNombre());
            ps.setInt(2, entity.getCategoriaId());            
            
            result = ps.executeUpdate()>0;                       
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            closeConnection();
        }
        
       return result;        
    }
    
    public boolean delete(int id){
        boolean result = false;
        
        try {
             String query = "DELETE FROM categorias WHERE categoriaId=?";
        
            PreparedStatement ps = getConnection().prepareStatement(query);
            ps.setInt(1, id);            
            
            result = ps.executeUpdate()>0;                       
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            closeConnection();
        }
        
       return result;        
    }
}

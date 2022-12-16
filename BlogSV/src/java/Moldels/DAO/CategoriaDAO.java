/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moldels.DAO;

import Models.Entities.Categoria;
import Utils.Conexion;
import java.sql.Connection;
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
}

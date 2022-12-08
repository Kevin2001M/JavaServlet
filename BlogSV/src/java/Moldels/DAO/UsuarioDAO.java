/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moldels.DAO;

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
public class UsuarioDAO {
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
    
    
    public Usuario login(String nickname, String pass){
        Usuario result = null;
        
        try {
             String query = "SELECT * FROM usuarios "
                + "WHERE nickname = ? AND pwd= md5(?)";
        
            PreparedStatement ps = getConnection().prepareStatement(query);
            ps.setString(1, nickname);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                result = new Usuario();
                result.setNickName(rs.getString("nickname"));
                result.setNombre(rs.getString("nombre"));
                result.setTipoUsuario(rs.getInt("tipousuario"));
                result.setPwd(rs.getString("pwd"));                                
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            closeConnection();
        }
        
       return result;        
    }
    
    public boolean create(Usuario entity){
        boolean result = false;
        
        try {
             String query = "INSERT into usuarios(nickname,nombre, pwd)\n" +
                "VALUES(?,?,md5(?))";
        
            PreparedStatement ps = getConnection().prepareStatement(query);
            ps.setString(1, entity.getNickName());
            ps.setString(2, entity.getNombre());
            ps.setString(3, entity.getPwd());
            
            result = ps.executeUpdate()>0;                       
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            closeConnection();
        }
        
       return result;        
    }
    
    
     public List<Usuario> getAll(){
         List<Usuario> result = new LinkedList<Usuario>();
         
         try {
             Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
             
             while(rs.next()){
                 Usuario entity = new Usuario();
                 entity.setNickName(rs.getString("nickname"));
                 entity.setNombre(rs.getString("nombre"));
                 entity.setTipoUsuario(rs.getInt("tipousuario"));
                 entity.setPwd(rs.getString("pwd"));                   
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

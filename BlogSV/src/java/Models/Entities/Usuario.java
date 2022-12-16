/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Entities;

/**
 *
 * @author LC
 */
public class Usuario {
    private String nickName;
    private String nombre;
    private String pwd;
    private int tipoUsuario;

    public Usuario(){}
    
    //insert y update
    public Usuario(String nickName, String nombre, String pwd, int tipoUsuario) {
        this.nickName = nickName;
        this.nombre = nombre;
        this.pwd = pwd;
        this.tipoUsuario = tipoUsuario;
    }
    
    

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Entities;

import java.util.Date;

/**
 *
 * @author LC
 */
public class Publicacion {
    private int publicacionId;
    private String titulo;
    private Date fecha;
    private String resumen;
    private String contenido;
    private String nickName;
    private int categoriaId;
    
    public Publicacion(){}

    public Publicacion(String titulo, Date fecha, String resumen, String contenido, String nickName, int categoriaId) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.resumen = resumen;
        this.contenido = contenido;
        this.nickName = nickName;
        this.categoriaId = categoriaId;
    }
    
    

    public Publicacion(int publicacionId, String titulo, Date fecha, String resumen, String contenido, String nickName, int categoriaId) {
        this.publicacionId = publicacionId;
        this.titulo = titulo;
        this.fecha = fecha;
        this.resumen = resumen;
        this.contenido = contenido;
        this.nickName = nickName;
        this.categoriaId = categoriaId;
    }
    
    

    public int getPublicacionId() {
        return publicacionId;
    }

    public void setPublicacionId(int publicacionId) {
        this.publicacionId = publicacionId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }
    
    
    
}

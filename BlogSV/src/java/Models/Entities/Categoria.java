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
public class Categoria {
    private int categoriaId;
    private String nombres;
    
    
    public Categoria(){}

    //Update
    public Categoria(int categoriaId, String nombres) {
        this.categoriaId = categoriaId;
        this.nombres = nombres;
    }

    //Insert
    public Categoria(String nombres) {
        this.nombres = nombres;
    }
    
    
    
    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author LC
 */
public class Productos {
    private int productoId;
    private String nombre;
    private float precio;
    private float costo;
    private boolean estado;
    
    public Productos(){}

    public Productos(String nombre, float precio, float costo, boolean estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.costo = costo;
        this.estado = estado;
    }        

    public Productos(int productoId, String nombre, float precio, float costo, boolean estado) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
        this.costo = costo;
        this.estado = estado;
    }   
    
    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}

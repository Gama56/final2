/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bd.entidades;

/**
 *
 * @author Moisés
 */
public class Cliente {
    private int id;
    private String nombre;
    private String apellidos;
    private String dpi;
    private String direccion;
    private String telefono;
    private int edad;
    private String email;
    
    
    public Cliente() {
      
    }

    public Cliente(int id, String nombre, String apellidos, String dpi, String direccion, String telefono, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dpi = dpi;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

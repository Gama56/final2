/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bd.entidades;


public class Vendedor {
    private int id_Vendedor;
    private String nombre;
    private String Apellidos;
    private String Usuario;
    private String Clave;
    
    public Vendedor(){
        
    }
    
    
  public Vendedor(int id, String nombre, String apellidos, String usuario, String clave) {
        this.id_Vendedor = id;
        this.nombre = nombre;
        this.Apellidos = apellidos;
        this.Usuario = usuario;
        this.Clave = clave;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Clave
     */
    public String getClave() {
        return Clave;
    }

    /**
     * @param Clave the Clave to set
     */
    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    /**
     * @return the id_Vendedor
     */
    public int getId_Vendedor() {
        return id_Vendedor;
    }

    /**
     * @param id_Vendedor the id_Vendedor to set
     */
    public void setId_Vendedor(int id_Vendedor) {
        this.id_Vendedor = id_Vendedor;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bd.dao;

import com.proyecto.bd.entidades.Cliente;
import com.proyecto.bd.entidades.Vendedor;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Moisés
 */
public class ClienteDao {
       PreparedStatement ps;
       ResultSet rs;
    public List <Cliente> getAll(){
        List<Cliente> clientes = new ArrayList<Cliente>();
        try{
            
            Connection conn = Dao.getConnection();
            String querito="SELECT * FROM cliente";     
            ps= conn.prepareStatement(querito);
            rs=ps.executeQuery();
            Cliente c;
            while(rs.next())
            {
              c =new Cliente();
              c.setId(rs.getInt("Id_Cliente"));
              c.setNombre(rs.getString("Nombres"));
              c.setApellidos(rs.getString("Apellidos"));
              c.setDpi(rs.getString("Dpi"));
              c.setDireccion(rs.getString("Direccion"));
              c.setTelefono(rs.getString("Nit")); 
              c.setEdad(rs.getInt("Id_Tipo"));  
              c.setEmail(rs.getString("Correo"));  
              
              clientes.add(c);    
            }
            
        }catch(Exception e){
            
        }
        return clientes;
    }
    public Cliente get(String nombres){
        Cliente c = new Cliente();
        try{
              Connection conn = Dao.getConnection();
              String querito="SELECT * FROM cliente WHERE Nombres='"+nombres+"'";
              ps= conn.prepareStatement(querito);
              rs=ps.executeQuery();
              if(rs.next()){
                 c = new Cliente(); 
                 c.setId(rs.getInt("Id_Cliente"));
                 c.setNombre(rs.getString("Nombres"));
                 c.setApellidos(rs.getString("Apellidos"));
              }
        }catch(Exception e){
            
        }
        return c;
    }
    
    
    public void addcliente(Cliente c){
        try{
           Connection conn = Dao.getConnection();
           String query=null;
           query="inser into tb_clientes(nombre,apellidos,dpi,direccion,telefono,edad,email)";
           query+="values(";
           query+="'"+c.getNombre()+"',";
           query+="'"+c.getApellidos()+"',";
           query+="'"+c.getDpi()+"',";
           query+="'"+c.getDireccion()+"',";
           query+="'"+c.getTelefono()+"',";
           query+="'"+c.getEdad()+"',";
           query+="'"+c.getEmail()+"');";
            ps= conn.prepareStatement(query);
            rs=ps.executeQuery();
        }catch(Exception e){
            
        }
    }
    
    
    //CONSULTA DE VENDEDOR
    
    public Vendedor getVendedor(String usuario, String clave){
        Vendedor vendor = new Vendedor();
        try{
              Connection conn = Dao.getConnection();
              String querito="SELECT * FROM vendedor WHERE Usuario='"+usuario+"' AND Contraseña='"+clave+"'";
              ps= conn.prepareStatement(querito);
              rs=ps.executeQuery();
              if(rs.next()){
                 vendor = new Vendedor(); 
                 vendor.setId_Vendedor(rs.getInt("Id_Vendedor"));
                 vendor.setNombre(rs.getString("Nombres"));
                 vendor.setApellidos(rs.getString("Apellidos"));
                 vendor.setUsuario(rs.getString("Usuario"));
                 vendor.setClave(rs.getString("Contraseña"));
              }
        }catch(Exception e){
            
        }
        return vendor;
    }
    
    
}

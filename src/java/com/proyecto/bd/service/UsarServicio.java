/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bd.service;

import com.proyecto.bd.dao.ClienteDao;
import com.proyecto.bd.entidades.Cliente;
import com.proyecto.bd.entidades.Vendedor;
import java.util.List;

/**
 *
 * @author Moisés
 */
public class UsarServicio {
    private ClienteDao clientedao;
    
    public UsarServicio(){
        clientedao=new ClienteDao();
    }
    
    public List<Cliente> getAll(){
        return clientedao.getAll();
    }
    public Cliente get(String nombre){
        return clientedao.get(nombre);
    }
    //LOGIN
    public Vendedor getVendedor(String usuario, String Clave){
        return clientedao.getVendedor(usuario, Clave);
    }
    public void create(Cliente c){
        if(c==null)
            throw new NullPointerException("USUARIO NO PUEDE SER NULL");
        clientedao.addcliente(c);
    }
}

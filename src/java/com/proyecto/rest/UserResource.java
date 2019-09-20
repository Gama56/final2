/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.rest;

import com.google.gson.Gson;
import com.proyecto.bd.dao.ClienteDao;
import com.proyecto.bd.entidades.Cliente;
import com.proyecto.bd.entidades.Vendedor;
import com.proyecto.bd.service.UsarServicio;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Moisés
 */
@Path("user")
public class UserResource {

    @Context
    private UriInfo context;
private ClienteDao clientedao;
    
    public UserResource() {
    }

    @GET
    @Path("clientes")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
       try{
           List<Cliente> clientes = new UsarServicio().getAll();
           String json = new Gson().toJson(clientes);
           return Response.ok(json, MediaType.APPLICATION_JSON).build();
       }catch(Exception e){
            return Response.status(Response.Status.SEE_OTHER).entity("Error: "+e.toString()).build();
       }
       
    }
    @GET
    @Path("cliente/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("nombre")String nombre){
      Cliente c = new Cliente();
        try{
           Cliente clientes = new UsarServicio().get(nombre);
           String json = new Gson().toJson(clientes);
           return Response.ok(json, MediaType.APPLICATION_JSON).build();
       }catch(Exception e){
            return Response.status(Response.Status.SEE_OTHER).entity("Error: "+e.toString()).build();
       } 
    }
    
    //OBTENER USUARIO Y CLAVES LOGIN
    @GET
    @Path("vendedor/{usuario}/{clave}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVendedor(@PathParam("usuario")String usuario, @PathParam("clave")String clave){
      Vendedor c = new Vendedor();
        try{
           Vendedor vendor = new UsarServicio().getVendedor(usuario, clave);
           String json = new Gson().toJson(vendor);
           return Response.ok(json, MediaType.APPLICATION_JSON).build();
       }catch(Exception e){
            return Response.status(Response.Status.SEE_OTHER).entity("Error: "+e.toString()).build();
       } 
    }
    
    
    @POST
    @Path("addVendedor")
    @Produces(MediaType.APPLICATION_JSON)
    public String addVendedor(String json) {
        try{
            Gson gson = new Gson();
            Vendedor vended = gson.fromJson(json, Vendedor.class);
             UsarServicio services = new UsarServicio();
            services.createVendor(vended);
            String responseString = String.valueOf(vended.getNombre()+" "+ vended.getApellidos() +" "+ vended.getUsuario() +" "+vended.getClave());
 
            return responseString;
        }catch(Exception e){
           // return Response.status(Response.Status.SEE_OTHER).entity("Errors: "+e.toString()).build();
       } 
        return null;
        
    }
    
    @POST
    @Path("addVendedor/{nombre}/{apellido}/{usuario}/{clave}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addVendedor(@PathParam("nombre")String nombre, @PathParam("apellido")String apellido, 
            @PathParam("usuario")String usuario, @PathParam("clave")String clave) {
        try{
            Vendedor vendor = new Vendedor();
            vendor.setNombre(nombre);
            vendor.setApellidos(apellido);
            vendor.setUsuario(usuario);
            vendor.setClave(clave);
            
            UsarServicio services = new UsarServicio();
            //services.createVendor(vendor);
           
            String json="(\"id\":\""+vendor.getClave()+"\"}";
            return Response.ok(json, MediaType.APPLICATION_JSON).build();
        }catch(Exception e){
            return Response.status(Response.Status.SEE_OTHER).entity("Error: "+e.toString()).build();
       } 
    }
}

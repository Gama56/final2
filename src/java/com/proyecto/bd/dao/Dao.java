/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Moisés
 */
public class Dao {
 private static String url = "jdbc:mysql://localhost:3306/dbcredito";
 private static String user = "root";
 private static String pass = "";
 public static Connection getConnection(){
     Connection conn = null;
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(url,user,pass);
     }catch(SQLException ex){
        
     }
     catch(ClassNotFoundException ex)
     {
        
     }
     return conn;
 }
}

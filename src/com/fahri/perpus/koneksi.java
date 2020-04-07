/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahri.perpus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Unknown
 */
public class koneksi {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
    try{
    String url="jdbc:mysql://localhost/perpustakaan";
    String user="root";
    String pass="";
    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    mysqlconfig=DriverManager.getConnection(url,user,pass);
    System.out.println("Koneksi Berhasil!");
    }
    catch(Exception e){
    System.err.println("Koneksi Gagal" +e.getMessage());
    }
    return mysqlconfig;
}
}

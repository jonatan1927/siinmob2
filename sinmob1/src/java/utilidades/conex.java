/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author jonatan
 */
public class conex {
    public String driver,urldb,usrdb,pas;
    public Connection conexion;

    public conex(){
    driver="com.mysql.jdbc.Driver";
    urldb="jdbc:mysql://127.0.0.1:3306/siinmob";
    usrdb="root";
    pas="";
    try{
    Class.forName(driver).newInstance();
    conexion=DriverManager.getConnection(urldb, usrdb, pas);
    }catch (Exception e){}
    }
    public Connection obtenerConexion(){
    return conexion;
    }
    public Connection cerrarConexion(){
    conexion=null;
    return conexion;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.ClienteDTO;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.conex;

/**
 *
 * @author jonatan
 */
public class ClienteDAO extends conex {
       PreparedStatement pstmt = null;
       Connection cnn = null;
       int rtdo;
       ResultSet rs = null; 
       Statement st=null;
       CallableStatement cstm=null;

    public ClienteDAO() {
        super();
    }

       String mensaje="";
       
 public boolean insert (ClienteDTO cli){
     boolean encontrado=false;
     cnn=this.obtenerConexion();
  String sql = " {CALL insertar(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
      try {
          cstm =(CallableStatement) cnn.prepareCall(sql);
          cstm.setString(1,cli.getpNombre());
          cstm.setString(2,cli.getsNombre());
          cstm.setString(3, cli.getpApellido());
          cstm.setString(4, cli.getsApellido());
          cstm.setString(5, cli.getDireccion());
           cstm.setString(6,cli.getEmail());
          cstm.setString(7, cli.getGenero());
          cstm.setString(8,cli.getFecha());
          cstm.setInt(9,cli.getCedula());
          cstm.executeUpdate();
          if (cstm.execute(sql)) {
              encontrado=true;
          }
        } catch (Exception e) {
        }
        return encontrado;
    }
    public int conrid(String usu, String cont){
  int pusuario=0;
  try{
   conex c=new conex();
   Connection con=c.obtenerConexion();
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select Cedulausuario from usuarios where Email='"+usu+"' and Cedula='"+cont+"'");
   while(rs.next()){
    pusuario=rs.getInt(1);
   }
   rs.close();
   st.close();
  }catch(SQLException se){
   se.printStackTrace();
  }
  return pusuario;
 }
 
    
}

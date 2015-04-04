/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.InmuebleDTO;
import Dtos.PropietariosDTO;
import Dtos.UsuariosDTO;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utilidades.conex;

/**
 *
 * @author jonatan
 */
public class PropietariosDAO extends conex {
       PreparedStatement pstmt = null;
       Connection cnn = null;
       int rtdo;
       ResultSet rs = null; 
       Statement st=null;
       CallableStatement cstm=null;

    public PropietariosDAO() {
        super();
    }

       String mensaje="";
       
 public boolean insertpro (PropietariosDTO pro, InmuebleDTO inm){
     boolean encontrado=false;
     cnn=this.obtenerConexion();
  String sql = " {CALL insertardueno(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}";
      try {
          cstm =(CallableStatement) cnn.prepareCall(sql);
          cstm.setString(1,pro.getpNombre());
          cstm.setString(2,pro.getsNombre());
          cstm.setString(3, pro.getpApellido());
          cstm.setString(4, pro.getsApellido());
          cstm.setString(5,pro.getEmail());
          cstm.setInt(6,pro.getCedula());
          cstm.setString(7,inm.getLocalidad());
          cstm.setString(8,inm.getBarrio());
          cstm.setInt(9, inm.getValor());
          cstm.setString(10, inm.getDireccion());
          cstm.setInt(11,inm.getPisos());
          cstm.setInt(12,inm.getEstrato());
          cstm.setInt(13,inm.getBaños());
          cstm.setInt(14,inm.getHabitaciones());
          cstm.setString(15, inm.getConstruccion());
          cstm.setString(16, inm.getAnuncio());
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
          public boolean nuevo(UsuariosDTO usu, InmuebleDTO inm) {
        boolean encontrado = false;
        cnn = this.obtenerConexion();
        String sql = " {CALL propier (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        try {
            cstm = (CallableStatement) cnn.prepareCall(sql);
            cstm.setString(1, usu.getpNombre());
            cstm.setString(2, usu.getsNombre());
            cstm.setString(3, usu.getpApellido());
            cstm.setString(4, usu.getsApellido());
            cstm.setString(5, usu.getEmail());
            cstm.setInt(6, usu.getCedula());
            cstm.setString(7,inm.getLocalidad());
          cstm.setString(8,inm.getBarrio());
          cstm.setInt(9, inm.getValor());
          cstm.setString(10, inm.getDireccion());
          cstm.setInt(11,inm.getPisos());
          cstm.setInt(12,inm.getEstrato());
          cstm.setInt(13,inm.getBaños());
          cstm.setInt(14,inm.getHabitaciones());
          cstm.setString(15, inm.getConstruccion());
          cstm.setString(16, inm.getAnuncio());
            cstm.executeUpdate();
            if (cstm.execute(sql)) {
                encontrado = true;
            }
        } catch (Exception e) {
        }
        return encontrado;
    }
}

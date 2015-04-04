/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;
import Dtos.PropietariosDTO;
import Dtos.ClienteDTO;
import Dtos.TelefonoDTO;
import Dtos.UsuariosDTO;
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
public class TelefonoDAO extends conex {
      PreparedStatement pstmt = null;
       Connection cnn = null;
       int rtdo;
       ResultSet rs = null; 
       Statement st=null;
       CallableStatement cstm=null;

    public TelefonoDAO() {
        super();
    }
              public TelefonoDTO consultarT(int usu){
  TelefonoDTO pus=null;
  try{
   conex c=new conex();
   Connection con=c.obtenerConexion();
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select Numero from telefonos where Cedulausuario='" +usu+"'");
   while(rs.next()){
    pus=new TelefonoDTO(rs.getString(1),usu);
   }
   rs.close();
   st.close();
  }catch(SQLException se){
   se.printStackTrace();
  }
  return pus;
 }
  public boolean ingresotel (ClienteDTO usu,TelefonoDTO tel){
     boolean encontrado=false;
     cnn=this.obtenerConexion();
  String sql = " {CALL usuariou(?, ?, ?, ?, ?)}";
      try {
          cstm =(CallableStatement) cnn.prepareCall(sql);
          cstm.setString(1, usu.getpNombre());
          cstm.setString(2, usu.getsNombre());
          cstm.setString(3, usu.getpApellido());
          cstm.setInt(4, usu.getId());
          cstm.setString(5, tel.getNumero());
          cstm.executeUpdate();
          if (cstm.execute(sql)) {
              encontrado=true;
          }
        } catch (Exception e) {
        }
        return encontrado;
    }             
         public boolean ingresotelo (PropietariosDTO usu,TelefonoDTO tel){
     boolean encontrado=false;
     cnn=this.obtenerConexion();
  String sql = " {CALL usuariodueno(?, ?, ?, ?, ?)}";
      try {
          cstm =(CallableStatement) cnn.prepareCall(sql);
          cstm.setString(1, usu.getpNombre());
          cstm.setString(2, usu.getsNombre());
          cstm.setString(3, usu.getpApellido());
          cstm.setInt(4, usu.getId());
          cstm.setString(5, tel.getNumero());
          cstm.executeUpdate();
          if (cstm.execute(sql)) {
              encontrado=true;
          }
        } catch (Exception e) {
        }
        return encontrado;
    }  
    
}

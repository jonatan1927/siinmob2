/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.InmuebleDTO;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utilidades.conex;

/**
 *
 * @author jonatan
 */
public class inmuebleDAO extends conex {
      PreparedStatement pstmt = null;
       Connection cnn = null;
       int rtdo;
       ResultSet rs = null; 
       Statement st=null;
       CallableStatement cstm=null;

    public inmuebleDAO() {
        super ();
    }
            public boolean ingresoloc (InmuebleDTO usu){
     boolean encontrado=false;
     cnn=this.obtenerConexion();
  String sql = " {CALL insertarlocalidad(?)}";
      try {
          cstm =(CallableStatement) cnn.prepareCall(sql);
          cstm.setString(1, usu.getLocalidad());
          cstm.executeUpdate();
          if (cstm.execute(sql)) {
              encontrado=true;
          }
        } catch (Exception e) {
        }
        return encontrado;
    } 
    public boolean ingresobarr (InmuebleDTO usu, int p){
     boolean encontrado=false;
     cnn=this.obtenerConexion();
  String sql = " {CALL insertarbarrio(?, ?)}";
      try {
          cstm =(CallableStatement) cnn.prepareCall(sql);
          cstm.setString(1, usu.getBarrio());
          cstm.setInt(2, p);
          cstm.executeUpdate();
          if (cstm.execute(sql)) {
              encontrado=true;
          }
        } catch (Exception e) {
        }
        return encontrado;
    } 
        public boolean ingresoinmueble (InmuebleDTO usu, int p, int d){
     boolean encontrado=false;
     cnn=this.obtenerConexion();
  String sql = " {CALL insertarinmueble(?,?, ?, ?)}";
      try {
          cstm =(CallableStatement) cnn.prepareCall(sql);
          cstm.setInt(1,p);
          cstm.setInt(2,usu.getValor());
          cstm.setString(3,usu.getDireccion());
          cstm.setInt(4, d);
          cstm.executeUpdate();
          if (cstm.execute(sql)) {
              encontrado=true;
          }
        } catch (Exception e) {
        }
        return encontrado;
    }
           public boolean ingresodemas (InmuebleDTO usu, int p){
     boolean encontrado=false;
     cnn=this.obtenerConexion();
  String sql = " {CALL insertardemas(?, ?, ?, ?, ?, ?, ?)}";
      try {
          cstm =(CallableStatement) cnn.prepareCall(sql);
          cstm.setInt(1,p);
          cstm.setInt(2,usu.getPisos());
          cstm.setInt(3,usu.getEstrato());
          cstm.setInt(4,usu.getBaños());
          cstm.setInt(5,usu.getHabitaciones());
          cstm.setString(6,usu.getConstruccion() );
          cstm.setString(7,usu.getAnuncio());
          cstm.executeUpdate();
          if (cstm.execute(sql)) {
              encontrado=true;
          }
        } catch (Exception e) {
        }
        return encontrado;
    }
               public int conloc(String usu){
  int pusuario=0;
  try{
   conex c=new conex();
   Connection con=c.obtenerConexion();
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select idLocalidad  from localidad where Nombre='"+usu+"'");
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
 public int conbar(String usu){
  int pusuario=0;
  try{
   conex c=new conex();
   Connection con=c.obtenerConexion();
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select idBarrio  from barrios where Nombre='"+usu+"'");
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
  public int coninmu(int usu, String dir){
  int pusuario=0;
  try{
   conex c=new conex();
   Connection con=c.obtenerConexion();
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery(" select idInmuebles from inmuebles where Cedulapropietario="+usu+" and Direccion='"+dir+"'");
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

    public static ArrayList<InmuebleDTO> consultarinmueble(String f1, String f2,String f3, String f4, String f5) {
        ArrayList<InmuebleDTO> inmo = new ArrayList<>();
        try {
            conex c = new conex();
            Connection con = c.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(f1+" select idInmuebles as id, barrios.Nombre as nb, localidad.Nombre as nl, descripciones.NumPisos as np , " +
" descripciones.NumHabitaciones as nh, descripciones.Baños as b, descripciones.Estrato as e, " +
" inmueblepublicar.TipoAnuncio as a,  descripciones.Construccion as c, Valor as v, Direccion as d " +
" from inmuebles " +
" inner join descripciones on inmuebles.idInmuebles=descripciones.idinmueble " +
" inner join inmueblepublicar on inmueblepublicar.idinmueble=inmuebles.idInmuebles " +
" inner join barrios on barrios.idBarrio=inmuebles.idbarrio " +
" inner join localidad on localidad.idLocalidad=barrios.idlocalidad "+f2+" "+f3+" "+f4+" "+f5);

            if (rs != null) {
                while (rs.next()) {
                    inmo.add(new InmuebleDTO(rs.getInt("id"),rs.getString("nb"),rs.getString("nl"),rs.getInt("np"),rs.getInt("nh"),
                    rs.getInt("b"), rs.getInt("e"),rs.getString("a"),rs.getString("c"), rs.getInt("v"),rs.getString("d")));
                }
            }
        } catch (SQLException ex) {
            String mensaje = "Error, datelle " + ex.getMessage();
        }

        return inmo;
    }
    
    public static ArrayList<InmuebleDTO> consultarinmueble() {
        ArrayList<InmuebleDTO> inmo = new ArrayList<>();
        try {
            conex c = new conex();
            Connection con = c.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(" select idInmuebles as id, barrios.Nombre as nb, localidad.Nombre as nl, descripciones.NumPisos as np , " +
" descripciones.NumHabitaciones as nh, descripciones.Baños as b, descripciones.Estrato as e, " +
" inmueblepublicar.TipoAnuncio as a,  descripciones.Construccion as c, Valor as v, Direccion as d " +
" from inmuebles " +
" inner join descripciones on inmuebles.idInmuebles=descripciones.idinmueble " +
" inner join inmueblepublicar on inmueblepublicar.idinmueble=inmuebles.idInmuebles " +
" inner join barrios on barrios.idBarrio=inmuebles.idbarrio " +
" inner join localidad on localidad.idLocalidad=barrios.idlocalidad ");

            if (rs != null) {
                while (rs.next()) {
                    inmo.add(new InmuebleDTO(rs.getInt("id"),rs.getString("nb"),rs.getString("nl"),rs.getInt("np"),rs.getInt("nh"),
                    rs.getInt("b"), rs.getInt("e"),rs.getString("a"),rs.getString("c"), rs.getInt("v"),rs.getString("d")));
                }
            }
        } catch (SQLException ex) {
            String mensaje = "Error, datelle " + ex.getMessage();
        }

        return inmo;
    }

  public InmuebleDTO inmuId(String usu){
  InmuebleDTO pus = null;
  try{
   conex c=new conex();
   Connection con=c.obtenerConexion();
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select* from(select idInmuebles as id, barrios.Nombre as nb, localidad.Nombre as nl, descripciones.NumPisos as np , " +
"descripciones.NumHabitaciones as nh, descripciones.Baños as b, descripciones.Estrato as e, " +
" inmueblepublicar.TipoAnuncio as a,  descripciones.Construccion as c, Valor as v, Direccion as d " +
" from inmuebles " +
" inner join descripciones on descripciones.idinmueble=inmuebles.idInmuebles " +
"inner join inmueblepublicar on inmueblepublicar.idinmueble=inmuebles.idInmuebles " +
"inner join barrios on barrios.idBarrio=inmuebles.idbarrio " +
"inner join localidad on localidad.idLocalidad=barrios.idlocalidad) as i where id="+usu );
 while (rs.next()) {
                pus = new InmuebleDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),
                    rs.getInt(6), rs.getInt(7),rs.getString(8),rs.getString(9), rs.getInt(10),rs.getString(11));
            }
            rs.close();
            st.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return pus;
    }  
    public static ArrayList<InmuebleDTO> inmueble() {
        ArrayList<InmuebleDTO> inmo = new ArrayList<>();
        try {
            conex c = new conex();
            Connection con = c.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(" select inmuebles.Direccion as nb, concat(usuarios.PNombre,' ',"
                    + " usuarios.PApellido ) as nl, barrios.Nombre as c, localidad.Nombre as d " +
"from inmuebles inner join " +
"barrios on inmuebles.idbarrio=barrios.idBarrio " +
"inner join localidad on barrios.idlocalidad=localidad.idLocalidad " +
"inner join propietarios on inmuebles.Cedulapropietario=propietarios.Cedulapropietario " +
"inner join usuarios on propietarios.Cedulapropietario=Usuarios.Cedulausuario");

            if (rs != null) {
                while (rs.next()) {
                    inmo.add(new InmuebleDTO(rs.getString("nb"),rs.getString("nl"),rs.getString("c"),rs.getString("d")));
                }
            }
        } catch (SQLException ex) {
            String mensaje = "Error, datelle " + ex.getMessage();
        }

        return inmo;
    }
  
}

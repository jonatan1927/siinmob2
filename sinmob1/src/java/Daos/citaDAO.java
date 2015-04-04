/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.InmuebleDTO;
import Dtos.UsuariosDTO;
import Dtos.citaDTO;
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
public class citaDAO extends conex{
     PreparedStatement pstmt = null;
    Connection cnn = null;
    int rtdo;
    ResultSet rs = null;
    Statement st = null;
    CallableStatement cstm = null;

    public citaDAO() {
        super();
    }

    String mensaje = "";
    
      public boolean cita(UsuariosDTO usu,InmuebleDTO inm, citaDTO cita) {
        boolean encontrado = false;
        cnn = this.obtenerConexion();
        String sql = " {CALL citanueva(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        try {
            cstm = (CallableStatement) cnn.prepareCall(sql);
            cstm.setString(1, usu.getpNombre());
            cstm.setString(2, usu.getsNombre());
            cstm.setString(3, usu.getpApellido());
            cstm.setString(4, usu.getsApellido());
            cstm.setString(5, usu.getEmail());
            cstm.setInt(6, usu.getCedula());
            cstm.setInt(7, inm.getId());
            cstm.setInt(8, cita.getInteres());
            cstm.setString(9,cita.getFechaVisita());
            cstm.executeUpdate();
            if (cstm.execute(sql)) {
                encontrado = true;
            }
        } catch (Exception e) {
        }
        return encontrado;
    }
      public boolean citas(UsuariosDTO usu,InmuebleDTO inm, citaDTO cita) {
        boolean encontrado = false;
        cnn = this.obtenerConexion();
        String sql = " {CALL cita(?, ?, ?, ?)}";
        try {
            cstm = (CallableStatement) cnn.prepareCall(sql);
            cstm.setInt(1, usu.getId());
            cstm.setInt(2, inm.getId());
            cstm.setInt(3, cita.getInteres());
            cstm.setString(4,cita.getFechaVisita());
            cstm.executeUpdate();
            if (cstm.execute(sql)) {
                encontrado = true;
            }
        } catch (Exception e) {
        }
        return encontrado;
    }
     public static ArrayList<citaDTO> ita() {
        ArrayList<citaDTO> cita = new ArrayList<>();
        try {
            conex c = new conex();
            Connection con = c.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select inmuebles.Direccion as nb,"
                    + " concat(usuarios.PNombre,' ', usuarios.PApellido ) as nl,"
                    + " visitainmuebles.Interesado as ff," +
"visitainmuebles.FechaVisita as d  from visitainmuebles " +
"inner join inmuebles on visitainmuebles.idinmuebles=inmuebles.idInmuebles " +
"inner join clientes on visitainmuebles.Cedulacliente=clientes.Cedulacliente " +
"inner join usuarios on clientes.Cedulacliente=Usuarios.Cedulausuario ");

            if (rs != null) {
                while (rs.next()) {
               cita.add(new citaDTO(rs.getString("nb"),rs.getString("nl"), rs.getInt("ff"),rs.getString("d")));
                }
            }
        } catch (SQLException ex) {
            String mensaje = "Error, datelle " + ex.getMessage();
        }

        return cita;
    }
      
    
}

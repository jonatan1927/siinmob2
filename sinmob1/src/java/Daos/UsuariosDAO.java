/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.InmuebleDTO;
import Dtos.TelefonoDTO;
import Dtos.UsuariosDTO;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.conex;

/**
 *
 * @author jonatan
 */
public class UsuariosDAO extends conex {

    PreparedStatement pstmt = null;
    Connection cnn = null;
    int rtdo;
    ResultSet rs = null;
    Statement st = null;
    CallableStatement cstm = null;

    public UsuariosDAO() {
        super();
    }

    String mensaje = "";

    public boolean val(String usu, String cont) {
        boolean encontrado = false;
        try {
            cnn = this.obtenerConexion();
            st = cnn.createStatement();
            rs = st.executeQuery("select usuario, Cedula from usuarios where usuario='" + usu + "' and Cedula='" + cont + "'");

            if (rs.next()) {
                encontrado = true;
            }
        } catch (Exception e) {
        }
        return encontrado;
    }

    public int consultarid(String usu, String cont) {
        int pusuario = 0;
        try {
            conex c = new conex();
            Connection con = c.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Cedulausuario from usuarios where usuario='" + usu + "' and Cedula='" + cont + "'");
            while (rs.next()) {
                pusuario = rs.getInt(1);
            }
            rs.close();
            st.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return pusuario;
    }

    public boolean valcli(int usu) {
        boolean encontrado = false;
        try {
            cnn = this.obtenerConexion();
            st = cnn.createStatement();
            rs = st.executeQuery("select Cedulacliente from clientes where Cedulacliente='" + usu + "'");

            if (rs.next()) {
                encontrado = true;
            }
        } catch (Exception e) {
        }
        return encontrado;
    }

    public boolean valpro(int usu) {
        boolean encontrado = false;
        try {
            cnn = this.obtenerConexion();
            st = cnn.createStatement();
            rs = st.executeQuery("select Cedulapropietario from propietarios where Cedulapropietario='" + usu + "'");

            if (rs.next()) {
                encontrado = true;
            }
        } catch (Exception e) {
        }
        return encontrado;
    }

    public boolean valadmi(int usu) {
        boolean encontrado = false;
        try {
            cnn = this.obtenerConexion();
            st = cnn.createStatement();
            rs = st.executeQuery("select cedulaadministrador from administrador where cedulaadministrador='" + usu + "'");

            if (rs.next()) {
                encontrado = true;
            }
        } catch (Exception e) {
        }
        return encontrado;
    }

    public UsuariosDTO consultarU(int usu) {
        UsuariosDTO pus = null;
        try {
            conex c = new conex();
            Connection con = c.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Cedula, PNombre , SNombre , PApellido , SApellido , Direccion , Genero , Email , FechaNacimiento from usuarios where Cedulausuario= '" + usu + "'");
            while (rs.next()) {
                pus = new UsuariosDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), usu);
            }
            rs.close();
            st.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return pus;
    }

    public boolean actualizar(UsuariosDTO usu, TelefonoDTO tel) {
        boolean encontrado = false;
        cnn = this.obtenerConexion();
        String sql = " {CALL actualizacion(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        try {
            cstm = (CallableStatement) cnn.prepareCall(sql);
            cstm.setString(1, tel.getNumero());
            cstm.setInt(2, usu.getCedula());
            cstm.setString(3, usu.getpNombre());
            cstm.setString(4, usu.getsNombre());
            cstm.setString(5, usu.getpApellido());
            cstm.setString(6, usu.getsApellido());
            cstm.setString(7, usu.getDireccion());
            cstm.setString(8, usu.getEmail());
            cstm.setString(9, usu.getGenero());
            cstm.setString(10, usu.getFecha());
            cstm.setInt(11, usu.getId());
            cstm.executeUpdate();
            if (cstm.execute(sql)) {
                encontrado = true;
            }
        } catch (Exception e) {
        }
        return encontrado;
    }

    public static ArrayList<UsuariosDTO> consultarusuarios(String f) {
        ArrayList<UsuariosDTO> u = new ArrayList<>();
        try {
            conex c = new conex();
            Connection con = c.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select  Cedula, PNombre, SNombre, PApellido, SApellido, Direccion, Email from usuarios"+" "+f);

            if (rs != null) {
                while (rs.next()) {
                    u.add(new UsuariosDTO(rs.getInt("Cedula"), rs.getString("PNombre"), rs.getString("SNombre"), rs.getString("PApellido"),
                            rs.getString("sApellido"), rs.getString("Direccion"), rs.getString("Email")));
                }
            }
        } catch (SQLException ex) {
            String mensaje = "Error, datelle " + ex.getMessage();
        }

        return u;
    }

    public boolean eliminar(int usu) {
        boolean encontrado = false;
        try {
            cnn = this.obtenerConexion();
            st = cnn.createStatement();
            rs = st.executeQuery("drop usuarios where Cedulausuario=" + usu + "");

            if (rs.next()) {
                encontrado = true;
            }
        } catch (Exception e) {
        }
        return encontrado;
    }

    public static ArrayList<UsuariosDTO> consultarusuarios() {
        ArrayList<UsuariosDTO> u = new ArrayList<>();
        try {
            conex c = new conex();
            Connection con = c.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select  Cedula, PNombre, SNombre, PApellido, SApellido, Direccion, Email from usuarios;");

            if (rs != null) {
                while (rs.next()) {
                    u.add(new UsuariosDTO(rs.getInt("Cedula"), rs.getString("PNombre"), rs.getString("SNombre"), rs.getString("PApellido"),
                            rs.getString("sApellido"), rs.getString("Direccion"), rs.getString("Email")));
                }
            }
        } catch (SQLException ex) {
            String mensaje = "Error, datelle " + ex.getMessage();
        }

        return u;
    }
}

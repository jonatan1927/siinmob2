/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dtos.InmuebleDTO;
import Dtos.UsuariosDTO;
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
public class main {
    public static void main(String[]args){
        
//             ArrayList<InmuebleDTO> in = new ArrayList<>();
//        try {
//            conex c = new conex();
//            Connection con = c.obtenerConexion();
//            PreparedStatement st = con.prepareStatement("select idInmuebles , Valor , Direccion from inmuebles;");
//            //Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery();
//            //ResultSet rs = st.executeQuery("select idInmuebles , Valor , Direccion from inmuebles;");
//
//            if (rs != null) {
//                while (rs.next()) {
//                    in.add(new InmuebleDTO(rs.getInt("idInmuebles"), rs.getString("Direccion"), rs.getInt("Valor")));
//                }
//            }
//        } catch (SQLException ex) {
//            String mensaje = "Error, datelle " + ex.getMessage();
//            System.out.println("error "+mensaje);
//        }
//        System.out.println("numero ¨: "+in.size());
//         for(int I =0;I<in.size();I++ ){
//        System.out.print(in.get(I).getValor());  } 

 
    
    ArrayList<InmuebleDTO> inmo = new ArrayList<>();
        try {
            conex c = new conex();
            Connection con = c.obtenerConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select idInmuebles as id, barrios.Nombre as nb, localidad.Nombre as nl, descripciones.NumPisos as np ," +
"descripciones.NumHabitaciones as nh, descripciones.Baños as b, descripciones.Estrato as e," +
" inmueblepublicar.TipoAnuncio as a,  descripciones.Construccion as c, Valor as v, Direccion as d" +
"  from inmuebles" +
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
            System.out.println("error "+mensaje);
        }
        System.out.println("numero ¨: "+inmo.size());
         for(int I =0;I<inmo.size();I++ ){
        System.out.print(inmo.get(I).getValor());  
         }}}

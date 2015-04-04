/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Daos.PropietariosDAO;
import Daos.TelefonoDAO;
import Daos.inmuebleDAO;
import Dtos.InmuebleDTO;
import Dtos.PropietariosDTO;
import Dtos.TelefonoDTO;
import Dtos.UsuariosDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jonatan
 */
public class registroinmueble extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String a = request.getParameter("Cedula");
        String b = request.getParameter("Nom");
        String c = request.getParameter("Nombre");
        String d = request.getParameter("Apellido1");
        String e = request.getParameter("Apellido2");
        String f = request.getParameter("EMail");
        String g = request.getParameter("estrato");
        String h = request.getParameter("anuncio");
        String i = request.getParameter("inmueble");
        String j = request.getParameter("pisos");
        String k = request.getParameter("habitaciones");
        String l = request.getParameter("banos");
        String m = request.getParameter("localidad");
        String n = request.getParameter("barrio");
        String o = request.getParameter("valor");
        String p = request.getParameter("Direccion");
        UsuariosDTO usu=new UsuariosDTO();
        PropietariosDAO pro=new PropietariosDAO();
        InmuebleDTO ito=new InmuebleDTO();
        inmuebleDAO idao=new inmuebleDAO();
        usu.setCedula(Integer.parseInt(a));
        usu.setpNombre(b);
        usu.setsNombre(c);
        usu.setpApellido(d);
        usu.setsApellido(e);
        usu.setEmail(f);
        ito.setLocalidad(m);
        ito.setBarrio(n);
        ito.setConstruccion(i);
        ito.setPisos(Integer.parseInt(j));
        ito.setHabitaciones (Integer.parseInt(k));
        ito.setBaños(Integer.parseInt(l));
        ito.setEstrato(Integer.parseInt(g));
        ito.setAnuncio(h);
        ito.setValor(Integer.parseInt(o));
        ito.setDireccion(p);
        pro.nuevo(usu,ito);
        out.println("<html><head></head><body onload=\"alert('Su registro fue un exito'); window.location='index.jsp'\"></body></html>");   
    
    }


// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

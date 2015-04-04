/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Daos.TelefonoDAO;
import Daos.UsuariosDAO;
import Dtos.TelefonoDTO;
import Dtos.UsuariosDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jonatan
 */
@WebServlet(name = "actualizar", urlPatterns = {"/actualizar"})
public class actualizar extends HttpServlet {

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
            throws ServletException, IOException, NullPointerException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            HttpSession hs = request.getSession(true);
            String a= request.getParameter("Ced") ;
            String b=request.getParameter("Nom");
            String c=request.getParameter("Nombre");
            String d=request.getParameter("Apellido1");
            String e=request.getParameter("Apellido2");
            String f=request.getParameter("Direccionactual");
            String g=request.getParameter("Telefono");
            String h=request.getParameter("Fecha");
            String i=request.getParameter("Sex");
            String j=request.getParameter("EMail");
            String k= request.getParameter("Cedula") ;
            UsuariosDAO udao=new UsuariosDAO();
            UsuariosDTO udto=new UsuariosDTO();
            TelefonoDAO tdao=new TelefonoDAO();
            TelefonoDTO tdto=new TelefonoDTO();
            tdto.setNumero(g);
            udto.setCedula(Integer.parseInt(k));
            udto.setpNombre(b);
            udto.setsNombre(c);
            udto.setpApellido(d);
            udto.setsApellido(e);
            udto.setDireccion(f);
            udto.setFecha(h);
            udto.setGenero(i);
            udto.setEmail(j);
            udto.setId(Integer.parseInt(a));
            int p=Integer.parseInt(a);
            udao.actualizar(udto, tdto);
                   if(udao.valcli(p)){
out.println("<html><head></head><body onload=\"alert('solicitud hecha'); window.location='Usuario/inicio.jsp'\"></body></html>");
       }
       if(udao.valpro(p)){
out.println("<html><head></head><body onload=\"alert('solicitud hecha'); window.location='Dueno/inicio.jsp'\"></body></html>");

       }
       if(udao.valadmi(p)){
 out.println("<html><head></head><body onload=\"alert('solicitud hecha'); window.location='Admi/inicio.jsp'\"></body></html>");

       }

 
        
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

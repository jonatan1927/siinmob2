/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Daos.ClienteDAO;
import Daos.TelefonoDAO;
import Dtos.ClienteDTO;
import Dtos.TelefonoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jonatan
 */
@WebServlet(name = "registro", urlPatterns = {"/registro"})
public class registro extends HttpServlet {

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
            String a= request.getParameter("Cedula") ;
            String b=request.getParameter("Nom");
            String c=request.getParameter("Nombre");
            String d=request.getParameter("Apellido1");
            String e=request.getParameter("Apellido2");
            String f=request.getParameter("Direccionactual");
            String g=request.getParameter("Telefono");
            String h=request.getParameter("Fecha");
            String i=request.getParameter("Sex");
            String j=request.getParameter("EMail");
            ClienteDTO cto=new ClienteDTO();
            ClienteDAO cdao=new ClienteDAO();
            TelefonoDTO tdto=new TelefonoDTO();
            TelefonoDAO tdao=new TelefonoDAO();
            cto.setCedula(Integer.parseInt(a));
            cto.setpNombre(b);
            cto.setsNombre(c);
            cto.setpApellido(d);
            cto.setsApellido(e);
            cto.setDireccion(f);
            tdto.setNumero(g);
            cto.setFecha(h);
            cto.setGenero(i);
            cto.setEmail(j);
            cdao.insert(cto);
            int pp=cdao.conrid(j, a);
            cto.setId(pp);
            tdao.ingresotel(cto, tdto);  
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

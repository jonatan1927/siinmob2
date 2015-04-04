/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Daos.TelefonoDAO;
import Daos.UsuariosDAO;
import Daos.citaDAO;
import Daos.inmuebleDAO;
import Dtos.InmuebleDTO;
import Dtos.TelefonoDTO;
import Dtos.UsuariosDTO;
import Dtos.citaDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "ingresar", urlPatterns = {"/ingresar"})
public class ingresar extends HttpServlet {

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
            throws ServletException, IOException,NullPointerException {
       
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
        String usuario=request.getParameter("txtusuario");
        String contra=request.getParameter("txtcontra");
       UsuariosDAO pdao = new UsuariosDAO(); 
        TelefonoDAO tda=new TelefonoDAO();
       if(pdao.val(usuario,contra)){
      HttpSession miSesion = request.getSession(true);
      int p= pdao.consultarid(usuario, contra);
      UsuariosDTO pedo=pdao.consultarU(p);
      TelefonoDTO tdo=tda.consultarT(p);
      miSesion.setAttribute("usuario",pedo);
      miSesion.setAttribute("telefono",tdo);
      ArrayList<UsuariosDTO> uedo=UsuariosDAO.consultarusuarios();
           ArrayList<InmuebleDTO> inmo=inmuebleDAO.inmueble();
     ArrayList<citaDTO> cita=citaDAO.ita();
     miSesion.setAttribute("inmo",inmo);
     miSesion.setAttribute("cita",cita);   
      miSesion.setAttribute("uedo",uedo);     
       if(pdao.valcli(p)){
      response.sendRedirect("Usuario/inicio.jsp");
       }
       if(pdao.valpro(p)){
    response.sendRedirect("Dueno/inicio.jsp");

       }
       if(pdao.valadmi(p)){
  response.sendRedirect("Admi/inicio.jsp");
       }
       }else{
         out.println("<html><head></head><body onload=\"alert('Usuario o clave incorrecta');"
                + " window.location='login.jsp'\"></body></html>");
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

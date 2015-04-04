/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Daos.inmuebleDAO;
import Dtos.InmuebleDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jonatan
 */
public class filtroinmueble extends HttpServlet {

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
        HttpSession hs = request.getSession(true);
        String a=request.getParameter("anuncio");
        String b=request.getParameter("pisos");
        String c=request.getParameter("estrato");
        String d="";String e="";String f="";String g="";String h="";   
      if(a.equals("seleccione") && b.equals("seleccione") && c.equals("seleccione")){
      d=""; e=""; f=""; g=""; h="";}
      else if(a.equals(a) && b.equals("seleccione") && c.equals("seleccione")){
          d="select* from( "; e=" ) as i where "; f=" a='"+a+"'"; 
      }
      else if( b.equals(b) && a.equals("seleccione") && c.equals("seleccione") ){
          d="select* from( "; e=" ) as i where "; g=" np="+b;
      }
      else if( c.equals(c) && a.equals("seleccione") && b.equals("seleccione") ){
          d="select* from( "; e=" ) as i where "; h=" e="+c;
      }
     else if(a.equals(a) && b.equals(b) && c.equals("seleccione") ){
          d="select* from( "; e=" ) as i where "; f=" a='"+a+"'"; g=" and np="+b;
      }
     else  if(b.equals(b) && c.equals(c) && a.equals("seleccione")  ){
          d="select* from( "; e=" ) as i where "; g=" np="+b; h=" and e="+c;
      }
     else  if(a.equals(a) && c.equals(c) && b.equals("seleccione")){
          d="select* from( "; e=" ) as i where "; f=" a='"+a+"'"; h=" and e="+c;
      }
     else if(a.equals(a) && b.equals(b) && c.equals(c) ){
         d="select* from( "; e=" ) as i where "; f=" a='"+a+"'"; g=" and np="+b; h=" and e="+c;
      }
     ArrayList<InmuebleDTO> mecha=inmuebleDAO.consultarinmueble(d, e, f, g, h);
      hs.setAttribute("mecha",mecha);
    response.sendRedirect("consultarinmueble.jsp");
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

<%-- 
    Document   : registrousuarios
    Created on : 13/02/2015, 09:46:15 PM
    Author     : jonatan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Dtos.UsuariosDTO"%>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body >                                          <%
         HttpSession miSesion = request.getSession(false);
            if(miSesion.getAttribute("usuario")==null){
                response.sendRedirect("../login.jsp");
            }else{
                    HttpSession hs = request.getSession(true);
                ArrayList<UsuariosDTO> t=(ArrayList<UsuariosDTO>)hs.getAttribute("uedo");
            
                %> 
              <table class="table table-bordered">
                  <thead style="background-color: #940008; color: #fff;">
      <tr >
        <th>Cedula</th>
        <th>Nombres</th>
        <th>Apellidos</th>
        <th>Direccion</th>
        <th>E-mail</th>
        <th>Eliminar</th>
      </tr> 
    </thead>
    <tbody>
       <% String nombreArchivo = "informe.xls";
                    response.setHeader("Content-Disposition", "attachment; filename=\"" + nombreArchivo + "\"");
                 
                 for(int I =0;I<t.size();I++ ){  %>
                 
                 <tr style="background-color:#ffffff"><td> <%=t.get(I).getCedula() %></td>
                 <td><%=t.get(I).getpNombre()+" "+t.get(I).getsNombre()%></td>
                 <td><%=t.get(I).getpApellido()+" "+t.get(I).getsApellido()%></td>
                 <td><%=t.get(I).getDireccion()%></td>
                 <td><%=t.get(I).getEmail()%></td>
         <%   }}
                 %>
    </tr></tbody>
  </table>        
    </body>
</html>

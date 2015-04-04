<%-- 
    Document   : registrousuarios
    Created on : 13/02/2015, 09:46:15 PM
    Author     : jonatan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Dtos.InmuebleDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
        <!-- InstanceEndEditable -->
                <script type="text/javascript" src="../paging.js"></script>
        <link href="../estilos/style.css" rel="stylesheet" type="text/css">
        <link rel="shortcut icon" href="../imagenes/favicon.ico" >
        <link rel="icon" type="image/gif" href="../imagenes/animated_favicon1.gif" >
        <link rel="stylesheet" href="http://necolas.github.io/normalize.css/3.0.1/normalize.css">
        <link rel="stylesheet" href="http://i.icomoon.io/public/temp/fe3b6e9331/UntitledProject1/style.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="../js/additional-methods.js"></script>
        <script src="../js/jquery.js"></script>
        <script src="../js/jquery.validate.js"></script>
        <!-- TemplateBeginEditable name="head" -->
        <!-- TemplateEndEditable -->
                <%
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setDateHeader("Expires", 0);
%>
    </head>
    <body style="background-image:url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCI+CjxmaWx0ZXIgaWQ9Im4iIHg9IjAiIHk9IjAiPgo8ZmVUdXJidWxlbmNlIHR5cGU9ImZyYWN0YWxOb2lzZSIgYmFzZUZyZXF1ZW5jeT0iMC43IiBudW1PY3RhdmVzPSIxMCIgc3RpdGNoVGlsZXM9InN0aXRjaCI+PC9mZVR1cmJ1bGVuY2U+CjwvZmlsdGVyPgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsbD0iZ3JheSI+PC9yZWN0Pgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsdGVyPSJ1cmwoI24pIiBvcGFjaXR5PSIwLjQiPjwvcmVjdD4KPC9zdmc+); background-size: 20px 20px;">
        <!-- TemplateBeginEditable name="contenido" -->
  <div id="principal" style="background-image: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCI+CjxmaWx0ZXIgaWQ9Im4iIHg9IjAiIHk9IjAiPgo8ZmVUdXJidWxlbmNlIHR5cGU9ImZyYWN0YWxOb2lzZSIgYmFzZUZyZXF1ZW5jeT0iMC43IiBudW1PY3RhdmVzPSIxMCIgc3RpdGNoVGlsZXM9InN0aXRjaCI+PC9mZVR1cmJ1bGVuY2U+CjwvZmlsdGVyPgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsbD0id2hpdGUiPjwvcmVjdD4KPHJlY3Qgd2lkdGg9IjMwMCIgaGVpZ2h0PSIzMDAiIGZpbHRlcj0idXJsKCNuKSIgb3BhY2l0eT0iMC40Ij48L3JlY3Q+Cjwvc3ZnPg==);background-size: 20px 20px;">
            <div id= "emcabezado"> <img src="../imagenes/banner.jpg" width="100%" height="100%"/>
            </div>
       <style type="text/css">
                *{
                    margin:0;
                    padding:0;
                }
                ul{
                    list-style: none;
                }
                ul li {
                    width: 160px;
                    height: auto;
                    padding: 20px;
                    background: #940008;
                }
                ul li a {
                    text-decoration: none;
                    color: #fff;
                    font-size: 1em;
                
                }
                ul li img {
                 margin-right:5px;  
                }
                ul li a:hover{
                    opacity:9;

                }
                  #tabla{
                    float: right;
                    margin-right:10%;
                    width: 70%;
                }
                 #menuvertical{
                    float: left;
                }


                </style>
                                              <%
         HttpSession miSesion = request.getSession(false);
            if(miSesion.getAttribute("usuario")==null){
                response.sendRedirect("../login.jsp");
            }else{
              HttpSession hs = request.getSession(true);
                ArrayList<InmuebleDTO> t=(ArrayList<InmuebleDTO>) hs.getAttribute("inmo"); 
                %> 
                    
                <div id="menuvertical">
            <ul>
                  <li><a href="inicio.jsp"><img src="../imagenes/PNG/user.png"/>Perfil</a> </li>
                <li><a href="usuarios.jsp"><img src="../imagenes/PNG/add-user.png"/>Usuarios</a> </li>
                <li><a href="#"><img src="../imagenes/PNG/bar-graph.png"/>Inmuebles</a> </li>
                <li><a href="visitas.jsp"><img src="../imagenes/PNG/credit-card.png"/>Visitas</a> </li>
                <li><a href="contratos.jsp"><img src="../imagenes/PNG/unread.png"/>Contratos</a> </li>
                <li><a href="solicitudes.jsp"><img src="../imagenes/PNG/new-message.png"/>Solicitudes</a></li>
                <li><a href="../logout.jsp"><img src="../imagenes/PNG/log-out.png"/>Cerrar sesión</a></li></ul>
                    <br> </div>
                <br><br>
                <div id="tabla">
<br><br><br>
                    <table class="table table-bordered" id="results">
                  <thead style="background-color: #940008; color: #fff;">
<tr >
        <th>Direccion</th>
        <th>Propietario</th>
        <th>Barrio</th>
        <th>Localidad</th>
      </tr> 
    </thead>
   <% 
                 
                 for(int I =0;I<t.size();I++ ){  %>
                 
                 <tr style="background-color:#ffffff"><td> <%=t.get(I).getDireccion() %></td>
                 <td><%=t.get(I).getNom() %></td>
                 <td><%=t.get(I).getBarrio()%></td>
                 <td><%=t.get(I).getLocalidad() %></td>               
         <%   }}
                 %>
    </tr></tbody>
  </table>
    <div id="pageNavPosition"></div>
              <script type="text/javascript"><!--
        var pager = new Pager('results', 6); 
        pager.init(); 
        pager.showPageNav('pager', 'pageNavPosition'); 
        pager.showPage(1);
    //--></script>
                    
                    </div>

  </div>
<div class="pie_de_pagina">
<p>Contact us<br>
CL 65 BIS Not 86-50 Office 9-501<br>
SIINMOB (real estate information system)</p> </div>
    </body>
</html>

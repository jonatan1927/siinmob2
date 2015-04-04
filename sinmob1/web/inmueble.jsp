<%-- 
    Document   : inmueble
    Created on : 7/03/2015, 04:23:25 PM
    Author     : jonatan
--%>

<%@page import="Dtos.InmuebleDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- InstanceBeginEditable name="doctitle" -->
<title>SIINMOB</title>
        <link href="estilos/style.css" rel="stylesheet" type="text/css">
        <link rel="shortcut icon" href="imagenes/favicon.ico" >
        <link rel="icon" type="image/gif" href="imagenes/animated_favicon1.gif" >
        <link rel="stylesheet" href="http://necolas.github.io/normalize.css/3.0.1/normalize.css">
        <link rel="stylesheet" href="http://i.icomoon.io/public/temp/fe3b6e9331/UntitledProject1/style.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <link href="siinmob/SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css">
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="js/additional-methods.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/jquery.validate.js"></script>
        <script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
        <!-- Start WOWSlider.com HEAD section -->
	<link rel="stylesheet" type="text/css" href="Administrador/engine1//style.css" media="screen" />
	<script type="text/javascript" src="Administrador/engine1//jquery.js"></script>
<!-- End WOWSlider.com HEAD section -->
    </head>
    <body style="background-image:url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCI+CjxmaWx0ZXIgaWQ9Im4iIHg9IjAiIHk9IjAiPgo8ZmVUdXJidWxlbmNlIHR5cGU9ImZyYWN0YWxOb2lzZSIgYmFzZUZyZXF1ZW5jeT0iMC43IiBudW1PY3RhdmVzPSIxMCIgc3RpdGNoVGlsZXM9InN0aXRjaCI+PC9mZVR1cmJ1bGVuY2U+CjwvZmlsdGVyPgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsbD0iZ3JheSI+PC9yZWN0Pgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsdGVyPSJ1cmwoI24pIiBvcGFjaXR5PSIwLjQiPjwvcmVjdD4KPC9zdmc+); background-size: 20px 20px;">
        <!-- TemplateBeginEditable name="contenido" -->
  <div id="principal" style="background-image: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCI+CjxmaWx0ZXIgaWQ9Im4iIHg9IjAiIHk9IjAiPgo8ZmVUdXJidWxlbmNlIHR5cGU9ImZyYWN0YWxOb2lzZSIgYmFzZUZyZXF1ZW5jeT0iMC43IiBudW1PY3RhdmVzPSIxMCIgc3RpdGNoVGlsZXM9InN0aXRjaCI+PC9mZVR1cmJ1bGVuY2U+CjwvZmlsdGVyPgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsbD0id2hpdGUiPjwvcmVjdD4KPHJlY3Qgd2lkdGg9IjMwMCIgaGVpZ2h0PSIzMDAiIGZpbHRlcj0idXJsKCNuKSIgb3BhY2l0eT0iMC40Ij48L3JlY3Q+Cjwvc3ZnPg==);background-size: 20px 20px;">
            <div id= "emcabezado"> <img src="imagenes/banner.jpg" width="100%" height="100%"/>
            </div>    
<!-- InstanceBeginEditable name="contenido" -->
       <%
                    HttpSession hs = request.getSession(true);
                     hs.getAttribute("idto"); 
                     InmuebleDTO idto= (InmuebleDTO) hs.getAttribute("idto"); 
                %> 
        <table class="table table-bordered" id="results">
                  <thead style="background-color: #940008; color: #fff;">
                      <tr><th colspan="4"> <div align="center"><h3>Oferta inmobiliaria</h3></div></th></tr>
    </thead>
    <tr style="background-color:#ffffff">
      <td width="424"><div align="left">
        <table class="table table-bordered" width="77%" height="169" border="1" align="center" cellspacing="1">
          <tr style="background-color:#ffffff">
            <td width="200"> Tipo de anuncio:</td>
            <td width="100"><%=idto.getAnuncio()%></td>
            </tr>
          <tr style="background-color:#ffffff">
            <td>Localidad:</td>
            <td><%=idto.getLocalidad()%></td>
            </tr>
          <tr style="background-color:#ffffff">
            <td>Barrio:</td>
            <td><%=idto.getBarrio() %></td>
            </tr>
          <tr style="background-color:#ffffff">
            <td>Numero de pisos:</td>
            <td><%=idto.getPisos()%></td>
            </tr>
          <tr style="background-color:#ffffff">
            <td height="43">Habitaciones:</td>
            <td><%=idto.getHabitaciones()%></td>
            </tr>
        </table>
      </div></td>
      <td width="369"><div align="center"></div>
        <div align="center"></div>
        <div align="justify">
          <table class="table table-bordered" width="366" height="150" border="1" cellspacing="1">
            <tr style="background-color:#ffffff">
                <td width="184">Baños:</td>
              <td width="169"><%=idto.getBaños()%></td>
              </tr>
            <tr style="background-color:#ffffff">
              <td>Estrato:</td>
              <td><%=idto.getEstrato()%></td>
              </tr>
            <tr style="background-color:#ffffff">
              <td>Tpo de construcción:</td>
              <td><%=idto.getConstruccion()%></td>
              </tr>
            <tr style="background-color:#ffffff">
              <td>Dirección:</td>
              <td><%=idto.getDireccion()%></td>
              </tr>
            <tr style="background-color:#ffffff">
              <td>Valor ($):</td>
              <td><%=idto.getValor()%></td>
              </tr>
          </table>
        </div></td>
      </tr>
  </table>		

<!-- Start WOWSlider.com BODY section id=wowslider-container1 -->
<div>
<div id="wowslider-container1" style="float: left;width: 40%; margin-left:10%;" >
	<div class="ws_images"><ul>
<li><img src="Administrador/data1/images/thumbnail_4.jpg" alt="Sala" title="Sala" id="wows1_0" /></li>
<li><img src="Administrador/data1/images/thumbnail_5.jpg" alt="Bath" title="Bath" id="wows1_1" /></li>
<li><img src="Administrador/data1/images/thumbnail_6.jpg" alt="Quarter" title="Quarter" id="wows1_2" /></li>
</ul></div>
<div class="ws_thumbs">
<div>
<a href="#" title="Sala"><img src="Administrador/data1/tooltips/thumbnail_4.jpg" alt="" /></a>
<a href="#" title="Bath"><img src="Administrador/data1/tooltips/thumbnail_5.jpg" alt="" /></a>
<a href="#" title="Quarter"><img src="Administrador/data1/tooltips/thumbnail_6.jpg" alt="" /></a>
</div>
</div>
<span class="wsl"><a href="http://wowslider.com">to slider jquery</a> by WOWSlider.com v6.1</span>
	<a href="#" class="ws_frame"></a>
	<div class="ws_shadow"></div>
	</div>
	<script type="text/javascript" src="Administrador/engine1//wowslider.js"></script>
	<script type="text/javascript" src="Administrador/engine1//script.js"></script>
<!-- End WOWSlider.com BODY section -->

  </div>
<div style="float:left ;width: 40%; margin-left:5%;" >
    <p><a href=cita.jsp?cod="+<%=idto.getId()%>"><h4>Solicitar una visita de la oferta</h4></a></p>
  </div>
    </div>
<div class="pie_de_pagina">
<p>Contact us<br>
CL 65 BIS Not 86-50 Office 9-501<br>
SIINMOB (real estate information system)</p> </div>
    </body>
</html>

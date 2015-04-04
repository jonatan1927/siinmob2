<%-- 
    Document   : registrousuarios
    Created on : 13/02/2015, 09:46:15 PM
    Author     : jonatan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIINMOB</title>
        <!-- Start WOWSlider.com HEAD section -->
	<link rel="stylesheet" type="text/css" href="Administrador/engine3//style.css" media="screen" />
	<script type="text/javascript" src="Administrador/engine3//jquery.js"></script>
<!-- End WOWSlider.com HEAD section -->
<!-- InstanceEndEditable -->
        <link href="estilos/style.css" rel="stylesheet" type="text/css">
        <link rel="shortcut icon" href="imagenes/favicon.ico" >
        <link rel="icon" type="image/gif" href="imagenes/animated_favicon1.gif" >
        <link rel="stylesheet" href="http://necolas.github.io/normalize.css/3.0.1/normalize.css">
        <link rel="stylesheet" href="http://i.icomoon.io/public/temp/fe3b6e9331/UntitledProject1/style.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="js/additional-methods.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/jquery.validate.js"></script>
        <link href="estilos/ss.css" rel="stylesheet" type="text/css">
        <link href="estilos/aa.css" rel="stylesheet" type="text/css">
        <style>
            .login{
                width:30%;
                margin-left: 35%;
                border-radius: 10px;
                background-color: #ADD8E6;
            }
            .texto{
                width:30%;
                margin-left: 35%;
                text-align: center;
            }
        </style>
    </head>
    <!-- TemplateBeginEditable name="head" -->
    <!-- TemplateEndEditable -->
    <body style="background-image:url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCI+CjxmaWx0ZXIgaWQ9Im4iIHg9IjAiIHk9IjAiPgo8ZmVUdXJidWxlbmNlIHR5cGU9ImZyYWN0YWxOb2lzZSIgYmFzZUZyZXF1ZW5jeT0iMC43IiBudW1PY3RhdmVzPSIxMCIgc3RpdGNoVGlsZXM9InN0aXRjaCI+PC9mZVR1cmJ1bGVuY2U+CjwvZmlsdGVyPgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsbD0iZ3JheSI+PC9yZWN0Pgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsdGVyPSJ1cmwoI24pIiBvcGFjaXR5PSIwLjQiPjwvcmVjdD4KPC9zdmc+); background-size: 20px 20px;">

        <div id="principal" style="background-image: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCI+CjxmaWx0ZXIgaWQ9Im4iIHg9IjAiIHk9IjAiPgo8ZmVUdXJidWxlbmNlIHR5cGU9ImZyYWN0YWxOb2lzZSIgYmFzZUZyZXF1ZW5jeT0iMC43IiBudW1PY3RhdmVzPSIxMCIgc3RpdGNoVGlsZXM9InN0aXRjaCI+PC9mZVR1cmJ1bGVuY2U+CjwvZmlsdGVyPgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsbD0id2hpdGUiPjwvcmVjdD4KPHJlY3Qgd2lkdGg9IjMwMCIgaGVpZ2h0PSIzMDAiIGZpbHRlcj0idXJsKCNuKSIgb3BhY2l0eT0iMC40Ij48L3JlY3Q+Cjwvc3ZnPg==);background-size: 20px 20px;">
            <div id="emcabezado"> <img src="imagenes/banner.jpg" width="100%" height="100%" />
            </div>
            <header>
                <nav>
            <ul>
              <li><a href="index.jsp"><img src="imagenes/PNG/home.png"/>Inicio</a> </li>
                <li><a href="quienessomos.jsp"><img src="imagenes/PNG/help.png"/>Quienes somos?</a> </li>
                <li><a href="consultarinmueble"><img src="imagenes/PNG/magnifying-glass.png"/>Buscar inmueble</a> </li>
                <li><a href="registrarinmueble.jsp"><img src="imagenes/PNG/bar-graph.png"/>Registrar Inmueble</a> </li>
                <li><a href="contactenos.jsp"><img src="imagenes/PNG/mail.png"/>Contactenos</a> </li>
                <li><a href="#"><img src="imagenes/PNG/user.png"/></span>Usuario</a></li></ul>
                    </nav></header>
            <br>
   <div class="login">

       <form class="form-signin" action="ingresar">
        <h2 class="form-signin-heading">Bienvenidos a S.I.I.N.M.O.B <img src="imagenes/usuario.jpg" width="74" height="76" alt="usuario" /></h2>
        
        <input type="text" class="form-control" placeholder="Usuario" autofocus name="txtusuario"   >
        <input type="password" class="form-control" placeholder="Contraseña" name="txtcontra">
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit"  >Iniciar sesión</button>
      </form>
    </div> 
            <div class="texto">
<p align="center"><a href="" data-toggle="modal" data-target="#ww"> <h5>Recordar su contraseña</h5> </a> </p>
            <p align="center"><a href="registrousuarios.jsp"><h5>Registrarme como usuario</h5> </a> </p>
            <p>${messi}</p>
            
  </div>
<div class="modal fade" id="ww" tabindex="-1"
 role="dialog" aria-labelledby="myModalLabel"
 aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content"> 
  <div class="modal-header"> 
  <button type="button" class="close" 
  data-dismiss="modal" aria-hidden="true"> 
  &times;</button>
      <p align="center"><h1>Recordar  contraseña</h1></p> 
  </div>
  <div class="modal-body">
       <div id="rolo">
           <form class="form-signin" action="">
        <h4 class="form-signin-heading">Documento de Identidad</h4>
        <br>
            <input type="text" class="form-control" placeholder="Documento de Identidad" autofocus>
            <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Enviar</button>
      </form>
      </div>
  </div>
  </div>
  </div>
 </div>
 <script src="https://code.jquery.com/jquery.js"></script> 
 <script src="js/pp.js"></script>
  </body>
</div>
<div class="pie_de_pagina">
<p>Contact us<br>
CL 65 BIS Not 86-50 Office 9-501<br>
SIINMOB (real estate information system)</p> </div>
</div>
</body>
</html>
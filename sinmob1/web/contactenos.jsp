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
        <script src="jqfcntcto.js" type="text/javascript"></script>
		<link rel="stylesheet" href="estilos/ss.css">
		<link rel="stylesheet" href="estilos/stl.css">
		<link href='http://fonts.googleapis.com/css?family=Asap:400,700' rel='stylesheet' type='text/css'>
        		<style type="text/css">
		#forcont{
                width:40%;
                margin-left: 30%;
                border-radius: 10px;
                background-color: #ADD8E6;
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
                <li><a href="#"><img src="imagenes/PNG/mail.png"/>Contactenos</a> </li>
                <li><a href="login.jsp"><img src="imagenes/PNG/user.png"/></span>Usuario</a></li></ul>
                    </nav></header>
		<div id="forcont">
			<div >
				<h1 align="center">Contactenos</h1>
			</div>
			<div class="fcontacto">
				<div class="logito">
                                    <img src="imagenes/animated_favicon1.gif" alt="Contactame">
				</div>
				<form method="POSt" name="fcontacto" id="fcontacto" action="./">
					<div class="row">
						<div class="col-md-6">
							<label>Tu nombre:</label>
							<input type="text" name="name" id="name" class="form-control">
						</div>

						<div class="col-md-6">
							<label>Tu Email:</label>
							<input type="text" name="email" id="email" class="form-control">
						</div>
					</div>
					<label>Asunto:</label>
					<input type="text" name="asunto" id="asunto" class="form-control">
					<label>Tu Mensaje:</label>
					<textarea name="mensaje" id="mensaje" cols="30" rows="10" class="form-control"></textarea>
					<input type="submit" class="btn btn-primary" value="Enviar">

					<div id="respuesta" style="display: none;"></div>
				</form>
			</div>
		</div> 
                        <br>
</div>
<div class="pie_de_pagina">
<p>Contact us<br>
CL 65 BIS Not 86-50 Office 9-501<br>
SIINMOB (real estate information system)</p> </div>
</div>
</body>
</html>
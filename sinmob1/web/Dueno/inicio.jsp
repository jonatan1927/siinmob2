<%-- 
    Document   : registrousuarios
    Created on : 13/02/2015, 09:46:15 PM
    Author     : jonatan
--%>

<%@page import="Dtos.TelefonoDTO"%>
<%@page import="Dtos.UsuariosDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
        <!-- InstanceEndEditable -->
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
                               <%
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setDateHeader("Expires", 0);
%>
        <!-- TemplateBeginEditable name="head" -->
        <!-- TemplateEndEditable -->
    </head>
    <body style="background-image:url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCI+CjxmaWx0ZXIgaWQ9Im4iIHg9IjAiIHk9IjAiPgo8ZmVUdXJidWxlbmNlIHR5cGU9ImZyYWN0YWxOb2lzZSIgYmFzZUZyZXF1ZW5jeT0iMC43IiBudW1PY3RhdmVzPSIxMCIgc3RpdGNoVGlsZXM9InN0aXRjaCI+PC9mZVR1cmJ1bGVuY2U+CjwvZmlsdGVyPgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsbD0iZ3JheSI+PC9yZWN0Pgo8cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjMwMCIgZmlsdGVyPSJ1cmwoI24pIiBvcGFjaXR5PSIwLjQiPjwvcmVjdD4KPC9zdmc+); background-size: 20px 20px;">
   <% HttpSession miSesion = request.getSession(false);
            if(miSesion.getAttribute("usuario")==null){
                response.sendRedirect("../login.jsp");
            }else {
        HttpSession hs = request.getSession(true);
        hs.getAttribute("usuario");
                UsuariosDTO usu = (UsuariosDTO) hs.getAttribute("usuario");  
                hs.getAttribute("telefono");
                TelefonoDTO tl =(TelefonoDTO) hs.getAttribute("telefono");
             %> 
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
                
                #mecha{
                    float: left;
                    width: 40%;
                    margin-left:7.5%;  

                }
                #rojo{
                    float: left;
                    width: 40%;
                    margin-left:5%; 

                }
                #btnreg{
                    float: right;          
                    margin-right:25%; 
                }
                #perfiles{
                    float: right;
                    margin-right:10%;
                    width: 70%;
                }
                 #menuvertical{
                    float: left;
                }
                </style>
                    
                <div id="menuvertical">
            <ul>
                <li><a href="#"><img src="../imagenes/PNG/user.png"/>Perfil</a> </li>
                <li><a href="inmuebles.jsp"><img src="../imagenes/PNG/bar-graph.png"/>Inmuebles</a> </li>
                <li><a href="visitas.jsp"><img src="../imagenes/PNG/credit-card.png"/>Visitas</a> </li>
                <li><a href="contratos.jsp" class="MenuBarItemSubmenu"><img src="../imagenes/PNG/unread.png"/>Contratos</a> </li>
                <li><a href="../logout.jsp"><img src="../imagenes/PNG/log-out.png"/>Cerrar sesión</a></li></ul>
                </div>
                    <br>  
                
                    <div id="perfiles">
                        <br>
                        <br>
                            <form id="contrato" name="contrato" method="get" action="../actualizar">
                <div id="mecha">
                  <div class='form-group'>  
                        <label for="Cedula">Cedula:</label>
                        <input type="text" id="Cedula" name="Cedula" class='form-control'placeholder="Digite su cedula"tabindex="1"
                         value="<%=usu.getCedula()%>"    required>
                    </div> 
                    <div class='form-group'>  
                        <label for="Nom">Primer Nombre:</label>
                        <input type="text" id="Nom" name="Nom" class='form-control'placeholder="Digite su cedula"tabindex="2"
                               value="<%=usu.getpNombre()%>"    required>
                    </div> 
                    <div class='form-group'> 
                        <label for="Nombre">Segundo Nombre:</label>
                        <input type="text" id="Nombre" name="Nombre" class='form-control' placeholder="Digite su nombre" tabindex="3" required 
                               value="<%=usu.getsNombre()%>"  >
                    </div> 
                    <div class='form-group'>
                        <label for="Apellido1">1er Apellido:</label>
                        <input type="text" id="Apellido1" name="Apellido1" class='form-control' placeholder="primer apellido" tabindex="4" required
                               value="<%=usu.getpApellido()%>"  >
                    </div> 
                    <div class='form-group'>   
                        <label for="Apellido2">2do Apellido:</label>
                        <input type="text" id="Apellido2" name="Apellido2" class='form-control' placeholder="segundo apellido"tabindex="5" required
                               value="<%=usu.getsApellido()%>" >
                    </div> 
                </div>

                <div id="rojo">    
                    <div class='form-group'> 
                        <label for="Direccionactual">Dirección actual:</label>
                        <input type="text" id="Direccionactual" name="Direccionactual" class='form-control' placeholder="Direccion del domicilio"tabindex="6" required
                               value="<%=usu.getDireccion() %>" >
                    </div> 
                    <div class='form-group'>    
                        <label for="Telefono">Teléfono:</label>
                        <input type="text" id="Telefono" name="Telefono" class='form-control' placeholder="Numero telefonico"tabindex="7" required
                               value="<%=tl.getNumero()%>">
                    </div> 
                    <div class='form-group'>     
                        <label for="Fecha"> Fecha de nacimiento:</label>
                        <input type="date"  class='form-control' id="Fecha" name="Fecha" placeholder="fecha de solicitud"tabindex="8" required 
                                value="<%=usu.getFecha()%>">
                    </div> 
                    <div class='form-group'>
                        <label for="Sex">Sexo</label> 
                        <select class='form-control' id="Sex"  name="Sex" tabindex="9">
                            <option value="Hombre" <% if ("Hombre".equals(usu.getGenero())){ out.println("selected");} %>>Hombre</option>
                            <option value="Mujer" <% if ("Mujer".equals(usu.getGenero())){ out.println("selected");} %>>Mujer</option>
                        </select>
                    </div>
                    <div class='form-group'>   
                        <label for="EMail">E-Mail:</label>
                        <input type="text" id="EMail" name="EMail" class='form-control' placeholder="Correo electronico"tabindex="10" required
                               value="<%=usu.getEmail() %>" >
                    </div>
                    <input type="text" id="Ced" name="Ced" class='form-control'placeholder="Digite su cedula"tabindex="1"
                         style="display:none" value="<%=usu.getId()%>" required>
                    <br>
                    <div id="btnreg">
                        <button type="submit" class="btn btn-success">Actualizar</button>
                    </div>
                </div>
            </form> <%}%>
                    </div>
            <script>
                // Función ready que ejecuta su contenido al cargar
                $().ready(function () {
                    // Validación del formulario, tener en cuenta el ID
                    $("#contrato").validate({// Aplicación de la funcion validate. A continuación se especifican las reglas y los mensajes
                        // Aplicación de REGLAS de validación
                        rules: {
                            Cedula: {
                                required: true,
                                digits: true, // Validación de un campo que admite solo digitos
                                minlength: 8
                            },
                             Nom: {
                                required: true,
                                minlength: 5
                            },
                            Nombre: {
                                required: true,
                                minlength: 5
                            },
                            Apellido1: {
                                required: true,
                                minlength: 5
                            },
                            Apellido2: {
                                required: true,
                                minlength: 5
                            },
                            Direccionactual: {
                                required: true,
                                minlength: 20
                            },
                            Telefono: {
                                required: true,
                                digits: true, // Validación de un campo que admite solo digitos
                                minlength: 8
                            },
                            Sexo: {
                                required: true,
                                minlength: 5
                            },
                            EMail: {
                                required: true,
                                email: true
                            }
                        }, // Cierre de las reglas, se separa con coma de los mensajes

                        // Mensajes a generar para indicar al usuario la estructura valida que debe ingresar. Se debe indicar por cada regla adicionada anteriormente para sobre escribir los mensajes por defecto (los cuales están en inglés. Se encuentran en "jquery.validate.js" línea 308)
                        messages: {
                            Cedula: {
                                required: "Campo requerido",
                                digits: "Sólo digitos",
                                minlength: "Mínimo {0} caracteres"
                            },
                             Nom: {
                                required: "Campo requerido",
                                minlength: "Mínimo {0} caracteres"
                            },
                            Nombre: {
                                required: "Campo requerido",
                                minlength: "Mínimo {0} caracteres"
                            },
                            Apellido1: {
                                required: "Campo requerido",
                                minlength: "Mínimo {0} caracteres"
                            },
                            Apellido2: {
                                required: "Campo requerido",
                                minlength: "Mínimo {0} caracteres"
                            },
                            Direccionactual: {
                                required: "Campo requerido",
                                minlength: "Mínimo {0} caracteres"
                            },
                            Telefono: {
                                required: "Campo requerido",
                                digits: "Sólo digitos",
                                minlength: "Mínimo {0} caracteres"
                            },
                            Sexo: {
                                required: "Campo requerido",
                                minlength: "Mínimo {0} caracteres"
                            },
                            EMail: {
                                required: "Campo requerido",
                                email: "digite correctamente su correo"
                            }
                        } // Cierre de los mensajesx|
                    }); // Cierre de la función validate
                }); // Cierre de la función ready

                // NOTA: Revise el archivo "additional-methods" (ya enlazado arriba), para obtener otros métodos de validación como "lettersonly" básico para el trabajo de su sistema de información
            </script>
        </div>
<div class="pie_de_pagina">
<p>Contact us<br>
CL 65 BIS Not 86-50 Office 9-501<br>
SIINMOB (real estate information system)</p> </div>
    </body>
</html>

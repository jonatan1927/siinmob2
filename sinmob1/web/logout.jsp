

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Salir del sistema</h1>
        <%
            
            HttpSession miSesion = request.getSession(false);
            if(miSesion.getAttribute("usuario")!=null){
                miSesion.removeAttribute("usuario");
                miSesion.invalidate();
                response.sendRedirect("login.jsp");
            }else{
                response.sendRedirect("login.jsp");
            }
        %>
    </body>
</html>

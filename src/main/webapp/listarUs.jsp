<%-- 
    Document   : listarUs
    Created on : Apr 12, 2026, 11:16:07 PM
    Author     : PC
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <body>
        <%
            List<Usuario> usuarios=(List) request.getSession().getAttribute("listaUsuario");
            int cont=1;
            for(Usuario u:usuarios){   
        %>
        <h1>listar Usuarios</h1>
        
        <p>usuario numero: <%=cont%></p>
        <p>Id: <%=u.getId()  %></p>
        <p>Nombre: <%=u.getNombre()%></p>
        <p>Apellido: <%=u.getApellido()%></p>
        <p>Tipo de sangre: <%=u.getTipoDeSangre()%></p>
        <p>Cargo: <%=u.getCargo()%></p>
        <p>Email: <%=u.getEmail()%></p>
        <p>Password: <%=u.getPassword()%></p>
        
        <% cont=cont + 1;}   %>
        
    </body>
    </body>
</html>

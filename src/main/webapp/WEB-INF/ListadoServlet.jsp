
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Listado de Personas</h1>
        <body>
        <table border="1">
            <caption>Listado de Personas</caption>
            <tr>
                <th>Id Persona</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Teléfono</th>
            </tr>
            <c:forEach var="persona" items="${personas}" >
                <tr>
                    <td>${persona.idPersona}</td>
                    <td>${persona.nombre}</td>
                    <td>${persona.apellido}</td>
                    <td>${persona.email}</td>
                    <td>${persona.telefono}</td>
                </tr>
            </c:forEach>
        </table>
        
        
        
        
        
    </body>
</html>

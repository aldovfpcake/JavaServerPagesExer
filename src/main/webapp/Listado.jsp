
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <%@include file="header.jsp"%>  
        <title>Listado de Personas </title>
    </head>
    
        <div class ="container " />
        <div class="col-12  mb-3 mt-5 " >
            <a href ="<%=request.getContextPath()%>/AgregarPersona" class="btn btn-primary" type="submit">Agregar </a>
        </div>
        <h1>Listado de Personas</h1>
         <table class="table">
            <thead>
              <tr>
                <th scope="col">Id</th>
                <th scope="col">Nombre</th>
                <th scope="col">Apellido</th>
                <th scope="col">email</th>
                <th scope="col">Telefono</th>
              </tr>
            </thead>
            <tbody>
                      <c:forEach var="persona" items="${personas}" >
                      <tr>
                      <td>${persona.idPersona}</td>
                      <td>${persona.nombre}</td>
                      <td>${persona.apellido}</td>
                      <td>${persona.email}</td>
                      <td>${persona.telefono}</td>
                      </tr>
                      </c:forEach>     
                </tbody>
             </table>
          </div>
    
</html>

<%-- 
    Document   : agregarper
    Created on : 27 nov. 2021, 16:55:43
    Author     : avlea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <%@include file="header.jsp"%>  
        <title>Agregar Persona</title>
    </head>
    <body>
        <div class ="container-sm">
        <nav style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
            <ol class="breadcrumb mt-5">
              <li class="breadcrumb-item"><a href ="<%=request.getContextPath()%>/ListadoServlet">Regresar</a></li>
            </ol>
        </nav>
         
          <h1>Agregar Persona</h1>
          <form action="Altaper" method = "post">
               <div class="mb-3">
                 <label for="exampleInputEmail1" class="form-label">Nombre</label>
                 <input type="text" class="form-control" id="nombre" aria-describedby="emailHelp" name="nombre" >
                </div>
                <div class="mb-3">
                 <label for="exampleInputEmail1" class="form-label">Apellido</label>
                 <input type="text" class="form-control" id="apellido" aria-describedby="emailHelp" name ="apellido" >
                </div>
                <div class="mb-3">
                  <label for="exampleInputEmail1" class="form-label">Email</label>
                  <input type="text" class="form-control" id="email" aria-describedby="emailHelp" name="email">
                </div>
                <div class="mb-3">
                  <label for="exampleInputEmail1" class="form-label">Telefóno</label>
                  <input type="text" class="form-control" id="telefono" aria-describedby="emailHelp" name="telefono">
                </div>
                
                <button type="submit" class="btn btn-primary">Submit</button>
             </form>
          
          
          <div>
        </body>
</html>

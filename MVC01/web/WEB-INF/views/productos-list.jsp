<%-- 
    Document   : productos-list
    Created on : 11-18-2022, 07:43:01 PM
    Author     : LC
--%>

<%@page import="java.util.List"%>
<%@page import="com.models.Estudiante"%>
<%
  List<Estudiante> result = (List<Estudiante>)  request.getAttribute("estudiantes");
    
%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
    </head>
    <body>
        
       <section class="container">
           <a href="<%=request.getContextPath()%>/form" class="btn btn-primary">Nuevo</a>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Telefono</th>
                    <th>DUI</th>
                    <th>Municipio</th>
                    <th></th>
                </tr>
            </thead>   
            <tbody>
                <% for(Estudiante item: result ){%>
                <tr>
                    <td><%=item.getEstudianteId()%></td>
                    <td><%=item.getNombre()%></td>
                    <td><%=item.getApellido()%></td>
                    <td><%=item.getTelefono()%></td>
                    <td><%=item.getDui()%></td>
                    <td><%=item.getMunicipio()%></td>
                    <td></td>
                </tr>
                <%}%>
                
            </tbody> 
        </table>
    </section>
       
    </body>
</html>

<%-- 
    Document   : index
    Created on : 10-28-2022, 07:07:53 PM
    Author     : LC
--%>
<%@page import="java.util.List"%>
<%@page import="com.Models.*"%>

<%!    
    List<Recipe > _list;    
%>

<%    
    _list = (List<Recipe >) request.getAttribute("recipes");
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categorias</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styles.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h2> Listado de recetas </h2>
                <div class="col-10">
                    
                    <% for(Recipe item : _list){ %>
                        <div class="content">
                            <a href="">
                                <img src="images/<%=item.getImagePath() %>" alt="">
                                <div class="bg"></div>
                                <div class="title"><%= item.getName() %></div>                            
                            </a>
                        </div>
                    <% }%>
                    
                    
                </div>
            </div>    
        </div>
        
    </body>
</html>


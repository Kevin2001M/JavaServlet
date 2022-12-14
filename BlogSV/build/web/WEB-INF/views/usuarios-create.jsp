<% HttpSession usuario = (HttpSession) request.getSession(); %>
<%@page import="Models.Entities.Usuario"%>
<%@page import="java.util.List"%>
<%
  List<Usuario> result = (List<Usuario>)  request.getAttribute("usuarios");
    
%>



<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <title>Mi Blog</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/dashboard/">

    <!-- Bootstrap core CSS -->

<link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- Favicons -->

<meta name="msapplication-config" content="/docs/4.5/assets/img/favicons/browserconfig.xml">
<meta name="theme-color" content="#563d7c">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    
    <link rel="stylesheet" href="css/dashboard.css">
  </head>
  <body>
    <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="#">Company name</a>  
  <ul class="navbar-nav px-3">
    <li class="nav-item text-nowrap">
      <a class="nav-link" href="#">${usuario.getNickName()}</a>
      <a class="nav-link" href="#">Cerrar sesion</a>
    </li>
  </ul>
</nav>


<div class="container-fluid">
  <div class="row">
    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="sidebar-sticky pt-3">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link active" href="#">
              <span data-feather="home"></span>
              Dashboard <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/dashboard?action=publicaciones" >
              <span data-feather="file"></span>
              Publicaciones
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/dashboard?action=categorias"">
              <span data-feather="shopping-cart"></span>
              Categorias
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/dashboard?action=usuarios"">
              <span data-feather="users"></span>
              Usuarios
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/dashboard?action=publicaciones-categorias"">
              <span data-feather="bar-chart-2"></span>
              Publicaciones por categorias
            </a>
          </li>          
        </ul>      
      </div>
    </nav>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Dashboard</h1>
        <div class="btn-toolbar mb-2 mb-md-0">
          <div class="btn-group mr-2">
            
          </div>
          
        </div>
      </div>     

      <h2>Crear usuarios</h2>
       <div class="row">
            <div class="col-4 offset-4">                

                <form action="" method="post">
                        <div class="mb-3">                    
                            <input type="text" name="nickname" class="form-control" placeholder="nickname">
                        </div>  
                        <div class="mb-3">                    
                            <input type="text" name="nombre"  class="form-control" placeholder="nombre">
                        </div>                                                                               

                        <div class="mb-3">                    
                            <input type="password" name="pwd" class="form-control" placeholder="contrase?a">
                        </div> 
                       
                        <input type="hidden" name="nuevousuario">
                    
                        <div class="mb-3">                    
                            <input type="submit" value="Guardar" class="btn btn-primary">
                        </div> 
                </form>
            </div>
        </div>
      </div>
    </main>

  </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="/docs/4.5/assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="/docs/4.5/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/feather-icons@4.9.0/dist/feather.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/chart.js@2.7.3/dist/Chart.min.js"></script>
        <script src="js/dashboard.js"></script></body>
</html>
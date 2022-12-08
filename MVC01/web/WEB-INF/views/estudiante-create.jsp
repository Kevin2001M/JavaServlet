<%-- 
    Document   : productos-list
    Created on : 11-18-2022, 07:43:01 PM
    Author     : LC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/styles.css">        
</head>
<body>
    <section class="container-fluid">

        <div class="row">
            <div class="col-4 offset-4">
                <h2>Registro de estudiantes</h2>

                <form action="" method="post">
                        <div class="mb-3">                    
                            <input type="text" name="nombre" class="form-control" placeholder="Nombre">
                        </div>  
                        <div class="mb-3">                    
                            <input type="text" name="apellido"  class="form-control" placeholder="Apellido">
                        </div>                                                                               

                        <div class="mb-3">                    
                            <input type="tel" name="telefono" class="form-control" placeholder="Telefono">
                        </div> 

                        <div class="mb-3">                    
                            <input type="text" name="dui" class="form-control" placeholder="Dui">
                        </div> 

                        <div class="mb-3">                    
                            <input type="text" name="municipio" class="form-control" placeholder="Municipio">
                        </div> 

                        <div class="mb-3">                    
                            <input type="submit" value="Guardar" class="btn btn-primary">
                        </div> 
                </form>
            </div>
        </div>
        

        
    </section>

    
</body>
</html>


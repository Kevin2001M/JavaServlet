

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" >
	<link rel="stylesheet" href="css/styles.css">
</head>

<body class="text-center">
    <form action="<%=request.getContextPath()%>/Usuarios" class="form-signin" method="post">
		
	  	<h1 class="h3 mb-3 font-weight-normal">Registro de usuario</h1>
	  	<label for="inputEmail" class="sr-only">Email</label>
	  	<input type="email" id="inputEmail" name="email" class="form-control" placeholder="Correo electronico" required autofocus>

	  	<label for="inputEmail" class="sr-only">Nombre</label>
	  	<input type="text" name="nombre" class="form-control" placeholder="Nombre de usuario" required>
	  	
	  	<label for="inputEmail" class="sr-only">Nick</label>
	  	<input type="text"  class="form-control" name="nick" placeholder="Apodo de usuario" required >	  	
	  
	  	<label for="inputPassword" class="sr-only">Password</label>
	  	<input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
                
                <input type="hidden" name="registro">

	  	<button class="btn btn-lg btn-primary btn-block" type="submit">Registrar</button>
	  	
	  	<p class="mt-5 mb-3 text-muted">&copy; 2020</p>
	</form>
</body>
</html>

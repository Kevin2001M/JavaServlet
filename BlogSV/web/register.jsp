

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
    <form action="<%=request.getContextPath()%>/usuario" class="form-signin" method="post">
		
	  	<h1 class="h3 mb-3 font-weight-normal">Registro de usuario</h1>
	  	<label for="inputEmail" class="sr-only">Email</label>
	  	<input type="text" id="inputEmail" name="nickname" class="form-control" placeholder="Nickname" required autofocus>

	  	<label for="inputEmail" class="sr-only">Nombre</label>
	  	<input type="text" name="nombre" class="form-control" placeholder="Nombre de usuario" required>	  		  	
	  
	  	<label for="inputPassword" class="sr-only">Password</label>
	  	<input type="password" id="inputPassword" name="pwd" class="form-control" placeholder="Password" required>
                
                <input type="hidden" name="registro" value="registro">

	  	<button class="btn btn-lg btn-primary btn-block" type="submit">Registrar</button>
	  	
	  	<p class="mt-5 mb-3 text-muted">&copy; 2022</p>
	</form>
</body>
</html>
